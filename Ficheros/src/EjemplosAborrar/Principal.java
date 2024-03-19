package EjemplosAborrar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String args[]) {
		try (RandomAccessFile ficheroFactura = new RandomAccessFile(
				"c:" + File.separator + "ficheros" + File.separator + "Facturas" + File.separator + "marzo.dat",
				"rw");) {

			// Insertarmos facturas en la lista.
			List<Factura> entradaFacturas = new LinkedList<>();
			entradaFacturas.add(new Factura(1, "LUZ", 30.5));
			entradaFacturas.add(new Factura(2, "AGUA", 35.5));
			entradaFacturas.add(new Factura(3, "GAS", 60.5));
			entradaFacturas.add(new Factura(4, "ALIMENTOS", 230.5));
			entradaFacturas.add(new Factura(5, "INTERNET", 23.5));
			// Intoducir los datos en en el fichero.
			for (Factura f : entradaFacturas) {
				ficheroFactura.writeInt(f.getId());
				StringBuffer nombre = new StringBuffer(f.getNombre());
				nombre.setLength(5);// Limitamos tamaño String.
				ficheroFactura.writeChars(nombre.toString());// Ojo! Debe ser toString
				ficheroFactura.writeDouble(f.getImporte());
			}
			// 4bytes + (5*2) + 8 = 22
			
			ficheroFactura.seek(44);//Fijamos desde que posición leer
			System.out.println(ficheroFactura.readInt());
			String cadena ="";
			for(int n=0;n<5;n++) {
				cadena += ficheroFactura.readChar();//Lo he obtenido así porque si hago una lectura de String me da error.
			}
			System.out.println(cadena);
			System.out.println(ficheroFactura.readDouble());

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}

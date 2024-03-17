package RandomAccesFileFactura;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static final int  NUM_BYTE_REGISTRO = 33;//4+(20)+8+1 = 33
	public static final int NUM_MAX_CARACTERES = 10;
	public static void main(String args[]) {
		List<Factura> arrayFacturas = new ArrayList<>();
		
		arrayFacturas.add(new Factura(1,"LUZ",48,true));
		arrayFacturas.add(new Factura(2,"AGUA",48.50,false));
		arrayFacturas.add(new Factura(3,"GAS",50,true));
		arrayFacturas.add(new Factura(4,"BUTANO",55,true));
		arrayFacturas.add(new Factura(5,"ALIMENTACIÓN",63,true));
		
		
		
		try (RandomAccessFile fichero = new RandomAccessFile("c:/ficheros/facturas/facturaMarzo.dat", "rw")){
			for(Factura f:arrayFacturas) {
				fichero.writeInt(f.getId());
				StringBuffer cadena = new StringBuffer(f.getNombre());
				cadena.setLength(10);
				fichero.writeChars(cadena.toString());
				fichero.writeDouble(f.getImporte());
				fichero.writeBoolean(f.isPagada());
				
			}
			
			//Leer fichero.
			
			for(int n=0;n<fichero.length();n+=33) {
				fichero.seek(n);
				int id = fichero.readInt();
				String nombre="";
				for(int l=0;l<NUM_MAX_CARACTERES;l++) {
					nombre+=fichero.readChar();
				}
				double importe = fichero.readDouble();
				boolean pagada = fichero.readBoolean();
				System.out.printf("- %d %s %.2f€ %s %n",
						id,nombre,importe,pagada?"FACTURA ABONADA":"PENDIENTE PAGO");
			}
			
			//Obtener un valor por id
			System.out.println("\nMOSTRAR UN REGISTRO DADO UN ID \n");
			
			String registro = getById(fichero,2);
			System.out.println(registro);
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	
		
	}
	//Métodos
	public static String getById(RandomAccessFile fichero, int id) {
		String cadena = "";
		try {
			fichero.seek(id*NUM_BYTE_REGISTRO);
			id = fichero.readInt();
			String nombre="";
			for(int l=0;l<NUM_MAX_CARACTERES;l++) {
				nombre+=fichero.readChar();
			}
			double importe = fichero.readDouble();
			boolean pagada = fichero.readBoolean();
			cadena= String.format("- %d %s %.2f€ %s %n",
					id,nombre,importe,pagada?"FACTURA ABONADA":"PENDIENTE PAGO");
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		return cadena;
	}

}

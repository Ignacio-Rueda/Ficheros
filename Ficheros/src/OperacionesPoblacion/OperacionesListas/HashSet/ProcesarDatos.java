package OperacionesPoblacion.OperacionesListas.HashSet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ProcesarDatos {
	Set<Persona> listadoPersonas = new HashSet<>();// Almacena el listado de personas le�das en el fichero.

	/**
	 * 1� Lee los datos almacenados en un fichero. 2� Instancia la clase persona. 3�
	 * Almacenamos los datos en una lista.
	 */
	public void lecturaDatos() {
		String arrayEntradaDatos[];
		final String ruta = "c:/ficheros/VecinosJaen/jaen.txt";
		try (FileReader fichero = new FileReader(ruta); BufferedReader br = new BufferedReader(fichero)) {
			String cadena = "";
			while (cadena != null) {
				cadena = br.readLine();
				if (cadena != null) {
					arrayEntradaDatos = cadena.split(";");
					// Posici�n 0:Nombre Posic�n1:1apellido Posici�n2:2apellido Posici�n3:Dni
					// Posici�n4:Fecha Posici�n5: Poblaci�n
					listadoPersonas.add(new Persona(arrayEntradaDatos[0], arrayEntradaDatos[1], arrayEntradaDatos[2],
							arrayEntradaDatos[3], LocalDate.parse(arrayEntradaDatos[4]), arrayEntradaDatos[5]));
				}

			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}// Final m�todo.

	/**
	 * Muestra todos los datos. (La fecha aparece formateada)
	 */
	public void mostrarDatos() {
		for (Persona p : listadoPersonas) {
			System.out.println(p);
		}
	}
	/**
	 * Muestra solo nombre y edad.
	 */
	public void mostrarNombreYedad() {
		for (Persona p : listadoPersonas) {
			System.out.printf("NOMBRE:%s EDAD:%d a�os.%n", p.getNombre(), p.getEdadActual());
		}
	}

}

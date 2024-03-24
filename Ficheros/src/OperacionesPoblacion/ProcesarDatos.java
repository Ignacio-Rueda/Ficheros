package OperacionesPoblacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ProcesarDatos {
	List<Persona> listadoPersonas = new LinkedList<>();// Almacena el listado de personas le�das en el fichero.

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
		System.out.printf(
				"-----------------------------------\nMOSTRAR DATOS CON FECHA FORMATEADA\n-----------------------------------\n");
		for (Persona p : listadoPersonas) {
			System.out.println(p);
		}
	}
	/**
	 * Muestra solo nombre y edad.
	 */
	public void mostrarNombreYedad() {
		System.out.printf(
				"-----------------------------------\nMOSTRAR DATOS NOMBRE Y EDAD\n------------------------------------------\n");
		for (Persona p : listadoPersonas) {
			System.out.printf("NOMBRE:%s EDAD:%d a�os.%n", p.getNombre(), p.getEdadActual());
		}
	}
	/**
	 * Ordenar datos.
	 */
	public void ordenarDatos() {
		
	}

}

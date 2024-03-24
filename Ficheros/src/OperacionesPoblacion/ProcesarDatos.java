package OperacionesPoblacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ProcesarDatos {
	List<Persona> listadoPersonas = new LinkedList<>();// Almacena el listado de personas leídas en el fichero.

	/**
	 * 1º Lee los datos almacenados en un fichero. 2º Instancia la clase persona. 3º
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
					// Posición 0:Nombre Posicón1:1apellido Posición2:2apellido Posición3:Dni
					// Posición4:Fecha Posición5: Población
					listadoPersonas.add(new Persona(arrayEntradaDatos[0], arrayEntradaDatos[1], arrayEntradaDatos[2],
							arrayEntradaDatos[3], LocalDate.parse(arrayEntradaDatos[4]), arrayEntradaDatos[5]));
				}

			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}// Final método.

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
			System.out.printf("NOMBRE:%s EDAD:%d años.%n", p.getNombre(), p.getEdadActual());
		}
	}
	/**
	 * Ordenar datos.
	 */
	public void ordenarDatos() {
		
	}

}

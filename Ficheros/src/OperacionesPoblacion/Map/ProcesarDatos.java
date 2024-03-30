package OperacionesPoblacion.Map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProcesarDatos {
	
	Map<String,Persona> mapaPersona = new HashMap<>();

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
					mapaPersona.put(arrayEntradaDatos[3], new Persona(arrayEntradaDatos[0], arrayEntradaDatos[1], arrayEntradaDatos[2],arrayEntradaDatos[3], LocalDate.parse(arrayEntradaDatos[4]), arrayEntradaDatos[5]));
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
		for(Map.Entry<String,Persona> pareja:mapaPersona.entrySet()) {
			System.out.printf("DNI: %s NOMBRE:%s%n",pareja.getKey(),pareja.getValue().getNombre());
		}
	}
	
	public boolean addDatos(String dni,Persona p) {
		boolean existe = false;
		for(Map.Entry<String,Persona > par:mapaPersona.entrySet()) {
			if(par.getKey().equalsIgnoreCase(dni)) {
				existe = true;
			}
		}
		
		if(!existe) {
			mapaPersona.put(dni, p);
		}
		return false;
	}


}

package OperacionesPoblacion.OperacionesListas;

import java.util.Collections;

public class Principal {

	public static void main(String args[]) {
		ProcesarDatos pDatos = new ProcesarDatos();
		// Leemos los datos introducidos en el fichero.
		try {
			pDatos.lecturaDatos();
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

		// Mostrar datos
		System.out.printf("\nDatos sin ordenar.\n");
		pDatos.mostrarNombreYedad();

		// Ordenar
		System.out.printf("\nDatos ordenados por edad.\n");
		Collections.sort(pDatos.listadoPersonas, new OrdenarPorEdad());
		// Mostrar datos
		pDatos.mostrarNombreYedad();

		// Ordenar
		Collections.sort(pDatos.listadoPersonas, new OrdenarPorLongitudNombre());
		System.out.printf("\nDatos ordenados por longitud del nombre.\n");
		// Mostrar datos
		pDatos.mostrarNombreYedad();

		// Ordenar
		Collections.sort(pDatos.listadoPersonas, new OrdenarAlfabeticamente());
		System.out.printf("\nDatos ordenados alfabéticamente.\n");
		// Mostrar datos
		pDatos.mostrarNombreYedad();

	}
}

package OperacionesPoblacion.Map;

import java.time.LocalDate;

public class Principal {

	public static void main(String args[]) {
		ProcesarDatos pDatos = new ProcesarDatos();
		// Leemos los datos introducidos en el fichero.
		try {
			pDatos.lecturaDatos();
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

		pDatos.mostrarDatos();
		
		boolean resp = pDatos.addDatos("26049351B", new Persona("nacho","rueda","delgado","26049351B",LocalDate.parse("1989-10-26"),"Alcalá la real"));
		System.out.println(resp);
		pDatos.mostrarDatos();
	}
}

package OperacionesPoblacion.OperacionesListas.HashSet;

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

	

	}
}

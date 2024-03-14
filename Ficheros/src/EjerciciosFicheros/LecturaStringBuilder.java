package EjerciciosFicheros;

import java.io.IOException;

public class LecturaStringBuilder {

	public static void main(String[] args) {
		/***
		 * Si est�s trabajando en un entrono multi-hilo, donde varias hebras podr�an
		 * acceder y modificar la misma cadena al mismo tiempo,StringBuffer es la opci�n
		 * m�s segura. Pero si est�s en un entorno de un solo hilo o tienes la certeza
		 * de que no habr� problemas de concurrencia, "StringBuilder" es preferible
		 * debido a su mejor rendimiento.
		 */
		StringBuilder str = new StringBuilder();
		char c;
		try {
			while ((c = (char) System.in.read()) != '\n') {
				str.append(c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.printf("La cadena introducida es: %s", str.toString());

	}

}

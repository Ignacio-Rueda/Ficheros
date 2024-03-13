package EjerciciosFicheros;

import java.io.IOException;

public class LecturaSystem {

	public static void main(String[] args) {
		/**
		 * ¿Qué es System.in.read()? Lee un byte de la corriente de entrada estándar,
		 * generalmente conectado al teclado u otra fuente. Proporciona un mecanismo de
		 * bajo nivel para la lectura de entrada orientada a byte. IMPORTANTE:
		 * System.in.read() lee sólo un solo byte a la vez. Si necesitamos leer una
		 * línea entera o manejar diferentes tipos de datos, es posible que necesitemos
		 * utilizar otros métodos o clases como BurreredReader. System.in.read() puede
		 * leer de varias fuentes, incluyendo archivos, conexiones de red e interfaces
		 * de usuario.(Lectura de archivos de configuración, gestión de la comunicación
		 * cliente-servidor, interacción con bbdd...)
		 */
		int unicodeNumber;
		System.out.println("Ingrese un carácter \n");

		try {//Lee un byte
			unicodeNumber = System.in.read();
			//Devuelve un número entero que representa el valor ASCII
			System.out.println(unicodeNumber);
			//Devuelve el valor introducido.
			System.out.println((char)65);
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}

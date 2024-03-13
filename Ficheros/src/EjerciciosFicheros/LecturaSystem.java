package EjerciciosFicheros;

import java.io.IOException;

public class LecturaSystem {

	public static void main(String[] args) {
		/**
		 * �Qu� es System.in.read()? Lee un byte de la corriente de entrada est�ndar,
		 * generalmente conectado al teclado u otra fuente. Proporciona un mecanismo de
		 * bajo nivel para la lectura de entrada orientada a byte. IMPORTANTE:
		 * System.in.read() lee s�lo un solo byte a la vez. Si necesitamos leer una
		 * l�nea entera o manejar diferentes tipos de datos, es posible que necesitemos
		 * utilizar otros m�todos o clases como BurreredReader. System.in.read() puede
		 * leer de varias fuentes, incluyendo archivos, conexiones de red e interfaces
		 * de usuario.(Lectura de archivos de configuraci�n, gesti�n de la comunicaci�n
		 * cliente-servidor, interacci�n con bbdd...)
		 */
		int unicodeNumber;
		System.out.println("Ingrese un car�cter \n");

		try {//Lee un byte
			unicodeNumber = System.in.read();
			//Devuelve un n�mero entero que representa el valor ASCII
			System.out.println(unicodeNumber);
			//Devuelve el valor introducido.
			System.out.println((char)65);
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}

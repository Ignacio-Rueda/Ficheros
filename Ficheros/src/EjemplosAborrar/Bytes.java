package EjemplosAborrar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes {

	public static void main(String args[]) {
		try {
			FileInputStream leerBytes = new FileInputStream(
					"c:" + File.separator + "ficheros" + File.separator + "imagenes" + File.separator + "tigre.jpg");
			int[] arrayImagen = new int[150873];
			int contadorBytes = 0;
			int byteLeido = 0;
			while (byteLeido != -1) {
				byteLeido = leerBytes.read();
				if (byteLeido != -1) {
					System.out.println(byteLeido);
					arrayImagen[contadorBytes] = byteLeido;
					contadorBytes++;
				}

			}
			leerBytes.close();
			// Generamos una copia de la imagen leida

			FileOutputStream escribirBytes = new FileOutputStream(
					"c:" + File.separator + "ficheros" + File.separator + "imagenes" + File.separator + "copiaTigre.jpg");
			for(Integer n : arrayImagen) {
				escribirBytes.write(n);
			}
			escribirBytes.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

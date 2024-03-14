package PildorasInformaticas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SobreBytes {
	static void copiarImagen(int[]arrayImagen) {
		try {
			FileOutputStream copiaImagen = new FileOutputStream("c:/ficheros/copiaTigre1.jpg");
			for(int n=0;n<arrayImagen.length;n++) {
				copiaImagen.write(arrayImagen[n]);
			}
			copiaImagen.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		int arrayImagen [] = new int[150873];
		int contadorBytes = 0;
		try {
			FileInputStream imagenBytes = new FileInputStream("c:/ficheros/tigre.jpg");
			
			int byteLeido = 0;
			while(byteLeido != -1) {
				byteLeido = imagenBytes.read();
				if(byteLeido != -1) {
					arrayImagen[contadorBytes]=byteLeido;
					contadorBytes++;
					System.out.println(byteLeido);
				}
			}
			imagenBytes.close();
			System.out.println(contadorBytes);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		copiarImagen(arrayImagen);		
	}
	

}

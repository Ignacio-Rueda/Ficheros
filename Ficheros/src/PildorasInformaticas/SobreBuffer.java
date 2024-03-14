package PildorasInformaticas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SobreBuffer {
	
	
	public static void main(String args[]) {
		
	/**
	 * Un Buffer es una especie de memoria interna que se coloca entre medias de nuestro programa java y el archivo externo.
	 * 
	 * El objetivo de la memoria intermedia es: En lugar de acceder directamente desde nuestro c�digo java al archivo, lo hagamos a esta memoria intermedia,
	 * de manera que:
	 * 
	 * -La informaci�n contenida en el archivo de texto se vuelva COMPLETAMENTE al Buffer, se almacena en ese Buffer y una vez que la informaci�n del archivo est� �ntegramente
	 * en el Buffer, es nuestro programa Java, quien accede a ese Buffer para ir descargando poco a poco esa informaci�n. De este modo se gana en rapidez y eficiencia.
	 * 
	 * 
	 * El Buffer lo podemos utilizar tanto para escribir como para leer informaci�n de un fichero externo-> BufferReader BufferWriter.
	 * 
	 * Adem�s BufferReader tiene m�todos que nos van a ser muy �tiles. Por ejemplo: readLine(), que lee l�nea a l�nea el texto que hay en un archivo, del mismo modo ocurre con BufferReader.
	 */
	
		
		
		//BufferedWriter
		try {
			FileWriter fw = new FileWriter("c:/ficheros/datos.txt",true);
			BufferedWriter bf = new BufferedWriter(fw);
			
			bf.write("Me parece, que las horas que son, ya no viene el banco.");
			bf.flush();//Asegura que cualquier buffer de salida interno, se vac�e y se escriban los datos en el archivo de destino.
			fw.close();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		//BufferedReader
		try {
			FileReader fr = new FileReader("c:/ficheros/datos.txt");
			BufferedReader br = new BufferedReader(fr);
			String cadena;
			cadena = br.readLine();
			while(cadena !=null) {
				System.out.println(cadena);
				cadena = br.readLine();
			}
			fr.close();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}

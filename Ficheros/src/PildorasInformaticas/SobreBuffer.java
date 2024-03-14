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
	 * El objetivo de la memoria intermedia es: En lugar de acceder directamente desde nuestro código java al archivo, lo hagamos a esta memoria intermedia,
	 * de manera que:
	 * 
	 * -La información contenida en el archivo de texto se vuelva COMPLETAMENTE al Buffer, se almacena en ese Buffer y una vez que la información del archivo está íntegramente
	 * en el Buffer, es nuestro programa Java, quien accede a ese Buffer para ir descargando poco a poco esa información. De este modo se gana en rapidez y eficiencia.
	 * 
	 * 
	 * El Buffer lo podemos utilizar tanto para escribir como para leer información de un fichero externo-> BufferReader BufferWriter.
	 * 
	 * Además BufferReader tiene métodos que nos van a ser muy útiles. Por ejemplo: readLine(), que lee línea a línea el texto que hay en un archivo, del mismo modo ocurre con BufferReader.
	 */
	
		
		
		//BufferedWriter
		try {
			FileWriter fw = new FileWriter("c:/ficheros/datos.txt",true);
			BufferedWriter bf = new BufferedWriter(fw);
			
			bf.write("Me parece, que las horas que son, ya no viene el banco.");
			bf.flush();//Asegura que cualquier buffer de salida interno, se vacíe y se escriban los datos en el archivo de destino.
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

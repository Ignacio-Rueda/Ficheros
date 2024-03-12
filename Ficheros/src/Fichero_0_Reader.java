import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero_0_Reader {
	
	public static void main(String args[]) {
		//LECTURA DE FICHEROS EN JAVA: FILEREADER Y BUFFEREDREADER
		FileReader fr = null;
		/**
		 * El método readLine() para leer líneas de texto del fichero (String).Devuelve NULL cuando no hay más líneas para leer.
		 * El método read() para leer carácter a carácter. Devuelve un entero que representa el código Unicode del carácter leído. -1 si no hay más caracteres.
		 */
		try {
			fr =  new FileReader("c:/ficheros/datos.txt"); //Admite ruta u objeto. FileReader
			BufferedReader bf = new BufferedReader(fr);
			String cadena = bf.readLine();
			while(cadena!=null) {
				System.out.println(cadena);
				cadena = bf.readLine();
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				if(fr!=null) { //Es necesario porque si ocurre una excepción durante la inicialización del FileReader (p ejemplo el archivo no se encuentra) el valor fr, permanecerá null y lanzará una excepción NullPointer.
					fr.close();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}

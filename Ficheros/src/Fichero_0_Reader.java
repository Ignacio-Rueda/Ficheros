import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero_0_Reader {
	
	public static void main(String args[]) {
		//LECTURA DE FICHEROS EN JAVA: FILEREADER Y BUFFEREDREADER
		FileReader fr = null;
		/**
		 * El m�todo readLine() para leer l�neas de texto del fichero (String).Devuelve NULL cuando no hay m�s l�neas para leer.
		 * El m�todo read() para leer car�cter a car�cter. Devuelve un entero que representa el c�digo Unicode del car�cter le�do. -1 si no hay m�s caracteres.
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
				if(fr!=null) { //Es necesario porque si ocurre una excepci�n durante la inicializaci�n del FileReader (p ejemplo el archivo no se encuentra) el valor fr, permanecer� null y lanzar� una excepci�n NullPointer.
					fr.close();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}

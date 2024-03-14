package EjerciciosFicheros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero_0_Practica_Reader {

	public static void main(String args[]) {
		
		//Lectura fichero.
		FileReader fr = null;
		BufferedReader br = null;
	
		try {
			fr = new FileReader("c:/ficheros/datos");
			br = new BufferedReader(fr);
			
			String linea = br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("AHORA VAMOS A LEER CARÁCTER A CARÁCTER");
		System.out.println("--------------------------------------");
		
		try {
			fr = new FileReader("c:/ficheros/caracter.txt");
			br = new BufferedReader(fr);
			int character = br.read();
			while(character != -1) {
				System.out.println((char)character);
				character = br.read();
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}
}

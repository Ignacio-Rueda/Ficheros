import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fichero_0Practica_Writer {
	
	
	public static void main(String args[]){
	
		
		Scanner teclado = new Scanner(System.in);
		PrintWriter salida = null;
		
		
		try {
			salida = new PrintWriter("c:/ficheros/datos.txt");
			String cadena;
			System.out.println("Introduce texto a guardar");
			cadena = teclado.nextLine();
			while(!(cadena.equalsIgnoreCase("FIN"))) {
				salida.println(cadena);
				cadena = teclado.nextLine();
			}
			salida.flush();
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}finally {
			salida.close();
		}
		System.out.println("siguiente");
		//try with resources, no necesita ser cerrado.
		
		try (FileWriter fw = new FileWriter("c:/ficheros/datos.txt",true);PrintWriter pw = new PrintWriter(fw)){
			String valor;
			valor = teclado.nextLine();
		
			System.out.println("TRATAMOS DE INTRODUCIR EL TEXTO QUE IMPLEMENTES EN LOS DOS FICHEROS ANTERIORMENTE CREADOS");
			while(!valor.equalsIgnoreCase("FIN")) {
				pw.println(valor);
				valor = teclado.nextLine();
				
			}
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		 
		 
		 
		
	}
		


}

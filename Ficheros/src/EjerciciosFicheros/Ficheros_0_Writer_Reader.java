package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ficheros_0_Writer_Reader {
	public static void main(String args[]) {
		//Escribir en un fichero.
		PrintWriter pw = null;
		Scanner teclado = new Scanner(System.in);
		
		try {
			pw = new PrintWriter("c:/ficheros/misDatos.txt");
			System.out.println("Introduce un texto que será guardado en un fichero y a continución lo mostraremos con alguna diferencia");
			String cadena = teclado.nextLine();
			while(!(cadena.equalsIgnoreCase("FIN"))) {
				pw.println(cadena.toLowerCase());
				cadena = teclado.nextLine();
			}
			pw.flush();
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}finally {
			pw.close();
		}
		System.out.println("----------------");
		System.out.println("AÑADIR MAS TEXTO");
		System.out.println("----------------");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:/ficheros/misDatos.txt",true);//Para poder añadir texto a continuación.
			pw = new PrintWriter(fw);
			String cadena;
			System.out.println("Introduce mas texto, se introducirá a continuación del anterior");
			cadena = teclado.nextLine();
			while(!(cadena.equalsIgnoreCase("FIN"))) {
				pw.println(cadena.toLowerCase());
				cadena = teclado.nextLine();
			}
			pw.flush();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}	
		}
		
		System.out.println("----------------");
		System.out.println("LECTURA DE DATOS");
		System.out.println("----------------");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("c:/ficheros/misDatos.txt");
			BufferedReader br = new BufferedReader(fr);
			String cadena;
			cadena = br.readLine();
			while(cadena!=null) {
				System.out.println(cadena);
				cadena = br.readLine();
			}
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				if(fr!=null) {
					fr.close();
				}
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		
	}


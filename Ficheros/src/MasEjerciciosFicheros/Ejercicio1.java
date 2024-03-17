package MasEjerciciosFicheros;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio1 {
	
	public static void main(String args[]) {
		
		
		try {
			PrintWriter Pw = new PrintWriter("c:/ficheros/datos16.txt");
			Pw.write("Hola qué tal desde PrintWriter");
			Pw.flush();
			Pw.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Otro fichero
		try {
			FileWriter fw = new FileWriter("c:/ficheros/datos16.txt",true);
			fw.write("\nAñadir texto desde FileWriter");
			fw.flush();
			fw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		//try resources
		try(FileWriter fw = new FileWriter("c:/ficheros/datos16.txt",true);
				FileWriter fw2 = new FileWriter("c:/ficheros/datos17.txt")){
			fw.write("\nAñadir texto desde try-resources");
			fw.flush();
			fw.close();
			
			fw2.write("AÑADIR TEXTO DESDE TRY-RESOURCES");
			fw2.flush();
			fw2.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		//Lectura fichero
		try {
			FileReader rw = new FileReader("c:/ficheros/datos16.txt");
			BufferedReader bf = new BufferedReader(rw);
			String cadena = bf.readLine();
			
			while(cadena != null) {
				System.out.println(cadena);
				cadena = bf.readLine();
			}
			rw.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nMUESTRO DATOS DEL FICHERO: datos17.txt");
		try {
			FileReader fr = new FileReader("c:/ficheros/datos17.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String cadena = br.readLine();
			while(cadena != null) {
				System.out.println(cadena);
				cadena = br.readLine();
			}
			br.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//SABIENDO QUE TENEMOS UNA IMAGEN 
		int arrayBytes[] = new int [150873]; 
		try {
			int contador = 0;
			
			FileInputStream fs = new FileInputStream("c:/ficheros/tigre.jpg");
			int numByte=0;
			while(numByte != -1) {
				numByte = fs.read();
				if(numByte != -1) {
					arrayBytes[contador]=numByte;
					contador++; 
				}
				
				System.out.println(numByte);
				
			}
			fs.close();
			System.out.println(contador);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Realizamos copia imagen
		try {
			FileOutputStream fo = new FileOutputStream("c:/ficheros/OtracopiaTigre.jpg");
			for(int n=0;n<arrayBytes.length;n++) {
				fo.write(arrayBytes[n]);
			}
			fo.close();
		}catch(IOException e) {
			System.out.println("Error"+e.getMessage());
		}
	}

}

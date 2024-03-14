package PildorasInformaticas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {
	public static void main(String args []) {
		Escribir textoAescribir = new Escribir();
		String nombre = "Ignacio Rueda Delgado";
		textoAescribir.insertText(nombre);
		
	}

}

class Escribir{
	
	public void insertText(String text) {
		try {
		FileWriter fw = new FileWriter("c:/ficheros/ejemplo.txt",true);
		fw.write(text);
		fw.close();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		}
}
package PildorasInformaticas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {
	
	public static void main(String args[]) {
		LeerFichero miLectura = new LeerFichero();
		miLectura.leer();
		
	}
}

class LeerFichero{
	
	public void leer() {
		
		try {
			FileReader fr = new FileReader("c:/ficheros/datos.txt");
			int c = fr.read();
			while(c != -1) {
				System.out.println(c);
				c = fr.read();
			}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
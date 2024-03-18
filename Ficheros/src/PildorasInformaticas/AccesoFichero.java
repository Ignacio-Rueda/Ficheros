package PildorasInformaticas;

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
			System.out.print((char)c);
			while(c != -1) {
				c = fr.read();
				System.out.print((char)c);
				
			}
			fr.close(); 
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
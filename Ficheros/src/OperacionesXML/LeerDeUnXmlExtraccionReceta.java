package OperacionesXML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerDeUnXmlExtraccionReceta {

	public static void main(String args[]) {

			File fichero = new File("c:/" + File.separator + "ficheros" + File.separator + "ficherosXml"+ File.separator + "recetas.xml");
			
			try (BufferedReader br = new BufferedReader(new FileReader(fichero))){
				
				String cadena = "";
				while(cadena != null) {
					cadena = br.readLine();
					if(cadena != null) {
						System.out.println(cadena);
					}
				}
				
			}catch(FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}

		
	}

}

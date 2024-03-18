package EjemplosAborrar;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirYborrar {
	
	public static void main(String args[]) {
		
		
		//VAMOS A ESCRIBIR EN UN FICHERO
		try (FileWriter fw = new FileWriter("c:"+File.separator+"ficheros"+File.separator+"pruebasAborrar.txt");){
			fw.write("La frase que escribimos");
			fw.flush();
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		//VAMOS A LEER UN FICHERO
		try(FileReader fr = new FileReader("c:"+File.separator+"ficheros"+File.separator+"pruebasAborrar.txt")){
			int c = 0;
			while(c!=-1) {
				c = fr.read();
				if(c!=-1)
				System.out.print((char)c);
			}
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}

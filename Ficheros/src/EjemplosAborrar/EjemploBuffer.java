package EjemplosAborrar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBuffer {
	
	
	public static void main(String args[]) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:"+File.separator+"ficheros"+File.separator+"ejemploBuffer.txt"));
			BufferedReader br = new BufferedReader(new FileReader("c:"+File.separator+"ficheros"+File.separator+"ejemploBuffer.txt"))){
			
			bw.write("FRASE QUE INTRODUZCO, EN EL FICHERO MEDIANTE BUFFER");
			bw.flush();
			
			String cadena = "";
			while(cadena != null) {
				cadena = br.readLine();
				if(cadena != null)
				System.out.println(cadena);
			}
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}

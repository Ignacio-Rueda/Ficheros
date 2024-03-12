package EjerciciosFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Fichero_0_StreamTokenizer {
	
	
	
	
	public static void main(String args[]) {
		int contadorLetras = 0;
		int contadorNumeros = 0;
		try {
			StreamTokenizer str = new StreamTokenizer(new FileReader("c:/ficheros/nuevosDatos.txt"));
			while(str.nextToken() != str.TT_EOF) {
				
				if(str.ttype == str.TT_WORD) {
					contadorLetras++;
				}
				if(str.ttype == str.TT_NUMBER) {
					contadorNumeros++;
				}
			}
			System.out.printf("Número de letras %d, Número de números %d",contadorLetras,contadorNumeros);
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ficheros_0 {

	public static void main(String[] args){
		// CREAR Y ESCRIBIR EN FICHEROS DE TEXTO EN JAVA.
		/**
		 * Para escribir en un fichero de texto utilizaremos dos clases:
		 * -FileWriter (Permite tener acceso al fichero en modo escritura)
		 * -PrintWriter
		 */
		//FileWriter(String path);
		//FileWriter(File objetoFile);
		//El fichero se crea y si ya existe, su contenido se pierde.
		/**
		 * Si necesitas abrir un fichero de texto existente SIN perder su contenido y añadir más contenido al final:
		 */
		//FileWriter(String path,boolean append);
		//FileWriter(File objetoFile,boolean append);
		
		//Si el parámetro append es true significa que los datos se añaden. Si es false, significa que los datos existentes se pierden.
		
		/**
		 * La clase FileWriter proporciona el método write() para escribir cadenas de caracteres aunque lo normal es utilizar
		 * la clase PrintWriter para facilitar la escritura.
		 * La clase PrintWriter permite escribir caracteres en el fichero de la misma forma que en la pantalla.
		 * Un objeto PrintWriter se crea a partir de un objeto FileWriter.
		 */
		
		 Scanner teclado = new Scanner(System.in);
	     PrintWriter salida = null;
	     
	     try {
	    	 salida = new PrintWriter("c:/ficheros/datos.txt"); //Se crea el fichero.
	    	 String cadena;
	    	 System.out.println("Introduce textto. Para acabar introduce la cadena FIN:");
	    	 cadena = teclado.nextLine();						//Se introduce por teclado una cadena.	
	    	 while(!(cadena.equalsIgnoreCase("FIN"))) {
	    		 salida.println(cadena); 						//Se escribe la cadena en el fichero.
	    		 cadena = teclado.nextLine();					//Se introduce por teclado una cadena.
	    	 }
	    	 salida.flush();						//Asegura que todos los datos pendiente en el buffer de PrintWriter, se escriban en el archivo antes de que se cierre el flujo. 
	     }catch(FileNotFoundException ex) {
	    	 System.out.println(ex.getMessage());
	     }finally {
	    	 salida.close();        //cierra la conexión con el fichero y libera los recursos que está usando la conexión. 
	     }
	  

	}

}

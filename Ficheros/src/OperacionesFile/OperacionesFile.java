package OperacionesFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OperacionesFile {

	public static void main(String[] args) {
		//File.separator asegura compatibilidad entre S.O porque no todos usan el mismo tipo de barra para las rutas
		File fichero = new File("c:"+File.separator+"ficheros");
		System.out.println(fichero.getAbsolutePath());//Devuelve la ruta absoluta
		System.out.println(fichero.exists());//Saber si existe o no.
		
		
		
		//Imprimir un listado de todo lo que haya en una carpeta.
		
		File ruta = new File("c:"+File.separator+"ficheros");
		
		//El método list, nos devuelve un array de strings
		System.out.println("MOSTRAR CONTENIDO RUTA \n");
		String[]array = ruta.list();
		for(int n=0;n<array.length;n++) {
			File comprobarRuta = new File(ruta.getAbsolutePath(),array[n]);
			System.out.println(array[n]);
			if(comprobarRuta.isDirectory()) {
				System.out.println("---------------------------");
				String subArray[] = comprobarRuta.list();
				for(int l=0;l<subArray.length;l++) {
					System.out.println(subArray[l]);
				}
				System.out.println("---------------------------");
			}
			
		}
		
		/**
		 * CREACIÓN - ESCRITURA - ELIMINACIÓN
		 */
		System.out.println("---------------------------");
		System.out.println("CREAMOS UN NUEVO DIRECTORIO");
		System.out.println("---------------------------");
		//Crear un nuevo directorio.
		File crearDirectorio = new File("c:"+File.separator+"ficheros"+File.separator+"MI_NUEVO_DIRECTORIO");
		crearDirectorio.mkdir();
		//Crear un nuevo fichero.
		System.out.println("---------------------------");
		System.out.println("CREAMOS UN NUEVO FICHERO");
		System.out.println("---------------------------");
		File crearFichero = new File("c:"+File.separator+"ficheros"+File.separator+"NUEVO_FICHERO.txt");
		String archivo_destino = crearFichero.getAbsolutePath();
		try{
			crearFichero.createNewFile();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		//Rellenar el fichero
		Escribiendo accede_es = new Escribiendo();
		
		accede_es.escribir(archivo_destino);
	

	}

}

class Escribiendo{
	
	public void escribir(String rutaArchivo) {
		String frase = "Hola desde domingo 17/3/2024";
		try (FileWriter fw = new FileWriter(rutaArchivo)){
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write(frase);
			bf.flush();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

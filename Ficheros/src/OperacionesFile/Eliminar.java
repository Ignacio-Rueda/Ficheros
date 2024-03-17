package OperacionesFile;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("c:/ficheros/NUEVO_FICHERO");
		System.out.println(ruta.exists());
		ruta.delete();
	}

}

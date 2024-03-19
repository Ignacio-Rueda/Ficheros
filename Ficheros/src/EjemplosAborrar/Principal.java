package EjemplosAborrar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String args[]) {

		List<Empleado> arrayEmpleado = new LinkedList<>();
		arrayEmpleado.add(new Administrador("Julio", 30, 3000, 150));
		arrayEmpleado.add(new Empleado("María", 25, 3660));

		// Desde el programa hacia el disco
		try {
			ObjectOutputStream salida = new ObjectOutputStream(
					new FileOutputStream("c:" + File.separator + "ficheros" + File.separator + "empleados.dat"));
			salida.writeObject(arrayEmpleado);
			salida.close();
			
			//Desde el disco hacia el programa 
			ObjectInputStream entrada = new ObjectInputStream (new FileInputStream("c:" + File.separator + "ficheros" + File.separator + "empleados.dat"));
			List<Empleado> arrayEmpleadoEntrada = new LinkedList<>();
			arrayEmpleadoEntrada = (LinkedList<Empleado>)entrada.readObject();
			for(Empleado e:arrayEmpleadoEntrada) {
				System.out.println(e);
			}
			entrada.close();
		}catch(FileNotFoundException ex) {
			ex.getMessage();
		}catch(IOException ex) {
			ex.getMessage();
		}catch(Exception e) {
			e.getMessage();
		}
		

	}

}

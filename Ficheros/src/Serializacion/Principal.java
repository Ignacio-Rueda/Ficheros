package Serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String args[]) {

		Empleado[] arrayEmpleado = new Empleado[3];

		arrayEmpleado[0] = new Administrador("PACO", 30, 1000, 5);
		arrayEmpleado[1] = new Empleado("JESÚS", 35, 2800);
		arrayEmpleado[2] = new Empleado("NACHO", 34, 1200);

		try {
			ObjectOutputStream salida = new ObjectOutputStream(
					new FileOutputStream("c:" + File.separator + "ficheros" + File.separator + "Empleado.dat"));
			salida.writeObject(arrayEmpleado);
			salida.close();

			ObjectInputStream entrada = new ObjectInputStream(
					new FileInputStream("c:" + File.separator + "ficheros" + File.separator + "Empleado.dat"));
			Empleado arrayRecepcion[] = (Empleado[]) entrada.readObject();
			for (Empleado e : arrayRecepcion) {
				System.out.println(e);
			}
			entrada.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}

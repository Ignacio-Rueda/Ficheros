package RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Producto> misProductos = new ArrayList<>();
		
		misProductos.add(new Producto (1000,"Producto 1",20.5,true,'f'));
		misProductos.add(new Producto (2,"Producto 2",21.5,false,'f'));
		misProductos.add(new Producto (3,"Producto 3",22.5,true,'f'));
		misProductos.add(new Producto (4,"Producto 4",23.5,false,'r'));
		misProductos.add(new Producto (5,"Producto 5",24.5,true,'j'));
		/**
		 * Con RanadomAccessFile podemos leer y escribir archivos de manera aleatoria, es decir, nos podemos situar en una posición concreta, en lugar de tener que recorrer desde el principio.
		 * Hay que tener en cuenta que cada tipo de variable ocupa un número de bytes:
		 * Long 8 bytes
		 * Double 8 bytes
		 * Integer 4 bytes
		 * Float 4 bytes
		 * Short 2 bytes
		 * Char 2 bytes
		 * String 2 bytes por cada caracter. 
		 * Byte 1 byte
		 * Boolean 1 byte
		 */
		//La ventaja de hacerlo con un try with resoruce es que no tenemos que hacer un .close(). Lo hace automáticamente.
		try(RandomAccessFile raf = new RandomAccessFile("ejemplo_raf.dat","rw")){
			
			for(Producto p:misProductos) {
				raf.writeInt(p.getId());
				
				StringBuffer sb = new StringBuffer(p.getNombre());
				sb.setLength(10);
				
				raf.writeChars(sb.toString());
				raf.writeDouble(p.getPrecio());
				raf.writeBoolean(p.isDescuento());
				raf.writeChar(p.getTipo());
			}
			
			raf.seek(70);
			System.out.println(raf.readInt());
			String nombre="";
			for(int n=0;n<10;n++) {
				nombre+=raf.readChar();
			}
			System.out.println(nombre);
			System.out.println(raf.readDouble());
			System.out.println(raf.readBoolean());
			System.out.println(raf.readChar());
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

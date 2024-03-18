package Serializacion;

import java.io.Serializable;
import java.time.LocalDate;

public class Empleado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4532375955657617745L;
	private String nombre;
	private int edad;
	private double sueldo;
	private LocalDate fechaIngreso;
	public Empleado(String nombre,int edad,double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	@Override
	public String toString() {
		return String.format("NOMBRE %s EDAD %d SUELDO %.2f",
				this.nombre,
				this.edad,
				this.sueldo
				);
	}
}

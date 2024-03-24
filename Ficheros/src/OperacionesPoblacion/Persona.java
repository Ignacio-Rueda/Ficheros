package OperacionesPoblacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Persona{
	private static final String PATRON_DNI = "[0-9]{8}[A-Z]";
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private int edadActual;
	private String poblacion;
	private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

	public Persona(String nombre, String primerApellido, String segundoApellido, String dni, LocalDate fechaNacimiento,
			String poblacion) throws IllegalArgumentException {

		if (!dni.matches(Persona.PATRON_DNI)) {
			throw new IllegalArgumentException("Dni no válido: " + dni);

		}

		// Asignamos valores.
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.poblacion = poblacion;
		this.edadActual = calcularEdad();

	}

	// GETTERS & SETTERS

	//
	private int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Long edad = ChronoUnit.YEARS.between(this.fechaNacimiento,fechaActual);
		return edad.intValue();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(int edadActual) {
		this.edadActual = edadActual;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public String toString() {
		
		return String.format("NOMBRE:%s PRIMER APELLIDO:%s SEGUNDO APELLIDO: %s DNI:%s FECHA NACIMIENTO:%s POBLACIÓN:%s",
				this.nombre,
				this.primerApellido,
				this.segundoApellido,
				this.dni,
				this.fechaNacimiento.format(formatoFecha),
				this.poblacion
				
				);
	}

}

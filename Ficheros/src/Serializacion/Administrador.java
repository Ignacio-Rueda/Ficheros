package Serializacion;


public class Administrador extends Empleado{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8616823550792144176L;
	private int gratificaciones;
	public Administrador(String nombre,int edad,double sueldo,int gratificaciones) {
		super(nombre,edad,sueldo);
		this.gratificaciones = gratificaciones;
	}
	public int getGratificaciones() {
		return gratificaciones;
	}
	public void setGratificaciones(int gratificaciones) {
		this.gratificaciones = gratificaciones;
	}
	@Override
	public String toString() {
		return String.format("%s GRATIFICACIONES: %d",
				super.toString(),
				this.gratificaciones
				);
	}
}

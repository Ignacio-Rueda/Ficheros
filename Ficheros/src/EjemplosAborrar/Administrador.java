package EjemplosAborrar;

public class Administrador extends Empleado{

	private double incentivo;
	
	public Administrador(String nombre,int edad,double sueldo,double incentivo) {
		super(nombre,edad,sueldo);
		this.incentivo = incentivo;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public String toString() {
		return String.format("%s INCENTIVOS: %.2f ",
				super.toString(),
				this.incentivo);
	}
}

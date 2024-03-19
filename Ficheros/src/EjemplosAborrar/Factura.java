package EjemplosAborrar;

public class Factura {
	
	private int id;
	private String nombre;
	private double importe;
	
	
	public Factura(int id,String nombre,double importe) {
		this.id = id;
		this.nombre = nombre;
		this.importe = importe;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	

}

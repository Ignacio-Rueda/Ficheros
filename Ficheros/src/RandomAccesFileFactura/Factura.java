package RandomAccesFileFactura;

public class Factura {
	private int id;
	private String nombre;
	private boolean pagada;
	private double importe;
	
	public Factura(int id,String nombre,double importe,boolean pagada) {
		this.id = id;
		this.nombre = nombre;
		this.importe = importe;
		this.pagada =pagada;
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

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	
}

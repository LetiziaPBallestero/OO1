package elInversor;

public class InversionEnAcciones implements inversion {
	private String nombre; 
	private int cantidad; 
	private double valorUnitario;
	
	public double valorActual() {
		return (this.cantidad * this.valorUnitario);
	}

	public InversionEnAcciones() {
	}
	
	public InversionEnAcciones(String n , int cant , double v) {
		this.cantidad = cant;
		this.nombre = n; 
		this.valorUnitario = v;
	}
	
	// getters y setters 

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}

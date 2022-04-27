package presupuesto;

public class Item {
	// atributos
	private String detalle;
	private int cantidad; 
	private double costoUnitario;
	
	// metodos 
	public String getDetalle () {
		return this.detalle;
	}
	public int getCantidad () {
		return this.cantidad;
	}
	public double getCostoUnitario () {
		return this.costoUnitario;
	}
	public Item detalle (String detalle) {
		this.detalle = detalle;
		return this;
	}
	public Item cantidad (int x) {
		this.cantidad = x;
		return this;
	}
	public Item costoUnitario (double x) {
		this.costoUnitario = x;
		return this;
	}
	
	
	public double costo() {
		return cantidad * costoUnitario; 
	}
	

	public Item (String detalle , double costo, int cant) {
		this.detalle = detalle; 
		this.cantidad = cant; 
		this.costoUnitario = costo;
	}

	public Item (String string) {
		this.detalle = string;
	}
	
	public Item (double costo) {
		this.costoUnitario = costo;
	}
	
	public Item (int cant) {
		this.cantidad = cant;
	}

	public Item() {
	}

	
}

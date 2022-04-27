package volumenSuperficie;

public abstract class Pieza {
	protected String material; 
	protected String color;
	protected double volumen; 
	protected double superficie;
	// setters
	public void setMaterial (String m ) {
		this.material = m;
	}
	
	public void setColor (String c) {
		this.color = c;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
	
	public double getVolumen() {
		return this.volumen;
	}
	
	public double getSuperficie() {
		return this.superficie;
	}
	
	// metodos 
	// metodo para el volumen 

}

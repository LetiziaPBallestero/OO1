package volumenSuperficie;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera (int radio , String c , String m) {
		this.radio = radio;
		this.color = c; 
		this.material = m;
	}
	
	public double getVolumen() {
		return (Math.round(((1.3 * Math.PI * Math.pow(this.radio, 3)))*1000.0)/1000.0);
	}
	
	public double getSuperficie() {
		double result =  4 * Math.PI * Math.pow(this.radio, 2);
		return (Math.round(result*1000.0)/1000.0);
	}

	// g 
	public int getRadio() {
		return radio;
	}
}

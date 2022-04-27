package volumenSuperficie;

public class Cilindro extends Pieza {
	private int radio; 
	private int altura;
	
	public Cilindro (int r , int a , String c , String m) {
		this.radio = r; 
		this.altura = a; 
		this.color = c;
		this.material = m;
	}

	// otros metodos 
	
	public double getVolumen() {
		return (Math.round(((Math.PI * Math.pow(this.radio, 2) * this.altura))
				*1000.0)/1000.0);
	}
	
	public double getSuperficie() {
		return (Math.round(((Math.PI * 2 * Math.pow(this.radio, 2) * this.altura 
				+ 2 * Math.PI * Math.pow(this.radio ,  2)))
				*1000.0)/1000.0);
	}
	
	// g 
	public int getRadio() {
		return radio;
	}
	public int getAltura() {
		return altura;
	}
}

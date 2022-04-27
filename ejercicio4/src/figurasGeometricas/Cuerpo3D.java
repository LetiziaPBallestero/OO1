package figurasGeometricas;

public class Cuerpo3D {
	// atributos
	private double altura;
	private Cuerpo2D caraBasal;
	private double volumen;
	private double superficieExterior;
	// metodos 
	public void setAltura (double a) {
		this.altura = a;
	}
	public void setCaraBasal (Cuerpo2D cara) {
		this.caraBasal = cara;
		setSuperficieExterior();
		setVolumen();
	}
	public void setSuperficieExterior () {
		this.superficieExterior = 2* this.caraBasal.getArea() + this.caraBasal.getPerimetro() *  this.altura;
	}
	public void setVolumen () {
		this.volumen = this.caraBasal.getArea() * altura;
	}
	
	public double getVolumen () {
		return this.volumen;
	}
	public double getAltura () {
		return this.altura;
	}
	public double getSuperficieExterior () {
		return this.superficieExterior;
	}
	
	public Cuerpo3D() {
	}
	
}

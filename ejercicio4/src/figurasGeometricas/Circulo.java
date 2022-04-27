package figurasGeometricas;

public class Circulo implements Cuerpo2D {
	// atributos
	private double diametro;
	private double radio;
	private double perimetro;
	private double area;

	// metodos a aplicar
	public void setDiametro() {
		this.diametro = (this.radio * 2);
	}

	public void setPerimetro() {
		this.perimetro = Math.PI * (this.radio * 2);
	}

	public void setArea() {
		this.area = Math.PI * Math.pow(radio, 2);
	}

	public void setRadio(double r) {
		this.radio = r;
		setDiametro();
		setPerimetro();
		setArea();
	}

	public double getRadio() {
		return this.radio;
	}

	public double getDiametro() {
		return this.diametro;
	}

	public double getPerimetro() {
		return this.perimetro;
	}

	public double getArea() {
		// return Math.round((this.area*100.00)/100.0);
		return this.area;
	}

	public Circulo() {
	}

}

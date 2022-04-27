package figurasGeometricas;

public class Cuadrado implements Cuerpo2D {
	//atributos
	private double lado;
	private double perimetro;
	private double area;
	//metodos
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
		setArea();
		setPerimetro();
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro() {
		this.perimetro = lado*4;  
	}
	public void setArea () {
		this.area = Math.pow(lado, 2);
	}
	public double getArea() {
		return area;
	}
}

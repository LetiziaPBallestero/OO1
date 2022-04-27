package volumenSuperficie;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;

	public PrismaRectangular(int mayor, int menor, int altura, String material, String color) {
		this.ladoMayor = mayor;
		this.ladoMenor = menor;
		this.altura = altura;
		this.color = color;
		this.material = material;
	}

	// volumen

	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}

	public double getSuperficie() {
		return (2 * ((this.ladoMayor * this.ladoMenor) + (this.ladoMayor * altura) + (this.ladoMenor * altura)));
	}
	// getters
	public int getLadoMayor() {
		return ladoMayor;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public int getAltura() {
		return altura;
	}

}

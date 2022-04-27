package volumenSuperficie;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	// a 
	private List<Pieza> piezas;
	// m
	public double volumenDeMaterial (String material) {
		return this.piezas.stream().filter(piezas -> piezas.getMaterial() == material)
				.mapToDouble((piezas -> piezas.getVolumen())).sum();
	}
	public double superficieDeColor (String color) {
		return this.piezas.stream().filter(piezas -> piezas.getColor() == color)
				.mapToDouble((piezas -> piezas.getSuperficie())).sum();
	}
	public void addPieza (Pieza p) {
		this.piezas.add(p);
	}
	// c 
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
}

package elInversor;

import java.util.ArrayList;
import java.util.List;



public class Inversor {
	private String nombre;
	private List<inversion> inversiones;

	
	public Inversor(String n) {
		this.nombre = n;
		this.inversiones = new ArrayList<inversion>();
	}

	public void agregarInversion(inversion i) {
		this.inversiones.add(i);
	}

	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion::valorActual).sum();
	}
	

	// getters
	public String getNombre() {
		return nombre;
	}
}

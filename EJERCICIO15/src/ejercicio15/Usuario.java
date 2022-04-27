package ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String DNI; 
	private String direccion; 
	private List<Propiedad> propiedades;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String DNI() {
		return DNI;
	}
	
	public void agregarPropiedad (Propiedad p) {
		this.propiedades.add(p);
	}
	
	public List<Reserva> obtenerReservas(){
		List<Reserva> reservas = new ArrayList<>();
		this.propiedades.stream()
				.forEach(p -> reservas.addAll(p.obtenerReservas()));
		return reservas;
	}
	
	public double calcularIngresos(DateLapse periodo){
		return this.propiedades.stream().mapToDouble(Propiedad::calcularIngreso).sum();
	}
	
	public Usuario (String n , String dni , String d) {
		this.direccion = d;
		this.DNI = dni;
		this.nombre = n;
		this.propiedades = new ArrayList<>();
	}
	
	public Usuario() {}
	
	
}

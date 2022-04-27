package ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	// a 
	private String nombre; 
	private String descripcion;
	private double precioPorNoche;
	private String direccion; 
	private Usuario duenio;
	private List<Reserva> reservas;

	
	// m 
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public Usuario getDuenio() {
		return this.duenio;
	}
	public boolean disponible (DateLapse periodo) {
		return !(this.reservas.stream().anyMatch(reserva -> reserva.estaOcupada(periodo)));
	}
	
	public void eliminarReserva (LocalDate fecha , Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public void agregarReserva (Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public List<Reserva> obtenerReservas() {
		return this.reservas;
	}
	
	public double calcularIngreso () {
		return this.reservas.stream().mapToDouble(Reserva::calcularPrecioReserva).sum();
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public double getPrecioNoche () {
		return this.precioPorNoche;
	}
	
	public Propiedad (String nombre , String descripcion , double precioPorNoche , String direccion , Usuario usuario) {
		this.descripcion = descripcion;
		this.direccion = direccion; 
		this.nombre = nombre; 
		this.precioPorNoche = precioPorNoche;
		this.duenio = usuario;
		this.reservas = new ArrayList<>();
	}
	
}

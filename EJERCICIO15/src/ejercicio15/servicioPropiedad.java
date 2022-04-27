package ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;


public class servicioPropiedad {
	private List<Propiedad> propiedades;
	
	public Propiedad registrarPropiedad ( String nombre , String descripcion , double precio , String direccion , Usuario usuario) {
		Propiedad propiedad = new Propiedad (nombre , descripcion , precio , direccion , usuario);
		this.propiedades.add(propiedad);
		usuario.agregarPropiedad(propiedad);
		return propiedad;
	}
	
	public List<Propiedad> buscarDisponiblesEnUnPeriodo (LocalDate fechaInicio , LocalDate fechaFin) {
		DateLapse periodo = new DateLapse (fechaInicio , fechaFin);
		return this.propiedades.stream()
		.filter(propiedades -> propiedades.disponible(periodo))
		.collect(Collectors.toList());
	}
	
	public Reserva hacerReserva (Propiedad propiedad , DateLapse periodo , Usuario usuario) {
		if (propiedad.disponible(periodo)) {
			Reserva reserva = new Reserva (propiedad,periodo);
			propiedad.agregarReserva(reserva);
			return reserva;
		} else {
			return null;
		}
	}
	
	public double precioReserva (Reserva reserva) {
		return reserva.calcularPrecioReserva();
	}
	
	public void eliminar (Reserva reserva , LocalDate fechaActual) {
		if (reserva.estaAntes(fechaActual)) {
			 reserva.eliminarReserva(fechaActual, reserva);
		}
		 System.out.println("No se pudo eliminar su reserva");
	}
	

	
	// constructor 
	public servicioPropiedad() {
		this.propiedades = new ArrayList<>();
	}
	
	
	
	
}

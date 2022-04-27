package ejercicio15;

import java.time.LocalDate;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	public double calcularPrecioReserva() {
		return this.propiedad.getPrecioNoche() * cantidadNoches();
	}
	
	public boolean estaOcupada (DateLapse otroPeriodo) {
		return this.periodo.overlaps(otroPeriodo);
	}
	
	private int cantidadNoches() {
		return this.periodo.sizeInDays();
	}
	
	public boolean estaAntes(LocalDate fecha) {
		return this.periodo.getFrom().isBefore(fecha);
	}
	
	public void eliminarReserva (LocalDate fecha, Reserva reserva) {
		this.propiedad.eliminarReserva(fecha , reserva);
	}

	public Reserva (Propiedad propiedad , DateLapse periodo) {
		this.propiedad = propiedad;
		this.periodo = periodo;
	}
	
	
}

package ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LlamadaInternacional extends Llamada {
	// a 
	// hereda fecha, hora, minutos, numeroLlama, numeroRecibe 
	private String paisOrigen; 
	private String paisDestino;
	private LocalTime tiempoInicio = LocalTime.of(8, 00);
	private LocalTime tiempoFinal = LocalTime.of(20, 00);
	private final double precioDiurno = 4.0;
	private final double precioNocturno = 3.0;
	
	// m 
	public LlamadaInternacional (LocalDate fecha, LocalTime hora, int minutos , Integer numeroLlama , Integer numeroRecibe , String paisOrigen , String paisDestino) {
		super(fecha, hora, minutos, numeroLlama, numeroRecibe);
		this.paisDestino = paisDestino;
		this.paisOrigen = paisOrigen;
	}

	/* Las llamadas internacionales tienen un costo por minuto que depende del país destino y de la hora 
	 * (el precio diurno de 8:00 a 20:00 es un valor, y precio nocturno de 20:00 a 8:00 es otro). 
	 * Por ahora utilice $4 como precio diurno para todos los países y $3 como precio nocturno para todos los países. 
	 */

	public boolean esDiurno() {
		return (this.hora.isAfter(this.tiempoInicio) && this.hora.isBefore(tiempoFinal));
	}

	
	public double calcularCosto() {
		if (esDiurno())
			return this.precioDiurno * this.minutosDuracion;
		else 
			return this.precioNocturno * this.minutosDuracion;
	}

}

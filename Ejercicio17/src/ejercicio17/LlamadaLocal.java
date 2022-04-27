package ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LlamadaLocal extends Llamada {
	private final double precioLocal = 1.0; 

	// m 
	public LlamadaLocal (LocalDate fecha, LocalTime hora, int minutos , Integer numeroLlama , Integer numeroRecibe) {
		super(fecha,  hora,  minutos ,  numeroLlama ,  numeroRecibe);
	}
	
	public double calcularCosto() {
		return this.minutosDuracion * this.precioLocal;
	}
	

}

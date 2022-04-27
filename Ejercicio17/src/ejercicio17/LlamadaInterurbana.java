package ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LlamadaInterurbana extends Llamada {
	// a 
	// hereda fecha, hora, minutos, numeroLlama, numeroRecibe 
	private double distanciaEnKM;
	private final double costoFijo = 5.0;
	private final double costoCorto = 2.0;
	private final double costoMediano = 2.5;
	private final double costoLargo = 3.0;
	
	
	public LlamadaInterurbana ( LocalDate fecha, LocalTime hora, int minutos, Integer numeroLlama , Integer numeroRecibe, double distanciaKM) {
		super(fecha, hora, minutos, numeroLlama, numeroRecibe);
		this.distanciaEnKM = distanciaKM;
	}
	
	public double calcularCosto() {
		if (this.distanciaEnKM < 100) 
			return (this.costoFijo + (this.costoCorto * this.minutosDuracion));
		else if (this.distanciaEnKM < 500)
			return (this.costoFijo + (this.costoMediano * this.minutosDuracion));
		else 
			return (this.costoFijo + (this.costoLargo * this.minutosDuracion));
	}
}

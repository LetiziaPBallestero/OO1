package ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements Cancelacion {

	/* Si una propiedad tiene pol�tica de cancelaci�n moderada, 
	 * se reembolsar� el monto total si la cancelaci�n se hace 
	 * hasta una semana antes y 50% si se hace hasta 2 d�as antes.
*/ 
	public double reembolso(LocalDate fecha , Reserva reserva) {
		double dias = fecha.until(reserva.getPeriodo().getFrom() , ChronoUnit.DAYS);
		if (dias >= 7)
			return reserva.calcularPrecioReserva();
		if (dias >= 2) 
			return reserva.calcularPrecioReserva();
		else 
			return 0;
	}
}

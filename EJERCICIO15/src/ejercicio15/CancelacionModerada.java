package ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements Cancelacion {

	/* Si una propiedad tiene política de cancelación moderada, 
	 * se reembolsará el monto total si la cancelación se hace 
	 * hasta una semana antes y 50% si se hace hasta 2 días antes.
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

package ejercicio15;

import java.time.LocalDate;

public class CancelacionFlexible implements Cancelacion {

	/* se reembolsará el monto total sin importar la fecha de cancelación
	 *  (que de todas maneras debe ser anterior 
	 *  a la fecha de inicio de la reserva). 
*/ 
	public double reembolso(LocalDate fecha , Reserva reserva) {
		return reserva.calcularPrecioReserva();
	}
	
}

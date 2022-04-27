package ejercicio15;

import java.time.LocalDate;

public class CancelacionFlexible implements Cancelacion {

	/* se reembolsar� el monto total sin importar la fecha de cancelaci�n
	 *  (que de todas maneras debe ser anterior 
	 *  a la fecha de inicio de la reserva). 
*/ 
	public double reembolso(LocalDate fecha , Reserva reserva) {
		return reserva.calcularPrecioReserva();
	}
	
}

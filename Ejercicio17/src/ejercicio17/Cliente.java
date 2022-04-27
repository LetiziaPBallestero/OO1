package ejercicio17;

import java.time.LocalDate;
import java.util.List;

public abstract class Cliente {
// a 
	protected Integer numero;
	protected String nombre; 
	protected String direccion; 
	protected List <Llamada> llamadasRecibidas;
	protected List <Llamada> llamadasHechas;
	protected Factura factura;
	// m 
	
	public Integer getNumero() {
		return this.numero;
	}
	
	/*Facturar las llamadas de un cliente. 
	 * Se indica el cliente para el cual se quiere facturar. 
	 * Se indican las fechas de inicio y fin del período a considerar. 
	 * El sistema retorna una factura en la que consta: el cliente al que pertenece, la fecha de facturación,
	 *  las fechas de inicio y fin del período, y el monto total de todas las llamadas que el cliente hizo, y que iniciaron en ese período. 
*/ 
	
	public double facturaDelCliente (LocalDate fechaInicio , LocalDate fechaFin) {
		DateLapse periodo = new DateLapse (fechaInicio , fechaFin);
		return this.llamadasHechas.stream()
				.filter(l -> l.estaDentro(periodo))
				.mapToDouble(l -> l.calcularCosto())
				.sum();
	}
	
	public Factura facturar (DateLapse p , double m) {
		Factura factura = new Factura(this , p,m);
		this.factura = factura; 
		return factura;
	}
	
}

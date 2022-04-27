package ejercicio17;

import java.time.LocalDate;

public class Factura {
	// a 
	private Cliente usuario; 
	private DateLapse periodoDeFacturacion;
	private LocalDate fechaInicio; 
	private LocalDate fechaFinal; 
	private double monto;
	
	// m 
	
	public Factura (Cliente u , DateLapse p , double m) {
		this.usuario = u ; 
		this.periodoDeFacturacion = p;
		this.fechaFinal = p.getTo();
		this.fechaInicio = p.getFrom();
		this.monto = m;
	}
	
	// metodos que devuelvan desde qué periodo se hace la facturacion hasta qué fecha 
	// 
	
	
	
	/*Facturar las llamadas de un cliente. 
	 * Se indica el cliente para el cual se quiere facturar. 
	 * Se indican las fechas de inicio y fin del período a considerar. 
	 * El sistema retorna una factura en la que consta: el cliente al que pertenece, la fecha de facturación,
	 *  las fechas de inicio y fin del período, y el monto total de todas las llamadas que el cliente hizo, y que iniciaron en ese período. 
*/ 
}

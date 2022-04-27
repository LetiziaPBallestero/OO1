package ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Llamada {
	protected LocalDate fecha; 
	protected LocalTime hora; 
	protected int minutosDuracion; 
	protected Integer numeroLlama; 
	protected Integer numeroRecibe;
	
	public boolean estaDentro(DateLapse periodo) {
		return periodo.includesDate(this.fecha);
	}
	
	public abstract double calcularCosto();
	
	public Llamada (LocalDate fecha, LocalTime hora, int minutos , Integer numeroLlama , Integer numeroRecibe) {
		this.fecha = fecha; 
		this.hora = hora; 
		this.minutosDuracion = minutos;
		this.numeroLlama = numeroLlama;
		this.numeroRecibe = numeroRecibe;
	}
	
	

}


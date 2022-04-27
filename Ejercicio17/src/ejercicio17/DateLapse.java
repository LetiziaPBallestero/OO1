package ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
// atributos 
	private LocalDate from;
	private LocalDate to;

	
	public LocalDate getFrom() {
		return from; 
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to);
	}
	
	public DateLapse (LocalDate from , LocalDate to) {
		this.from = from; 
		this.to = to;
	}
	


}

package ejercicio14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DateLapseTEST {
	
	DateLapse dateLapse;
	
	@BeforeEach
	public void setUP() {
		dateLapse = new DateLapse (LocalDate.of(2021, 10, 4) , LocalDate.of(2021, 10, 6));
	}

	@Test
	public void probando() {
		assertEquals(dateLapse.getFrom() , LocalDate.of(2021, 10, 4));
		assertEquals(dateLapse.getTo() , LocalDate.of(2021, 10, 6));
		
		assertEquals(dateLapse.sizeInDays() , 2);
		
		assertTrue(dateLapse.includesDate(LocalDate.of(2021, 10, 5)));
		
	}
	
}

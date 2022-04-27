package ejercicio15;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDateLapse {
	DateLapse dateLapse;
	DateLapse dateLapse2;
	DateLapse dateLapse3;

	@BeforeEach
	public void setUP() {
		dateLapse = new DateLapse(LocalDate.of(2021, 10, 4), LocalDate.of(2021, 10, 6));
		dateLapse2 = new DateLapse(LocalDate.of(2021, 10, 5), LocalDate.of(2021, 10, 7));
		dateLapse3 = new DateLapse(LocalDate.of(2021, 10, 6), LocalDate.of(2021, 10, 8));
	}

	@Test
	public void probando() {
		assertEquals(dateLapse.getFrom(), LocalDate.of(2021, 10, 4));
		assertEquals(dateLapse.getTo(), LocalDate.of(2021, 10, 6));
		assertEquals(dateLapse.sizeInDays(), 2);
		assertTrue(dateLapse.includesDate(LocalDate.of(2021, 10, 5)));
		assertTrue(dateLapse.overlaps(dateLapse2));
		assertTrue(dateLapse.overlaps(dateLapse3));
	}

}

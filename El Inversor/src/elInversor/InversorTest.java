package elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InversorTest {

	private Inversor inversor; 
	private InversionEnAcciones i1; 
	private PlazoFijo p1;
	
	@BeforeEach
	public void setUP() {
		this.i1 = new InversionEnAcciones("Pepito" , 3 , 3);
		this.p1 = new PlazoFijo (LocalDate.of(2021, 10, 4) , 1000 , 1.05);
		
		this.inversor = new Inversor("Pepito1");
		this.inversor.agregarInversion(p1);
		this.inversor.agregarInversion(i1);
	}
	
	@Test 
	public void comprobar() {
		// por los otrost test se que inversoinEnAcciones y plazo fijo funciona bien 
		assertEquals(this.inversor.getNombre() , "Pepito1");
		assertEquals(this.inversor.valorActual() , 1111.5 , 1111.5);
	}
}

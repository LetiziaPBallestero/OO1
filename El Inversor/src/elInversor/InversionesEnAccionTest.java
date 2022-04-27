package elInversor;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesEnAccionTest {
	private InversionEnAcciones i1;
	
	@BeforeEach
	public void setUp() {
		i1 = new InversionEnAcciones ();
		i1.setCantidad(3);
		i1.setNombre("Pepito");
		i1.setValorUnitario(3);
	}
	
	@Test
	public void testConstuctors() {
		assertEquals (this.i1.getCantidad() , 3); 
		assertEquals (this.i1.getNombre() , "Pepito");
		assertEquals (this.i1.getValorUnitario() , 3 , 0.001);
	}
	
	@Test
	public void probarPlazoFijo() {
		assertEquals(this.i1.valorActual() , 9 , 0.001);
	}
	

}

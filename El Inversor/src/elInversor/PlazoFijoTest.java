package elInversor;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	private PlazoFijo plazoPrueba;
	
	@BeforeEach
	public void setUp() {
		plazoPrueba = new PlazoFijo();
		plazoPrueba.setFechaDeConstitucion(LocalDate.of(2021, 10, 4));
		plazoPrueba.setMontoDepositado(1000);
		plazoPrueba.setPorcentajeDeInteresDiario(1.05);
	}
	
	@Test
	public void testConstuctors() {
		assertEquals(this.plazoPrueba.getFechaDeConstitucion() , LocalDate.of(2021, 10, 4));
		assertEquals(this.plazoPrueba.getMontoDepositado() , 1000 , 0.001);
		assertEquals(this.plazoPrueba.getPorcentajeDeInteresDiario() , 1.05 , 0.001);
	}
	
	@Test
	public void probarPlazoFijo() {
		assertEquals(this.plazoPrueba.valorActual() , 1102.5 , 1102.5);
	}

}

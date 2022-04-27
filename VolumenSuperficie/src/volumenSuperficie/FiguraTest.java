package volumenSuperficie;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguraTest {
	
	private PrismaRectangular prisma; 
	private Esfera esfera;
	private Cilindro cilindro; 
	private ReporteDeConstruccion reporte;
	
	@BeforeEach 
	public void setUP() {
		this.prisma = new PrismaRectangular (2 , 2 , 2 , "Hierro" , "Rojo");
		this.esfera = new Esfera (3 , "Azul" , "Madera");
		this.cilindro = new Cilindro (3 , 3 , "Amarillo" , "Vidrio");
		this.reporte = new ReporteDeConstruccion();
	}
	
	@Test
	public void testearConstructores() {
		assertEquals(this.prisma.getAltura() , 2); 
		assertEquals(this.prisma.getLadoMenor() , 2);
		assertEquals(this.prisma.getLadoMayor() , 2);
		assertEquals(this.prisma.getColor() , "Rojo");
		assertEquals(this.prisma.getMaterial() , "Hierro");
		
		assertEquals(this.esfera.getRadio() , 3);
		assertEquals(this.esfera.getColor() , "Azul"); 
		assertEquals(this.esfera.getMaterial() , "Madera");
		
		assertEquals(this.cilindro.getRadio () , 3); 
		assertEquals(this.cilindro.getAltura() , 3);
		assertEquals(this.cilindro.getColor() , "Amarillo");
		assertEquals(this.cilindro.getMaterial() , "Vidrio");
		
		
	}
	
	@Test 
	public void testearMetodosDeVolumenYSuperficie() {
		assertEquals(this.esfera.getSuperficie() , 113.097 , 0.001);
		assertEquals(this.esfera.getVolumen() , 110.269 , 0.001);
		
		assertEquals(this.prisma.getVolumen() , 8 , 0.001);
		assertEquals(this.prisma.getSuperficie() , 24 , 0.001);
		
		assertEquals(this.cilindro.getVolumen() , 84.823 , 0.001);
		assertEquals(this.cilindro.getSuperficie() , 226.195 , 0.001);
	}
	
	@Test
	public void testearFilters() {
		this.reporte.addPieza(prisma);
		this.reporte.addPieza(prisma);

		assertEquals(this.reporte.superficieDeColor("Rojo") , 48 , 0.001);
		assertEquals(this.reporte.volumenDeMaterial("Hierro") , 16 , 0.001);
	}
	
	

}

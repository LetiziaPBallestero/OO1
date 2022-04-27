package ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;

public class TestTodos {

	Archivo archivo;
	Email emailSinAdjunto;
	Email emailConAdjunto;
	Carpeta carpetaSpam;
	Carpeta basura;

	@BeforeEach
	public void setUp() {
		this.archivo = new Archivo();
		this.archivo.setNombre("Las lechugas del apocalipsis");

		this.emailConAdjunto = new Email("Ultimo concierto", "Este es el ultimo concierto de LES PELUQUERES");
		this.emailSinAdjunto = new Email("Soy un email", "Uno muy aburrido");

		this.carpetaSpam = new Carpeta("spam");
		this.basura = new Carpeta("basura");
	}

	@Test
	public void testArchivo() {
		assertEquals(this.archivo.getNombre(), "Las lechugas del apocalipsis");
		assertEquals(this.archivo.tamanio(), 25, 0.001);
	}

	@Test
	public void testEmail() {
		this.emailConAdjunto.aniadirAdjunto(archivo);
		// titulos
		assertEquals(this.emailConAdjunto.getTitulo(), "Ultimo concierto");
		assertEquals(this.emailSinAdjunto.getTitulo(), "Soy un email");
		// cuerpos
		assertEquals(this.emailSinAdjunto.getCuerpo(), "Uno muy aburrido");
		assertEquals(this.emailConAdjunto.getCuerpo(), "Este es el ultimo concierto de LES PELUQUERES");
		// adjuntos (si si o si no)
		assertEquals(this.emailSinAdjunto.adjutos(), Collections.emptyList());
		// tamanios
		assertEquals(this.emailSinAdjunto.tamanioEmail(), 24, 0.001);
		assertEquals(this.emailConAdjunto.tamanioEmail(), 53 + 25, 0.001);
		// palabras
		assertTrue(this.emailConAdjunto.contiene("concierto"));
		assertTrue(this.emailConAdjunto.contiene("PELUQUERES"));
	}

	@Test
	public void testCarpeta() {
		this.basura.aniadirEmail(emailSinAdjunto);

		assertEquals(this.basura.getNombre(), "basura");
		assertEquals(this.basura.tamanioEmails(), 24, 0.001);
		assertEquals(this.carpetaSpam.tamanioEmails(), 0, 0.001);
	}

}

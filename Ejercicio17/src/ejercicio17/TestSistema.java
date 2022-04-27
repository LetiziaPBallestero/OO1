package ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSistema {
    
	ServicioCliente sistema;
    
    @BeforeEach
    void setUp() throws Exception {
        sistema = new ServicioCliente();
        
        sistema.agregarNumero(1);
        sistema.agregarNumero(2);
        sistema.agregarNumero(3);
        sistema.agregarNumero(4);
        
        sistema.agregarNumero(5);
        sistema.agregarNumero(6);
        sistema.agregarNumero(7);
        sistema.agregarNumero(8);
    }
 
    
    @Test
    public void testAltaDePersonas() {
        sistema.darAltaClienteFisico("Dante", "su casa", 1); // seguro tiene el 4 pero no se
        sistema.darDeAltaPersonaJuridica("Nacho", "2", "20-2-0","personaforra");
        sistema.darAltaClienteFisico("Miqueas", "casa de miq", 3);
        assertEquals(3, sistema.getClientes().size());
    }
    
    @Test
    public void testAsignacionDeNumeros() {
        Cliente dante = sistema.darDeAltaPersonaFisica("Dante", "su casa", 1); // seguro tiene el 4 pero no se
        Cliente nacho = sistema.darDeAltaPersonaJuridica("Nacho", "2", "20-2-0","personaforra");
        Cliente miqueas = sistema.darDeAltaPersonaFisica("Miqueas", "casa de miq", 3);
        assertEquals(4, dante.getNumDeTelefono());
        assertFalse(miqueas.getNumDeTelefono() == 1);
        assertTrue(nacho.getNumDeTelefono() == 3);
    }
    
    @Test
    public void testLlamadasYFacturas() {
        Cliente nacho = sistema.darDeAltaPersonaJuridica("Nacho", "2", "20-2-0","personaforra");
        sistema.registrarLlamadaLocal(LocalDate.of(2021, 10, 20), LocalTime.of(11, 30), 120, 4, 1);
        Llamada llamadaLocal = sistema.registrarLlamadaLocal(LocalDate.of(2021, 10, 25), LocalTime.of(11, 30), 120, 4, 1);
        assertEquals(120, llamadaLocal.calcularCosto());
        Llamada llamadaInterurbana = sistema.registrarInterurbana(LocalDate.of(2021, 10, 24), LocalTime.of(12, 40), 30, 4, 1, 50);
        assertEquals(65, llamadaInterurbana.calcularCosto()); // costo fijo 5 + 2(cantidad para la distancia menor a 100) * 30(cantidad de tiempo)
        Llamada llamadaInternacional = sistema.registrarInternacional(LocalDate.of(2021, 10, 25), LocalTime.of(20, 30), 50, 4, 1, "Argentina", "Bolivia");
        assertEquals(150, llamadaInternacional.calcularCosto());
        
        Factura facturita1 = sistema.facturarLlamadaDeCliente(nacho, LocalDate.of(2021, 10, 23), LocalDate.of(2021, 10, 27));
        assertEquals(335, facturita1.getMontoTotal());
        
        Factura facturita2 = sistema.facturarLlamadaDeCliente(nacho, LocalDate.of(2021, 10, 18), LocalDate.of(2021, 10, 25));
        assertEquals(185, facturita2.getMontoTotal());
        
        // pruebo cliente que es fisico
        Cliente dante = sistema.darDeAltaPersonaFisica("Dante", "su casa", 1);
        sistema.registrarLlamadaLocal(LocalDate.of(2021, 10, 23), LocalTime.of(11, 30), 120, 3, 1);
        sistema.registrarInterurbana(LocalDate.of(2021, 10, 24), LocalTime.of(12, 40), 30, 3, 1, 50);
        sistema.registrarInternacional(LocalDate.of(2021, 10, 25), LocalTime.of(20, 30), 50, 3, 1, "Argentina", "Bolivia");
        
        Factura facturitaDante = sistema.facturarLlamadaDeCliente(dante, LocalDate.of(2021, 10, 22), LocalDate.of(2021, 10, 26));
        assertEquals((335 - (335 * 0.1)) , facturitaDante.getMontoTotal());
    }
}
    
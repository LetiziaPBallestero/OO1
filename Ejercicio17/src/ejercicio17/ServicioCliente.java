package ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioCliente {
	// atributos
	private List <Integer> NumerosDisponibles;
	private List <Integer> NumerosOcupados;
	private List <Cliente> clientes; 
	
	// constructor
	public ServicioCliente() {
		this.NumerosDisponibles = new ArrayList<>();
		this.NumerosOcupados = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	// metodos
	// se asume que el número agregado nunca fue utilizado
	public void agregarNumero(Integer numero) {
		this.NumerosDisponibles.add(numero);		
	}
	
	private void retirarNumero (Integer numero) {
		this.NumerosDisponibles.remove(numero); 
		this.NumerosOcupados.add(numero);
	}
	
	private Integer buscarDisponible() {
		return this.NumerosDisponibles.stream().findFirst().orElse(null);
	}

	public Cliente darAltaClienteFisico (String nombre , String direccion , String DNI) {
		Integer auxiliar = buscarDisponible();
		if (auxiliar != null) {
			Cliente c = new ClienteFisico(nombre, direccion, DNI, auxiliar);
			retirarNumero(auxiliar);
			this.clientes.add(c);
			return c;
		} else {
			return null; 
		}
	}
	
	public Cliente datAltaClienteJuridico (String nombre , String direccion , int CUIT, String tipo) {
		Integer auxiliar = buscarDisponible();
		if (auxiliar != null) {
			Cliente c = new ClienteJuridico(auxiliar, nombre, direccion, CUIT, tipo);
			retirarNumero(auxiliar);
			this.clientes.add(c);
			return c;
		} else {
			return null; 
		}
	}
	
	private Cliente buscarCliente(Integer numero) {
		return clientes.stream().filter(c -> c.getNumero().equals(numero)).findFirst().orElse(null);
	}

	public Llamada registrarLlamadaLocal (LocalDate fecha, LocalTime hora, int minutos , Integer numeroLlama , Integer numeroRecibe) {
		Llamada llamada = new LlamadaLocal(fecha , hora, minutos, numeroLlama, numeroRecibe);
		Cliente clienteLlamo = buscarCliente(numeroLlama);
		Cliente clienteRecibio = buscarCliente(numeroRecibe);
		clienteLlamo.llamadasHechas.add(llamada);
		clienteRecibio.llamadasRecibidas.add(llamada);
		return llamada;
	}
	
	public Llamada registarLlamadaInterurbana (LocalDate fecha, LocalTime hora, int minutos , Integer numeroLlama , Integer numeroRecibe , double distanciaKM) {
		Llamada llamada = new LlamadaInterurbana(fecha , hora, minutos, numeroLlama, numeroRecibe, distanciaKM);
		Cliente clienteLlamo = buscarCliente(numeroLlama);
		Cliente clienteRecibio = buscarCliente(numeroRecibe);
		clienteLlamo.llamadasHechas.add(llamada);
		clienteRecibio.llamadasRecibidas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInternacional (LocalDate fecha, LocalTime hora, int minutos, Integer numeroLlama, Integer numeroRecibe, String paisOrigen, String paisDestino) {
		Llamada llamada = new LlamadaInternacional(fecha , hora, minutos, numeroLlama, numeroRecibe, paisOrigen, paisDestino);
		Cliente clienteLlamo = buscarCliente(numeroLlama);
		Cliente clienteRecibio = buscarCliente(numeroRecibe);
		clienteLlamo.llamadasHechas.add(llamada);
		clienteRecibio.llamadasRecibidas.add(llamada);
		return llamada;
	}
	
	public Factura facturarLlamadas (Cliente c , LocalDate i , LocalDate f) {
		DateLapse periodo = new DateLapse (i,f);
		double precio = c.facturaDelCliente(i, f);
		return c.facturar(periodo , precio);
	}
}

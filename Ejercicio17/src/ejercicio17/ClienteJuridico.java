package ejercicio17;

import java.util.ArrayList;

public class ClienteJuridico extends Cliente {
	// a 
	// numero, INTEGER
	// nombre, STRING
	// direccion , String
	private int CUIT; // sería un long, pero paja 
	private String tipoPersona; 
	
	// a este metodo le falta aprovechar el polimorfismo
	public ClienteJuridico (Integer numero , String nombre , String direccion, int CUIT , String tipo) {
		super.numero = numero; 
		super.nombre = nombre; 
		super.direccion = direccion; 
		this.CUIT = CUIT; 
		this.tipoPersona = tipo;
		super.llamadasHechas = new ArrayList<>();
		super.llamadasRecibidas = new ArrayList<>();
	}
}

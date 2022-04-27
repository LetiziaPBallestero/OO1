package ejercicio17;

import java.util.ArrayList;

public class ClienteFisico extends Cliente {
	// a 
	// numero, hereda
	// direccion, nombre, hereda
	private String DNI; 
	
	// m 
	// a este metodo le falta aprovechar el polimorfismo
	public ClienteFisico (String n , String d , String DNI , Integer numero) {
		super.nombre = n;
		super.direccion = d; 
		this.DNI = DNI;
		super.numero = numero;
		super.llamadasHechas = new ArrayList<>();
		super.llamadasRecibidas = new ArrayList<>();
	}
	
	
	

}

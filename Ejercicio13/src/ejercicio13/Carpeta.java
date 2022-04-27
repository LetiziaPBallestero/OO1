package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
// atributos 
		private String nombre; 
		private List <Email> emails;

// metodos 
	
	public String getNombre() {
		return nombre;
	}
	
	public void aniadirEmail(Email email) {
		this.emails.add(email);
	}
	
	public void borrarEmail (Email email) {
		this.emails.remove(email);
	}
	
	public double tamanioEmails() {
		return emails.stream().mapToDouble(e -> e.tamanioEmail()).sum();
	}

	public Carpeta (String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}
	
	public Email buscar (String texto) {
		return emails.stream().
				filter(em -> em.existe(texto)).findFirst().orElse(null);
	}

}

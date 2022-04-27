package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
// atributos 
	private List <Carpeta> carpetas;
	private Carpeta inbox;
// metodos 
	
	public void aniadirCarpeta (Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir (Email email) {
		this.inbox.aniadirEmail(email);
	}
	
	public void mover (Email email , Carpeta origen , Carpeta destino) {	
		this.carpetas.get(carpetas.indexOf(origen)).borrarEmail(email);
		this.carpetas.get(carpetas.indexOf(destino)).aniadirEmail(email);
	}
	
	public Email buscar(String texto) {
		return carpetas.stream().map(car -> car.buscar(texto)).findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
		return carpetas.stream().mapToDouble(c -> c.tamanioEmails()).sum();
	}	
	
	public ClienteDeCorreo() {
		carpetas = new ArrayList<>();
	}
	
	
}

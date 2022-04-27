package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo; 
	private List <Archivo> adjuntos;
	
	public String getTitulo() {
		return titulo;
	}
	
	public boolean contiene (String texto) {
		return (cuerpo.contains(texto) || titulo.contains(texto));
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	private double tamanioAdjuntos() {
		return adjuntos.stream().mapToDouble(adjuntos -> adjuntos.tamanio()).sum();
	}
	
	public List<Archivo> adjutos() {
		return adjuntos;
	}
	
	public void aniadirAdjunto(Archivo adjunto) {
		this.adjuntos.add(adjunto);
	}
	
	public double tamanioEmail() {
		return this.titulo.replace(" ", "").length() + this.cuerpo.replace(" ", "").length() + tamanioAdjuntos();
	}
	
	public boolean existe (String texto) {
		return (titulo.contains(texto) || cuerpo.contains(texto));
	}

	public Email (String titulo , String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<>();
	}
	
	
	

}

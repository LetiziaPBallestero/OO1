package ejercicio13;

public class Archivo {
	private String nombre; 
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public double tamanio () {
		return this.nombre.replace(" ", "").length(); 
	}
	
	
	public Archivo () {	
	}

}

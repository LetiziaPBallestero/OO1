package ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class servicioUsuario {
	private List<Usuario> usuarios;
	
	// metodos 
	public Usuario registrarUsuario ( String nombre , String direccion , String dni) {
		Usuario usuario = new Usuario (nombre, dni , direccion);
		this.usuarios.add(usuario);
		return usuario;
	}
	
	public List<Reserva> obtenerReservas(Usuario usuario) {
		return usuario.obtenerReservas();
	}
	
	public double calcularIngresos(Usuario usuario, DateLapse periodo){
		return usuario.calcularIngresos(periodo);
	}
	
	// constructor
	public servicioUsuario() {
		this.usuarios = new ArrayList<>();
	}
}

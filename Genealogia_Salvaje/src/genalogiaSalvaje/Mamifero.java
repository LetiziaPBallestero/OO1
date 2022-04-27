package genalogiaSalvaje;

import java.util.Date;

public class Mamifero {
	//atributos 
	private String identificador;
	private String spp;
	private Date fechaNacimiento;
	protected Mamifero padre;
	protected Mamifero madre;
	
	// metodos 
	
	public Mamifero (String identificador) {
		this.identificador = identificador;
	}
	public Mamifero () {
	}
	
	public String getIdentificador() {
		return this.identificador;
		
	}
	
	public void setIdentificador (String id) {
		this.identificador = id; 
	}
	
	public String getEspecie() {
		return this.spp;
		
	}
	
	public void setEspecie (String spp) {
		this.spp = spp;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
		
	}
	
	public void setFechaNacimiento (Date fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero getPadre() {
		if (this.padre != null )
			return this.padre;
		else 
			return null;
	}
	
	public void setPadre (Mamifero padre) {
		this.padre = padre;
	}
	public void setMadre (Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getMadre() {
			return this.madre;
	}
	
	public Mamifero getAbueloMaterno () {
		if (this.madre != null) 
			return this.madre.getPadre();
		else 
			return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre != null) 
			return this.padre.getPadre();
		else 
			return null;
	}
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null) 
			return this.madre.getMadre();
		else 
			return null;
		
	}
	public Mamifero getAbuelaPaterna() {
		if (this.padre!= null) 
			return this.padre.getMadre();
		else 
			return null;
		
	}
	
	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		 return (false || (this.getMadre() == unMamifero) || (this.getPadre() == unMamifero)||((this.getPadre() != null)&&(this.getPadre().tieneComoAncestroA(unMamifero))||((this.getMadre()!= null)&&(this.getMadre().tieneComoAncestroA(unMamifero)))));    
    
	}
}

package ar.edu.unlp.info.oo1.Punto9;
import java.sql.Date;

public class Mamifero {
	private String id;
	private String especie;
	private Date fechaNac;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String especie) {
		this.especie = especie;
	}
	
	public String getIdentificador() {
		return id;
	}
	
	public void setIdentificador(String id) {
		this.id = id;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Date getFechaNacimiento() {
		return fechaNac;
	}
	
	public void setFechaNacimiento(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getPadre() {
		return this.padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}

	public Mamifero getAbueloMaterno() {
		if( this.madre == null) {
			return null;
		}
		return this.madre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		if( this.madre == null) {
			return null;
		}
		return this.madre.getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		if( this.padre == null) {
			return null;
		}
		return this.padre.getPadre();
	}	
	
	public Mamifero getAbuelaPaterna() {
		if( this.padre == null) {
			return null;
		}
		return this.padre.getMadre();
	}
	
	/*
	 Si el padre o madre es el mamifero o si el padre lo tiene como ancestro o si
	 la madre lo tiene como ancestro
	*/
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    if (this.padre == unMamifero || this.madre == unMamifero) {
	        return true;
	    }
	    if (this.padre != null && this.padre.tieneComoAncestroA(unMamifero)) {
	        return true;
	    }
	    if (this.madre != null && this.madre.tieneComoAncestroA(unMamifero)) {
	        return true;
	    }
	    return false;
	}
	
}

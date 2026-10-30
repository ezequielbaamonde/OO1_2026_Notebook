package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> adjuntos() {
		return new ArrayList<Archivo>(this.adjuntos);
	}
	
	public void agregarAdjunto(Archivo a) {
		this.adjuntos.add(a);
	}
	
	//Falta algún método más
	public boolean contiene(String texto) {
	    return this.titulo.contains(texto) || this.cuerpo.contains(texto);
	}
	
	public Integer espacioOcupado() {
		/*Integer suma = this.titulo.length() + this.cuerpo.length();
		
		for (Archivo a : adjuntos) {
			suma = suma + a.tamaño();
		}*/
		
		return this.titulo.length()
		         + this.cuerpo.length()
		         + this.adjuntos.stream().mapToInt(Archivo::tamaño).sum();
	}
	
	
}

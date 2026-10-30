package ar.edu.unlp.info.oo1.ejercicio17;
import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) {
		/*
		el enunciado dice que se puede asumir que el email está en
		la carpeta de origen cuando llega el mensaje. Esa es una precondición del método:
		quien lo llama es responsable de cumplirla, y no tenés que defenderte de un caso
		que el enunciado descarta.
		*/
		this.emails.remove(email);
		destino.AgregarEmail(email);
	}
	
	
	public Optional <Email> buscarEmail(String texto) {
		return this.emails.stream()
				.filter(e-> e.contiene(texto))
				.findFirst();
	}
	
	public Integer espacioOcupado() {
		return this.emails.stream()
				.mapToInt(e -> e.espacioOcupado())
				.sum();
	}
	
	
	//Nuevo
	public void AgregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public boolean contiene(Email e){
		return this.emails.contains(e);
		
	}
}

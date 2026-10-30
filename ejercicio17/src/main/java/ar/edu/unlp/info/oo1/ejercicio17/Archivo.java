package ar.edu.unlp.info.oo1.ejercicio17;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer tamaño() {
		return this.nombre.length();
	}
	
}

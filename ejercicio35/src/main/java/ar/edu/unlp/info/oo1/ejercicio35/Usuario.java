package ar.edu.unlp.info.oo1.ejercicio35;
import java.util.*;

public class Usuario {
	private String nombre;
	private List<Servicio> servicios;
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	public void agregarServicio(Servicio s) {
		servicios.add(s);
	}
	
	public double calcularGastoTotal() {
		return servicios.stream().mapToDouble(s -> s.calcularCosto()).sum();
	}
}

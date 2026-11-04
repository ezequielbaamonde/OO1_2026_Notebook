package ar.edu.unlp.info.oo1.ejercicio22;
import java.util.*;

public class Usuario {
	private String nombre;
	private String direccion;
	private String DNI;
	private List<Propiedad> propiedades;
	
	
	public Usuario(String nombre, String direccion, String DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	//Se verifica la dispo y se instancia una reserva
	public Reserva reservar(Propiedad p, TimeLapse periodo) {
		return p.reservar(periodo);
	}
	
	public boolean cancelarReserva(Reserva r) {
		if (r.estaEnCurso()) {
			return false;
		}
		r.getPropiedad().cancelarReserva(r);
		return true;
		
	}
	
	public double calcularIngresos(TimeLapse periodo) {
	    double total = this.propiedades.stream()
	            .mapToDouble(p -> p.calcularPrecioReservasEn(periodo))
	            .sum();
	    return total * 0.75;
	}
}

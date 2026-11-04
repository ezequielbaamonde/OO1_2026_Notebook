package ar.edu.unlp.info.oo1.ejercicio22;
import java.time.LocalDate;
import java.util.*;

public class Propiedad {
	private String direccion;
	private String nombreDesc;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String direccion, String nombreDesc, double precioPorNoche) {
		this.direccion = direccion;
		this.nombreDesc = nombreDesc;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
	}
	
	
	public double getPrecio() {
		return this.precioPorNoche;
	}
	
	public Reserva reservar(TimeLapse periodo) {
		 if (!this.consultarDispo(periodo)) {
		        return null;                       // no se crea la reserva
		    }
		    Reserva r = new Reserva(new DateLapse(periodo.getFrom(), periodo.getTo()), this);
		    this.reservas.add(r);
		    return r;
	}
	
	public boolean consultarDispo(TimeLapse periodo) {
	    return this.reservas.stream()
	            .noneMatch(r -> r.getPeriodo().overlaps(periodo));
	    /*
	     * Returns whether no elements of this stream match the
	     * provided predicate. May not evaluate the predicate on
	     * all elements if not necessary for determining the result.
	     * If the stream is empty then true is returned and the predicate is not evaluated.
	     * */
	}
	
	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}
	
	public void cancelarReserva(Reserva r) {
		this.reservas.remove(r);
	}
	
	// Propiedad
	public double calcularPrecioReservasEn(TimeLapse periodo) {
	    return this.reservas.stream()
	            .filter(r -> r.estaIncluidaEn(periodo))
	            .mapToDouble(r -> r.calcularPrecio())
	            .sum();
	}
}

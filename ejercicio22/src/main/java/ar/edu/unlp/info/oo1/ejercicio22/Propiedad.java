package ar.edu.unlp.info.oo1.ejercicio22;
import java.util.*;

public class Propiedad {
	private String direccion;
	private String nombreDesc;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaDeCancelacion politica;
	
	public Propiedad(String direccion, String nombreDesc, double precioPorNoche, PoliticaDeCancelacion politica) {
		this.direccion = direccion;
		this.nombreDesc = nombreDesc;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.politica = politica;
	}
	
	
	public double getPrecio() {
		return this.precioPorNoche;
	}
	
	public Reserva reservar(TimeLapse periodo) {
		 if (!this.consultarDispo(periodo)) {
		        return null;                       // no se crea la reserva
		    }
		    Reserva r = new Reserva(new DateLapse(periodo.getFrom(), periodo.getTo()), this);//desde, hasta, propiedad
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
	
	//Ahora es DOUBLE porque retorna el monto a reembolsar
	public double cancelarReserva(Reserva r) {
		this.reservas.remove(r);
		return this.politica.calcularReembolso(r);
		
	}
	
	
	public double calcularPrecioReservasEn(TimeLapse periodo) {
	    return this.reservas.stream()
	            .filter(r -> r.estaIncluidaEn(periodo))
	            .mapToDouble(r -> r.calcularPrecio())
	            .sum();
	}
}

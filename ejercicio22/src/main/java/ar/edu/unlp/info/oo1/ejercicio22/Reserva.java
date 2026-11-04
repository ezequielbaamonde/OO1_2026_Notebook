package ar.edu.unlp.info.oo1.ejercicio22;
import java.time.LocalDate;

public class Reserva {
	private TimeLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(TimeLapse periodo, Propiedad propiedad) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}
	
	public TimeLapse getPeriodo() {
		return this.periodo;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	public double calcularPrecio() {
		return this.periodo.sizeInDays() * this.propiedad.getPrecio();
	}
	
	public boolean estaEnCurso() {
	    LocalDate hoy = LocalDate.now();
	    return !hoy.isBefore(this.periodo.getFrom()) && hoy.isBefore(this.periodo.getTo());
	}
	
	
	public boolean estaIncluidaEn(TimeLapse otroPeriodo) {
	    return !this.periodo.getFrom().isBefore(otroPeriodo.getFrom())
	        && !this.periodo.getTo().isAfter(otroPeriodo.getTo());
	}
}

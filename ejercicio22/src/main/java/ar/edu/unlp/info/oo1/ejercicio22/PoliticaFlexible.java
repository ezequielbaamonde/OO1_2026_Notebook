package ar.edu.unlp.info.oo1.ejercicio22;
import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaDeCancelacion{
	
	public double calcularReembolso(Reserva r) {
		LocalDate fechaCancelacion= LocalDate.now();
		//Si la fecha de cancelación es antes del inicio de la reserva, se reembolsa el total
		if(fechaCancelacion.isBefore(r.getPeriodo().getFrom())) {
			return r.calcularPrecio();
		}
		return 0;
	}

}

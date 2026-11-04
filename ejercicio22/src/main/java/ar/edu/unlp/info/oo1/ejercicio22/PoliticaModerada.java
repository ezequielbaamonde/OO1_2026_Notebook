package ar.edu.unlp.info.oo1.ejercicio22;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada {
	/*
	 * reembolsa el monto total si la cancelación se hace hasta una semana antes y 50%
	 * si se hace hasta 2 días antes.
	 */
	public double calcularReembolso(Reserva r) {
		LocalDate fechaCancelacion = LocalDate.now();
		if (ChronoUnit.DAYS.between(fechaCancelacion, r.getPeriodo().getFrom()) >= 7) {
			return r.calcularPrecio();
		}else if(ChronoUnit.DAYS.between(fechaCancelacion, r.getPeriodo().getFrom()) >= 2) {
			return ((r.calcularPrecio()*50)/100);
		}
		return 0;
	}
}

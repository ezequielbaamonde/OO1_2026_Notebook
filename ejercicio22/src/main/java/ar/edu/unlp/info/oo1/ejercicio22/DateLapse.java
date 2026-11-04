package ar.edu.unlp.info.oo1.ejercicio22;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements TimeLapse{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return this.from;
		
	}
	
	public LocalDate getTo() {
		return this.to;
	}

	public int sizeInDays() {
		//Equivalente: return (int) from.until(to, ChronoUnit.DAYS);
		//Se pone (int) para castear el LONG que retorna ChronoUnit a int
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	
	//Estrictamente entre
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.from) && (other.isBefore(this.to)));
	}
	
	/*
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	Dos intervalos se superponen cuando cada uno empieza antes de que termine el otro:
	*/
	
	public boolean overlaps(TimeLapse anotherDateLapse) {
		/*
		 * No conviene apoyarse en includesDate: con intervalos idénticos, o uno contenido en otro con los mismos
		 * extremos, daría false porque es estricto. Con esta fórmula, además, dos reservas consecutivas (una termina
		 * el día 10 y la siguiente empieza el 10) no se superponen, que es lo razonable en un alquiler por noches.*/
		return this.from.isBefore(anotherDateLapse.getTo()) && anotherDateLapse.getFrom().isBefore(this.to);
	}

}
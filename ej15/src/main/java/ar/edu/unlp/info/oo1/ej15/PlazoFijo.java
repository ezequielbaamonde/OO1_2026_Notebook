package ar.edu.unlp.info.oo1.ej15;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private double montoDepositado;
	private LocalDate fecha;
	private double porcInteres;

	public PlazoFijo(LocalDate fecha, double monto, double interes) {
		this.montoDepositado = monto;
		this.fecha = fecha;
		this.porcInteres = interes;
	}
	
    public double valorActual() {
        long dias = ChronoUnit.DAYS.between(this.fecha, LocalDate.now());
        return this.montoDepositado
             + this.montoDepositado * (this.porcInteres / 100) * dias;
    }
}

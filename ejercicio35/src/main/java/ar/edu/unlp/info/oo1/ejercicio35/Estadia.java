package ar.edu.unlp.info.oo1.ejercicio35;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Estadia extends Servicio{
	private String destino;
	private double costoPorDia;
	private double cantidadPersonas;
	
	public Estadia(LocalDate fechaIni, LocalDate fechaFin,
					String destino, double costoPorDia, Integer cantidadDePersonas) {
		super(fechaIni, fechaFin);
		this.destino = destino;
		this.costoPorDia = costoPorDia;
		this.cantidadPersonas = cantidadDePersonas;
	}
	
	public double calcularCosto() {
		long dias = ChronoUnit.DAYS.between(this.getFechaInicio(), this.getFechaFin());
		return (this.costoPorDia * dias);
	}
}

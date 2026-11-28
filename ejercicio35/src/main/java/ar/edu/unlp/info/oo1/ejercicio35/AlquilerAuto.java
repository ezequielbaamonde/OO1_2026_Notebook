package ar.edu.unlp.info.oo1.ejercicio35;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AlquilerAuto extends Servicio{
	private double costoPorKM;
	private double kmRecorridos;
	private double costoDiarioSeguro;
	private String tipoVehiculo;
	
	public AlquilerAuto(LocalDate fechaIni, LocalDate fechaFin, double costoPorKM, double kmRecorridos, double costoDiarioSeguro, String tipoVehiculo) {
		super(fechaIni, fechaFin);
		this.costoPorKM = costoPorKM;
		this.kmRecorridos = kmRecorridos;
		this.costoDiarioSeguro = costoDiarioSeguro;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public double calcularCosto() {
		long dias = ChronoUnit.DAYS.between(this.getFechaInicio(), this.getFechaFin());
		return ((this.kmRecorridos * this.costoPorKM) + (this.costoDiarioSeguro * dias));
	}
}

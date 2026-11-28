package ar.edu.unlp.info.oo1.ejercicio35;

import java.time.LocalDate;

public abstract class Servicio {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	protected Servicio(LocalDate fechaIni, LocalDate fechaFin) {
		this.fechaInicio = fechaIni;
		this.fechaFin = fechaFin;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	protected abstract double calcularCosto();
}

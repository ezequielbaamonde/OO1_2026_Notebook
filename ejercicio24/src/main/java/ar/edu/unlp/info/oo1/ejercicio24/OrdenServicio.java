package ar.edu.unlp.info.oo1.ejercicio24;
import java.time.LocalDate;
import java.util.*;

public class OrdenServicio extends Orden{
	private String descripcion;
	private Integer horas;
	private List<Tecnico> tecnicos;
	
	public OrdenServicio(LocalDate fecha, String domicilio, String descripcion, Integer horas) {
		super(fecha, domicilio);
		this.descripcion = descripcion;
		this.horas = horas;
		this.tecnicos = new ArrayList<Tecnico>();
	}
	
	public double calcularCosto() {
		double costoTotal = (super.getProductos().stream().mapToDouble(p -> p.getCosto()).sum())
				+ (this.horas * tecnicos.stream().mapToDouble(t -> t.getValorHora()).sum());
		if (this.horas > 10) {
			return costoTotal - ((costoTotal * 10)/100);
		}
		return costoTotal;
	}
}

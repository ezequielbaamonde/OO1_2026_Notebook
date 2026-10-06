package ar.edu.unlp.info.oo1.ejercicio16;

import java.util.*;

public class ReporteDeConstruccion{
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}
	
	public double volumenDeMaterial(String nombreDeMaterial) {
		return this.piezas.stream()
				.filter(p -> p.getMaterial().equals(nombreDeMaterial))
				.mapToDouble(Pieza::volumen)
				.sum();
	}
	
	public double superficieDeColor(String nombreDeColor) {
		return this.piezas.stream()
				.filter(p -> p.getColor().equals(nombreDeColor))
				.mapToDouble(Pieza::superficieExterior)
				.sum();
	}
}

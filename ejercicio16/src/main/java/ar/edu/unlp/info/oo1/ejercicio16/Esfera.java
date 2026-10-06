package ar.edu.unlp.info.oo1.ejercicio16;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera (String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public double volumen() {
		return ((4/3)* Math.PI * Math.pow(radio, 3));
	}
	
	public double superficieExterior() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
}

package ar.edu.unlp.info.oo1.ejercicio16;

public class Cilindro extends Pieza{
	private double radio;
	private double altura;
	
	public Cilindro (String material, String color, double radio, double altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	public double volumen() {
		return Math.PI * this.radio * this.altura;
	}
	
	public double superficieExterior() {
		return ((2 * Math.PI * this.radio * this.altura) + ((2 * Math.PI * Math.pow(radio, 2))));
	}
}

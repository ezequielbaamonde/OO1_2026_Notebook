package ar.edu.unlp.info.oo1.ejercicio16;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular (String material, String color, double ladoMayor, double ladoMenor, double h) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = h;
	}
	
	public double volumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	public double superficieExterior() {
		return 2*(this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
}

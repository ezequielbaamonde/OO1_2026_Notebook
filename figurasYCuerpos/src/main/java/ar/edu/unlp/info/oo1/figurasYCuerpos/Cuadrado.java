package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado extends FiguraGeometrica {
	private double lado;
	
	
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getArea() {
		return (getLado() * getLado()); //Base * Altura
	}
	
	public double getPerimetro() {
		return (getLado()* 4);
	}
	
}

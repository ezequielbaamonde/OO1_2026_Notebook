package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo extends FiguraGeometrica{
	private double radio;
	private double diametro;
	
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setDiametro() {
		this.diametro = getDiametro();
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {	
		return (this.radio * 2);
	}
	
	public double getPerimetro() {
		return (Math.PI * getDiametro());
	}
	
	public double getArea() {
		return (Math.PI * (getRadio() * getRadio()));
	}
	
	
}

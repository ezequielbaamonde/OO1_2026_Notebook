package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private FiguraGeometrica caraBasal;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal (FiguraGeometrica cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * getAltura();
	}
	
	public double getSuperficieExterior(){
		return (2 * caraBasal.getArea() + caraBasal.getPerimetro() * getAltura());
	}
}

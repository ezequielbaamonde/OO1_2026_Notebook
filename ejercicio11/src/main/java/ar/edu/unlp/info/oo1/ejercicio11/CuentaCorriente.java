package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente(double monto) {
		super(monto);
		this.descubierto = 0;
	}
	
	public boolean puedeExtraer(double monto) {
		return (monto <= this.getSaldo() + this.getDescubierto());
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
}

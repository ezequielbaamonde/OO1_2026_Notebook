package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro(double monto) {
		super(monto);
		
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= (monto*1.02)) {
			return true;
		}
		return false;
	}
	
	protected void extraerSinControlar (double monto) {
		super.extraerSinControlar(monto*1.02);
	}
	
	public void depositar(double monto) {
		super.depositar(monto-(monto*0.02));
	}
}
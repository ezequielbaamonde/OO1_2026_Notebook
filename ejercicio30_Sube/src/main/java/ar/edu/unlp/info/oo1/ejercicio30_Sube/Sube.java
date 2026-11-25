package ar.edu.unlp.info.oo1.ejercicio30_Sube;

public class Sube implements Pago{
	private double saldo;
	
	public Sube (double saldo) {
		this.saldo = saldo;
	}
	
	public boolean recargar(double monto, Pago metodoDePago) {
		if(autorizarPago(monto)) {
			this.saldo += monto;
			metodoDePago.pagar(monto);
			return true;
		}
		return false;
	}
	
	public void pagar(double monto) {
		this.saldo -= monto;
	}
	
	//Método privado para poder pagar
	private boolean autorizarPago(double monto) {
		return this.saldo >= monto;
	}
}

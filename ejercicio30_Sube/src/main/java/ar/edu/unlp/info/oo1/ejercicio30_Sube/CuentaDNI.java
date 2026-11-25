package ar.edu.unlp.info.oo1.ejercicio30_Sube;

public class CuentaDNI implements Pago{
	private String sucursal;
	private String numero;
	private double saldo;
	
	public CuentaDNI (String sucursal, String numero, double saldo) {
		this.sucursal = sucursal;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	private boolean autorizarPago(double monto) {
		if (this.saldo >= monto) {
			return true;
		}
		return false;
	}
	
	public void pagar(double monto) {
		if (autorizarPago(monto)) {
			this.saldo -= monto;
		}
	}
}

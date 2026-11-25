package ar.edu.unlp.info.oo1.ejercicio30_Sube;

public interface Pago {
	//Tanto tarjeta, como sube, como cuentaDNI pagan.
	//autorizarPago es distinto en c/u y entiendo que es innecesario que sea público para poder pagar
	//es un proceso interno
	public void pagar(double monto);
}

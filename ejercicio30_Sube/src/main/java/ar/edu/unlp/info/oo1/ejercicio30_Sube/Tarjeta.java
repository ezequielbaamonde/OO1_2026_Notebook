package ar.edu.unlp.info.oo1.ejercicio30_Sube;
import java.time.LocalDate;
import java.util.*;

public class Tarjeta implements Pago{
	private String numero;
	private String titular;
	private LocalDate vencimiento;
	private List<Compra> compras;
	
	public Tarjeta (String numero, String titular, LocalDate vencimiento) {
		this.numero = numero;
		this.titular = titular;
		this.vencimiento = vencimiento;
		this.compras = new ArrayList<Compra>();
	}
	
	private boolean autorizarPago() {
		if (this.vencimiento.isAfter(LocalDate.now())) {
			return true;
		}
		return false;
	}
	
	public void pagar(double monto) {
		if (autorizarPago()) {
			Compra c = new Compra(LocalDate.now(), monto);
			compras.add(c);
		}

	}
	
}

package ar.edu.unlp.info.oo1.ejercicio24;
import java.time.LocalDate;

public class OrdenCompra extends Orden{
	private double precioEnvio;
	
	public OrdenCompra(LocalDate fecha, String domicilio, double precioEnvio) {
		super(fecha, domicilio);
		this.precioEnvio = precioEnvio;
	}
	
	public double calcularCosto() {
		double cantProductos = super.getProductos().size();
		double costo = super.getProductos().stream().mapToDouble(p -> p.getCosto()).sum();
		if(cantProductos >= 5) {
			return costo - ((costo * 10)/100); //Si lleva 5 o más productos, se le hace un 10% de descuento
		}//sino, sin descuneto
		return costo;
	}
}

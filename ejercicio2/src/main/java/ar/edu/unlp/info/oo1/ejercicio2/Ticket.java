package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;

//No es una subClase de Balanza porque NO ES una balanza.
public class Ticket {
	private LocalDate fecha;
	private Integer cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal; 
	
	public Ticket(LocalDate fecha, Integer cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}

	public double impuesto() {
		return (this.precioTotal*0.21); //El 21% del precioTotal
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public String emitirTicket() {
		return "Balanza [cantidadDeProductos=" + cantidadDeProductos + ", precioTotal=" + precioTotal + ", pesoTotal="
				+ pesoTotal + "]";
	}

}

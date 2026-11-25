package ar.edu.unlp.info.oo1.ejercicio24;
import java.time.LocalDate;
import java.util.*;

public abstract class Orden {
	private LocalDate fecha;
	private String domicilio;
	private List<Producto> productos;
	
	public Orden (LocalDate fecha, String domicilio) {
		this.fecha = fecha;
		this.domicilio = domicilio;
		this.productos = new ArrayList<Producto>();
	}
	
	public abstract double calcularCosto();
	
	public List<Producto> getProductos(){
		return productos;
	}
	
}

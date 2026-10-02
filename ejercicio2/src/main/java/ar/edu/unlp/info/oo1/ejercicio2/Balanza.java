package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private Integer cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	
	public Balanza() {
		this.ponerEnCero();
		this.productos = new ArrayList<Producto>();
	}
	
	public void ponerEnCero(){
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	

	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public Integer getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public Ticket emitirTicket() {
		return new Ticket(LocalDate.now(), this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
	}

	public List<Producto> getProductos(){
		return new ArrayList<>(this.productos); //Devuelvo una nueva lista de productos actuales
	}
}

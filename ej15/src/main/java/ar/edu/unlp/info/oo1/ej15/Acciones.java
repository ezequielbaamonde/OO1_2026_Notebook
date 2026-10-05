package ar.edu.unlp.info.oo1.ej15;

public class Acciones implements Inversion {
    private String nombre;
    private int cantidad;
    private double valorUnitario;
    
    public Acciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}

	public double valorActual() {
        return this.valorUnitario * this.cantidad;
    }
}

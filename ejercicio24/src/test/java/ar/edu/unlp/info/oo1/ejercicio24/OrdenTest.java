package ar.edu.unlp.info.oo1.ejercicio24;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*Particiones
 1- Sin productos | Valor de borde: 0 | Se espera costo: 0;
 2- Pocos productos, sin descuentos | Valor de bordes: 1, 2 o 3 | Se espera una suma simple
 3- Justo debajo del límite, 4 productos | Valor de Borde: 4 | Suma simple, sin descuento
 4- Con descuento | Valor de borde 5, 6 o más | Suma menos el 10%
*/



public class OrdenTest {
	OrdenCompra compra;
	OrdenServicio servicio;
	
	@BeforeEach
	void setUp() throws Exception{
		
	}
}

package ar.edu.unlp.info.oo1.ej15;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InversorTest {
	
	Inversor uno;
	Acciones ypf;
	PlazoFijo cdear;
	@BeforeEach
	void setUp() throws Exception {
		uno = new Inversor(); //Tiene inversiones
	}
	
	//Test's de Partición Equivalente
	@Test
	void valorActualConUnaInversion() {
		ypf = new Acciones("ypf", 1, 1000);
		uno.agregarInversion(ypf);
		assertEquals(1000, uno.valorActual());
	}
	
	@Test
	void valorActualConMuchasInversiones() {
		ypf = new Acciones("ypf", 1, 1000);
		cdear = new PlazoFijo(LocalDate.now().minusDays(10), 100, 2); //10 dias antes, 100 de monto y 2 porciento de interes diario
		uno.agregarInversion(ypf);
		uno.agregarInversion(cdear);
		assertEquals(1120, uno.valorActual(),  0.001); //valor esperado, método, tolerancia
		
	}
	
	@Test
	void valorActualSinInversion() {
		assertEquals(0, uno.valorActual());
	}
	
	//Test de Valores de Bordes para Plazos Fijos
	@Test
	//Dias: 0
	void plazoFijoConstituidoHoy() {
		cdear = new PlazoFijo(LocalDate.now(), 100, 2);
		assertEquals(100, cdear.valorActual(), 0.001);
	}
	
	@Test
	//Intereses: 0
	void plazoFijoSinInteres() {
		cdear = new PlazoFijo(LocalDate.now().minusDays(10), 100, 0);
		assertEquals(100, cdear.valorActual(), 0.001);
	}
	
	@Test
	//Dias: 1
	void plazoFijoConstituidoHaceUnDia() {
		cdear = new PlazoFijo(LocalDate.now().minusDays(1), 100, 2);
		assertEquals(102, cdear.valorActual(), 0.001);
	}
	
	@Test
	//Monto: 0 
	void plazoFijoConMontoCero() {
		cdear = new PlazoFijo(LocalDate.now().minusDays(10), 0, 2);
		assertEquals(0, cdear.valorActual(), 0.001);
	}
	
	//Test de Valores de Bordes para Acciones
	
	@Test
	//Cantidad: 0
	void accionesSinCantidad() {
		ypf = new Acciones("ypf", 0, 1000);
		assertEquals(0, ypf.valorActual());
	}
	
	@Test
	//ValorUnitario: 0
	void accionesSinValorUnitario() {
		ypf = new Acciones("ypf", 1, 0);
		assertEquals(0, ypf.valorActual());
	}
	
	@Test
	//Cantidad: 0
	void accionesConUnaUnidad() {
		ypf = new Acciones("ypf", 1, 1000);
		assertEquals(1000, ypf.valorActual());
	}
	
}

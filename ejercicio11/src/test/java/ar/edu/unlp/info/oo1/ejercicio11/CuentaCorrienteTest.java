package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	CuentaCorriente uno, dos;
	CajaDeAhorro tres;
	
	@BeforeEach
	void setUp() throws Exception {
		uno = new CuentaCorriente(0);
		dos = new CuentaCorriente(0);
		tres = new CajaDeAhorro(0);
	}
	
	@Test
	public void depositar() {
		uno.depositar(100);
		assertEquals(100, uno.getSaldo());
	}
	
	@Test
	public void extraer() {
		uno.setDescubierto(500);
		assertTrue(uno.extraer(300));
		assertEquals(-300, uno.getSaldo());
		dos.setDescubierto(500);
		assertFalse(uno.extraer(600));
		assertEquals(0, dos.getSaldo());
	}
	
	@Test
	public void transferirACuenta() {
		uno.setDescubierto(200);
		assertFalse(uno.transferirACuenta(300, dos));
		assertEquals(0, uno.getSaldo());
		assertEquals(0, dos.getSaldo());
		assertTrue(uno.transferirACuenta(100, dos));
		assertEquals(-100, uno.getSaldo());
		assertEquals(100, dos.getSaldo());
	}
	
	@Test
	public void transferirACajaDeAhorro() {
		uno.setDescubierto(100);
		assertTrue(uno.transferirACuenta(100, tres));
		assertEquals(-100, uno.getSaldo());
		assertEquals(98, tres.getSaldo());
	}
}

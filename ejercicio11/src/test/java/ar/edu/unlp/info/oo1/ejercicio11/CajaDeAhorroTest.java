package ar.edu.unlp.info.oo1.ejercicio11;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CajaDeAhorroTest {
	
	CajaDeAhorro uno, dos, tres, cinco;
	CuentaCorriente cuatro;
	
	@BeforeEach
	void setUp() throws Exception {
		uno = new CajaDeAhorro(0);
		dos = new CajaDeAhorro(100);
		tres = new CajaDeAhorro(0);
		cuatro = new CuentaCorriente(0);
		cinco = new CajaDeAhorro(102);
	}
	
	
    @Test
    public void testDepositar() {
    	uno.depositar(100);
    	assertEquals(98, uno.getSaldo());
    }
    
    @Test
    public void testExtraer() {
    	uno.depositar(100);
    	uno.extraer(50);
    	assertEquals(47, uno.getSaldo());
    }
    
    @Test
    public void transferirACuenta() {
    	uno.depositar(100);
    	assertEquals(98, uno.getSaldo());
    	assertFalse(uno.transferirACuenta(98, tres));
    	assertEquals(98, uno.getSaldo());
    	assertEquals(0, tres.getSaldo());
    	assertTrue(uno.transferirACuenta(50, tres));
    	assertEquals(47, uno.getSaldo());
    	assertEquals(49, tres.getSaldo());
    }
    
	@Test
	public void transferirACuentaCorriente() {
		assertTrue(cinco.transferirACuenta(100, cuatro));
		assertEquals(0, cinco.getSaldo());
		assertEquals(100, cuatro.getSaldo());
		
	}
}

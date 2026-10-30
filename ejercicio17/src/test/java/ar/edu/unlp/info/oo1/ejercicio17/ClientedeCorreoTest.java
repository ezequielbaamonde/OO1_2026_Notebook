package ar.edu.unlp.info.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ClientedeCorreoTest {
	
	ClienteDeCorreo ezequiel, vacio, conAdjunto;
	Email e1, e2, eTitulo, eCuerpo, eArchivo;
	Archivo arch1;
	
	@BeforeEach
	void setUp() throws Exception {
		e1 = new Email("T", "Testings");
		e2 = new Email("T2", "Testing2");
		
		ezequiel = new ClienteDeCorreo();
		eTitulo = new Email("Sugerencia Fudo", "Informe Final"); //Tamaño 28
		eCuerpo = new Email("Sugerencia Núcleo It", "Informe Principal"); //Tamaño 37
		ezequiel.recibir(eTitulo);
		ezequiel.recibir(eCuerpo);
		
		vacio = new ClienteDeCorreo();
		
		conAdjunto = new ClienteDeCorreo();
		eArchivo = new Email("uno", "dos"); //6
		arch1 = new Archivo("Eze.pdf"); //7
		eArchivo.agregarAdjunto(arch1);
		conAdjunto.recibir(eArchivo);
	}
	
	//Test's de Borde
    @Test
    public void recibirUnEmail() {
        ezequiel.recibir(e1);
        assertTrue(ezequiel.getInbox().contiene(e1));
    }
    
    @Test
    public void recibirVariosEmails() {
    	ezequiel.recibir(e1);
    	ezequiel.recibir(e2);
    	assertTrue(ezequiel.getInbox().contiene(e1));
    	assertTrue(ezequiel.getInbox().contiene(e2));
    	
    }
    
    @Test
    public void noRecibiEmail() {
    	assertFalse(ezequiel.getInbox().contiene(e1));
    }
    
    @Test
    public void espacioOcupadoSinEmails() {
    	assertEquals(0, vacio.espacioOcupado());
    }
    
    
    //Test's de partición equivalente-> Buscar, ya que tiene varias particiones depende el texto buscar
    @Test
    public void buscarPorTitulo(){
    	assertEquals(eTitulo, ezequiel.buscar("Fudo"));
    }
    
    @Test
    public void buscarPorCuerpo() {
    	assertEquals(eCuerpo, ezequiel.buscar("Principal"));
    }
    
    @Test
    public void buscarInexistente() {
    	assertNull(ezequiel.buscar("Vacaciones"));
    }
    
    
    @Test
    public void espacioOcupadoAumentaAlRecibir() {
    	ezequiel.recibir(e1); //9
    	assertEquals(74, ezequiel.espacioOcupado());
    }
    
    @Test
    public void espacioOcupadoSinAdjuntos() {
    	assertEquals(65, ezequiel.espacioOcupado());
    }
    
    @Test
    public void espacioOcupadoConAdjuntos() {
    	assertEquals(13, conAdjunto.espacioOcupado());
    }
    
    
    
    
    
    
    
    
}

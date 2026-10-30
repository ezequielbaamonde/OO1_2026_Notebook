package ar.edu.unlp.info.oo1.ejercicio17;
import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.AgregarEmail(email);
	}
	
	
	/* En respuesta al mensaje buscar retorna el primer email en el Cliente de Correo cuyo
	 título o cuerpo contienen el texto indicado como parámetro. Busca en todas las carpetas. */
	
	//Consultar el map y flatMap, si hay otra alternativa
	public Email buscar(String texto) {
	    return this.carpetas.stream()
	            .map(c -> c.buscarEmail(texto)) //.map(c -> c.buscar(texto)): cada carpeta devuelve su Optional<Email>
	            .flatMap(Optional::stream) // .flatMap(Optional::stream): convierte cada Optional en un stream de 0 o 1 elemento y los aplana, así que los vacíos desaparecen.
	            .findFirst() //toma el primer email encontrado, respetando el orden de las carpetas
	            .orElse(null); //si no hubo ninguno, devuelve null, que es lo que corresponde a la firma buscar(texto): Email
	}
	
	public Integer espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(c -> c.espacioOcupado())
				.sum();
	}
	
	
	public Carpeta getInbox(){
		return this.inbox;
	}

}

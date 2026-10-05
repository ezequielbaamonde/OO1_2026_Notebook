package ar.edu.unlp.info.oo1.ej15;
import java.util.*;

public class Inversor {
    private List<Inversion> inversiones = new ArrayList<Inversion>();

    public void agregarInversion(Inversion inversion) {
        this.inversiones.add(inversion);
    }

    public double valorActual() {
        return this.inversiones.stream()
                .mapToDouble(Inversion::valorActual)
                .sum();
    }
}

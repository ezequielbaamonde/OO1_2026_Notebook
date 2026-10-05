package ar.edu.unlp.info.oo1.ej15;

import java.time.LocalDate;


public class Inversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inversor inversor = new Inversor();

        Inversion ypf = new Acciones("YPF", 10, 25.5);
        Inversion telecom = new Acciones("Telecom", 5, 100);
        //.minusDays(10) le resta 10 días a esa fecha y devuelve una nueva LocalDate
        //(por ejemplo, si hoy es 05/10/2026, devuelve 25/09/2026).
        Inversion plazo1 = new PlazoFijo(LocalDate.now().minusDays(10), 1000, 0.5);
        Inversion plazo2 = new PlazoFijo(LocalDate.now().minusDays(5), 2000, 1);

        inversor.agregarInversion(ypf);
        inversor.agregarInversion(telecom);
        inversor.agregarInversion(plazo1);
        inversor.agregarInversion(plazo2);

        System.out.println("Valor actual de cada inversión:");
        System.out.println("  Acciones YPF:     " + ypf.valorActual());
        System.out.println("  Acciones Telecom: " + telecom.valorActual());
        System.out.println("  Plazo fijo 1:     " + plazo1.valorActual());
        System.out.println("  Plazo fijo 2:     " + plazo2.valorActual());

        System.out.println("Total del inversor: " + inversor.valorActual());
    }
}

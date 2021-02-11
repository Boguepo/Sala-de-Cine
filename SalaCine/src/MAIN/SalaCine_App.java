package MAIN;

import OBJ.Cine;
import OBJ.Espectador;

public class SalaCine_App {

	public static void main(String[] args) {
		Cine cine1 = new Cine(7.5);
		
		cine1.llenarSalaAut(7);
		
		Espectador esp1 = new Espectador();
		
		cine1.llenarSala(esp1);

	}

}

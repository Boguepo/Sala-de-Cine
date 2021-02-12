package MAIN;
/*
 * @author Toni Arjona
 * */
import OBJ.Cine;
import OBJ.Espectador;

public class SalaCine_App {

	public static void main(String[] args) {
		//Creo cine
		Cine cine1 = new Cine(7.5);
		//Lleno la sala sola
		cine1.llenarSalaAut(9);
		//Creo un espectador
		Espectador esp1 = new Espectador();
		//Compruebo si el espectador se puede sentar
		cine1.llenarSala(esp1);
		//Imprimo la sala
		cine1.imprimirSala(cine1);

	}

}

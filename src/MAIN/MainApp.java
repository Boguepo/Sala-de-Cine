package MAIN;
import OBJECT.Cine;
import OBJECT.Pelicula;

public class MainApp {

	public static void main(String[] args) {
		//creamos el objeto Pelicula 
		Pelicula miPeli = new Pelicula();
		//creamos el objeto de la clase cine pasandole como parametros la pelicula y el precio. 
		//al crear nos muestra toda la info que nos interesa
		Cine miCine = new Cine(miPeli, 12);
	}
}

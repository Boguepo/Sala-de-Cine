package OBJECT;
import java.util.Hashtable;
import java.util.Random;

//Del cine nos interesa conocer la película que se está reproduciendo y el precio de la entrada en el cine.

/**
 * @author: Myroslav Andreykiv
 **/

public class Cine {
	//Clase random
	Random rnd = new Random();
	//CONSTANTES
	private final int FILAS = 8;
	private final int COLUMNAS = 9;
	
	//ATRIBUTOS
	private Pelicula pelicula;
	private int precio;
	
	private String[] asientos = new String[72];
	//creamos una array de boolean con valor por defecto false para cambiar cuando los asientos del mismo index se ocupen
	private boolean[] siOcupados = new boolean[72];
	//creamos un hastable con objeto Espectador y el asiento asignado.
	Hashtable<Espectador, String> asientoEspectador = new Hashtable<>();
	
	//constructor por defecto
	public Cine() {
		this.precio = 0;
	}
	
	//constructor con parametros pelicula y precio
	public Cine(Pelicula pelicula, int precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		//al crear el objeto Cine se crean los asientos
		crearAsientos();
		//asignamos los asientos creando un nuevo Espectador
		asignarAsiento();
	}

	//METODOS
	//comprobamos que el espectador tiene dinero suficiente para ver la peli y devolvemos true o false
	public boolean tieneDinero(Espectador espectador) {
		boolean tieneDinero = false;
		if(espectador.getDinero() >= precio) {
			tieneDinero = true;
		}
		return tieneDinero;
	}
	
	//comprobamos que el espectador tiene edad suficiente para ver la peli y devolvemos true o false
	public boolean tieneEdad(Espectador espectador) {
		boolean tieneEdad = false;
		if(espectador.getEdad() >= pelicula.getEdadMinima()) {
			tieneEdad = true;
		}
		return tieneEdad;
	}
	
	//asignamos un espectador a cada asiento de forma aleatorio si el asiento está disponible 
	public void asignarAsiento() {
		System.out.println("Datos de la pelicula: " + 
				"\n Título: " + pelicula.getTitulo() +
				"\n Director: " + pelicula.getDirector() +
				"\n Duración: " + pelicula.getDuracion() +
				"\n Edad mínima: " + pelicula.getEdadMinima());
		do {
			//generamos un número random de la posicion del asiento (72 asientos)
			int randomAsiento = rnd.nextInt(72);
			//generamos nuevo espectador hasta que todos los asientos no estén ocupados
			Espectador espectador = new Espectador();
			//comprobamos si el espectador tiene dinero y edad
			if(tieneEdad(espectador) && tieneDinero(espectador)) {
				//comprobamos que el asiento esté libre
				if(siOcupados[randomAsiento] == false ) {
					//si el asiento está libre añadimos al Hashtable asientoEspectador el espectador y el valor de su asiento
					asientoEspectador.put(espectador, asientos[randomAsiento]);
					System.out.println("El Espectador " + espectador.getNombre() + " tiene " 
					+ espectador.getEdad() + " años" + " y su asiento es: " + asientos[randomAsiento]);
					//cambiamos el valor de siOcupados a true para que no se pueda ocupar mas
					siOcupados[randomAsiento] = true;
				}
			}
		//hasta que el tamaño de hashtable no sea igual al numero de asientos 
		} while(asientoEspectador.size() != asientos.length);
	}
	
	//populamos el array String sala creado anteriormente con NUMERO+LETRA
	public void crearAsientos() {
		int filas = 8; int columnas = 9; int startCharAt = 65; int indexAt = 0;
		for(int x = 8; x > 0; x--) {
			for(int z = 9; z > 0; z--) {
				String newChar = String.valueOf((char) startCharAt);
				asientos[indexAt] = x+newChar;
				indexAt++;
				startCharAt++;
			}
			//numero ascii del Valor 'A'
			startCharAt = 65;
		}
	}

	//GETTERS Y SETTERS
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String[] getAsientos() {
		return asientos;
	}
	public void setAsientos(String[] asientos) {
		this.asientos = asientos;
	}
	
	public Hashtable<Espectador, String> getAsientoEspectador() {
		return asientoEspectador;
	}

	public void setAsientoEspectador(Hashtable<Espectador, String> asientoEspectador) {
		this.asientoEspectador = asientoEspectador;
	}

	public boolean[] getSiOcupados() {
		return siOcupados;
	}

	public void setSiOcupados(boolean[] siOcupados) {
		this.siOcupados = siOcupados;
	}
}

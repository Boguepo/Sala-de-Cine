package OBJECT;
import java.util.Random;

//De las películas nos interesa saber el título, duración, edad mínima y director.

/**
 * @author: Myroslav Andreykiv
 **/

public class Pelicula {
	
	//clase random
	private Random r = new Random();
	//CONSTANTES
	final private String[] ARR_DIRECTORES = {"Carlos Kleiber", "Nikolaus Harnoncourt ", "Wilhelm Furtwängler", "Arturo Toscanini", "Simon Rattle"};
	final private String[] ARR_PELICULAS = {"Abominable","Apollo 11","El hoyo","Frozen II","La hija de una radron"};
	final private int[] ARR_EDAD_MINIMA = {0,7,12,16,18};
	final private int DURACION = r.nextInt(180) + 30;
	
	//ATRIBUTOS
	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	//CONSTRUCTORES
	//por defecto con todo aleatorio
	public Pelicula() {
		setTitulo();
		this.duracion = DURACION;
		setEdad();
		setDirector();
	}
	
	//METODOS
	public void setDirector() {
		int randomIndex = r.nextInt(5);
		this.director = ARR_DIRECTORES[randomIndex];
	}
	
	public void setTitulo() {
		int randomIndex = r.nextInt(5);
		this.titulo = ARR_PELICULAS[randomIndex];
	}
	
	public void setEdad() {
		int randomIndex = r.nextInt(5);
		this.edadMinima = ARR_EDAD_MINIMA[randomIndex];
	}
	//GETTERS Y SETTERS

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
}

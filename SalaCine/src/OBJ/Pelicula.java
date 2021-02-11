package OBJ;

import java.util.Random;

public class Pelicula {
	private Random r = new Random();
	
	final private String peliculas[] = {"Abominable","Apollo 11","El hoyo","Frozen II","La hija de una radron"};
	final private String[] ARR_DIRECTORES = {"Carlos Kleiber", "Nikolaus Harnoncourt ", "Wilhelm Furtwängler", "Arturo Toscanini", "Simon Rattle"};
	final private int pegi[] = {0,7,12,16,18};
	final private int DUR_DEF = r.nextInt(180)+30;
	
	private String titulo;
	private int duracion;
	private int edadMin;
	private String director;
	
	
	public Pelicula() {
		int i = r.nextInt(5);
		this.titulo = peliculas[i];
		this.duracion = DUR_DEF;
		this.edadMin = pegi[i];
		this.director = ARR_DIRECTORES[i];
	}
	

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


	public int getEdadMin() {
		return edadMin;
	}


	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}
	
	

}

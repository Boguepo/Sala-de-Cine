package OBJECT;
import java.util.Random;

//Del espectador, nos interesa saber su nombre, edad y el dinero que tiene

/**
 * @author: Myroslav Andreykiv
 **/

public class Espectador {
	private Random r = new Random();
	//CONSTANTES
	//la edad del espectador puede ser entre 3 y 60 años.
	final private int EDAD_DEF = r.nextInt(57)+3;
	//el uspectador creado por defecto puede tener entre 5 y 50€
	final private int DINERO_DEF = r.nextInt(45)+5;
	final private String[] ARR_NOMBRES = {"Jose", "Nicol", "Myroslav", "Toni"};	
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private int dinero;
	private Asiento asiento;
	
	//CONSTRUCTORES
	//por defecto
	public Espectador() {
		setNombre();
		this.edad = EDAD_DEF;
		this.dinero = DINERO_DEF;
	}
	
	//con todos params
	public Espectador(int dinero) {
		setNombre();
		this.edad = EDAD_DEF;
		this.dinero = dinero;
	}
	
	//METODOS
	//asignar el nombre aleatorio al espectador
	public void setNombre() {
		int randomIndex = r.nextInt(4);
		this.nombre = ARR_NOMBRES[randomIndex];
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
}

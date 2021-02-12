package OBJ;

import java.util.Random;

public class Espectador {
//Constantes y objetos a usar
	private Random r = new Random();
	private int EDAD_DEF = r.nextInt(50)+1;
	private final String arrNombres[] = {"Jose","Nicol","Myroslav","Toni"};
	private int DINERO_DEF = r.nextInt(15)+5;
	//Atributos
	private String nombre;
	private int edad;
	private int dinero;
	private String asiento;
	
	//Constructor por defecto que genera un espectador aleatorio
	public Espectador() {
		randNombre();
		this.edad = EDAD_DEF;
		this.dinero = DINERO_DEF;
		this.asiento = "";
	}
	
//Metodo que escoje un nombre random
	private void randNombre() {
		int i = r.nextInt(3);
		this.nombre = arrNombres[i];
		
	}

//GET & SET
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


	public String getAsiento() {
		return asiento;
	}


	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	
	
	

}

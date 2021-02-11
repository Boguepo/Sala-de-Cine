package OBJ;

import java.util.Random;

public class Espectador {
	private Random r = new Random();
	private int EDAD_DEF = r.nextInt(50)+1;
	private final String arrNombres[] = {"Jose","Nicol","Myroslav","Toni"};
	private int DINERO_DEF = r.nextInt(15)+5;
	
	private String nombre;
	private int edad;
	private int dinero;
	private String asiento;
	
	public Espectador() {
		randNombre();
		this.edad = EDAD_DEF;
		this.dinero = DINERO_DEF;
	}
	

	private void randNombre() {
		int i = r.nextInt(3);
		this.nombre = arrNombres[i];
		
	}


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

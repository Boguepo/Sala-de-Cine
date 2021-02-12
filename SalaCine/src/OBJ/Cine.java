package OBJ;

import java.util.ArrayList;
import java.util.Random;
import VISUAL.Visual;//Llamada a la clase vista

public class Cine {
	//Declaramos constantes y objetos a usar
	private Random r = new Random();
	private Visual v = new Visual();//llamada a la vista para poder imprimir
	private final int FILAS = 8;
	private final int COLUM = 9;
	
	//Atributos
	private Pelicula peli;
	private double precio;
	private int filas;
	private int columnas;
	private Asiento sala[][] = new Asiento[FILAS][COLUM];
	private ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
	
	//Constructor como solo queremos hacer un cine si tenemos precio para la entrada no defino constructor por defecto
	public Cine(double precio) {
		this.peli = new Pelicula();
		this.precio = precio;
		this.filas = FILAS;
		this.columnas = COLUM;
		crearSala();
	}
	//Metodo que me crea la sala con un asiento por posicion
	private void crearSala() {
		int nf = FILAS,f = 0, c = 0, ch = 65;
		
		while(f < FILAS) {
			while(c < COLUM) {
				this.sala[f][c] = new Asiento(Integer.toString(nf)+Character.toString(ch));
				ch++;
				c++;
			}
			nf--;
			f++;
			ch = 65;
			c=0;
		}
	}
	//Metodo que me rellena la sala automaticamente con el numero de espectadores deseado
	public void llenarSalaAut(int nEspectadores) {
		crearEspectadores(nEspectadores);
		
	}
	//Metodo que marca los asientos como ocupados
	private void crearEspectadores(int nEspectadores) {
		int  i = 0;
		 while(i<nEspectadores) {
			 
			 	String asiento = generarAsiento();//genero el id de una asiento aleatorio
				
				for(Asiento[] as:this.sala) {
					for (int j = 0; j < as.length; j++) {
						if(asiento.equals(as[j].getId())) {
							as[j].setOcupado(true);
						}
					}
				}
				i++;
			 }
		
	}
//Metodo que genera un ID aleatorio 
	private String generarAsiento() {
			int  f = r.nextInt(FILAS)+1;
			int l = r.nextInt(COLUM)+1;
			return Integer.toString(f)+Character.toString(65+l);
		
	}
//Metodo que te añade un espectador si cumple unas condiciones
	public void llenarSala(Espectador espec) {
		//conjunto de comprobaciones para saber si el espectador se puede sentar o no
		if(espec.getDinero() > this.precio) {
			String asiento = generarAsiento();
			int f = 0, c = 0;
			boolean sentado = false;
			
			while(f < this.sala.length){
				while(c < this.sala[f].length) {
					
					if(this.sala[f][c].isOcupado()) {
						asiento = generarAsiento();
						
					}else {
						sentado = true;
						
						
					}
					
					c++;
				}
				f++;
				c=0;
			}
			if(sentado && espec.getEdad() > this.peli.getEdadMin()) {
				espec.setAsiento(asiento);
				this.espectadores.add(espec);
				v.isSentado();
			}else if(espec.getEdad() < this.peli.getEdadMin()){
				v.noEdadMin();
				
			}
			
		}else {
			v.noDienro();
		}
	}
	//Metodo que imprime la sala del cine
	public void imprimirSala(Cine cine) {
		v.verCine(cine);//llamada a la vista para imprimir
		
		
	}
	//GET & SET
	public Pelicula getPeli() {
		return peli;
	}

	public void setPeli(Pelicula peli) {
		this.peli = peli;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public Asiento[][] getSala() {
		return sala;
	}
	//Sobrecarga del getSala para poder recorrer el array desde el visual
	public int getSala(int f) {
		return sala[f].length;
	}
	//Sobrecarga del getSala para poder recorrer el array desde el visual
	public Asiento getAsientoSala(int f, int c) {
		return sala[f][c];
	}

	public void setSala(Asiento[][] sala) {
		this.sala = sala;
	}
	
	

}

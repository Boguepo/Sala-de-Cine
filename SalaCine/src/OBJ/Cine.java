package OBJ;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Cine {
	private Random r = new Random();
	private final int FILAS = 8;
	private final int COLUM = 9;
	
	private Pelicula peli;
	private double precio;
	private int filas;
	private int columnas;
	private Asiento sala[][] = new Asiento[FILAS][COLUM];
	private ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
	
	public Cine(double precio) {
		this.peli = new Pelicula();
		this.precio = precio;
		this.filas = FILAS;
		this.columnas = COLUM;
		crearSala();
	}

	private void crearSala() {
		int nf = FILAS,f = 0, c = 0, ch = 65;
		
		while(f < this.sala.length) {
			while(c < COLUM) {
				this.sala[f][c] = new Asiento(Integer.toString(nf)+Character.toString(ch));
				ch++;
				c++;
			}
			nf--;
			f++;
			ch = 65;
		}
	}
	
	public void llenarSalaAut(int nEspectadores) {
		crearEspectadores(nEspectadores);
		int f = 0, c = 0;
		
		while(f < this.sala.length){
			while(c < this.sala[f].length) {
				for(Espectador es:this.espectadores) {
				if(this.sala[f][c].getId().equals(es.getAsiento())) {// si el asiento en la posicion actual tiene el mismo ID que el del espectador entra
					this.sala[f][c].setOcupado(true);
					
				}
				}
				c++;
			}
			f++;
		} 
		
	}
	
	private void crearEspectadores(int nEspectadores) {
		int  i = 0;
		 while(i<nEspectadores) {
			 
			 	String asiento = generarAsiento();
				
				Espectador esp = new Espectador();
				this.espectadores.add(esp);
				this.espectadores.get(i).setAsiento(asiento);
				i++;
			 }
		
	}

	private String generarAsiento() {
			int  f = r.nextInt(FILAS)+1;
			int l = r.nextInt(COLUM)+1;
			return Integer.toString(f)+Character.toString(65+l);
		
	}

	public void llenarSala(Espectador espec) {
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
			}
			if(sentado && espec.getEdad() > this.peli.getEdadMin()) {
				espec.setAsiento(asiento);
				this.espectadores.add(espec);
			}else {
				JOptionPane.showMessageDialog(null, "Edad minima no alcanzada");
			}
			
		}
	}
	
	public void imprimirSala() {
		System.out.println("Pelicula: "+peli.getTitulo());
		System.out.println("Precio: "+this.precio);
		//Por acabar
	}

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

	public void setSala(Asiento[][] sala) {
		this.sala = sala;
	}
	
	

}

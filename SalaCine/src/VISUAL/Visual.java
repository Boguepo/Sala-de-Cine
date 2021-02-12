package VISUAL;

import javax.swing.JOptionPane;

import OBJ.Cine;

public class Visual {
	//Metodos para imprimir por pantalla
	public void noEdadMin() {
		JOptionPane.showMessageDialog(null, "Edad minima no alcanzada");
		
	}

	public void verCine(Cine cine) {
		System.out.println("Pelicula: "+(cine.getPeli()).getTitulo());
		System.out.println("Precio: "+cine.getPrecio());
		
		for (int i = 0; i < (cine.getSala()).length; i++) {
			for (int j = 0; j < cine.getSala(i); j++) {
				if(cine.getSala()[i][j].isOcupado()) {
					System.out.println("Asiento: "+cine.getSala()[i][j].getId()+" Esta ocupado");
				}
			}
		}
		
		
		
	}

	public void noDienro() {
		JOptionPane.showMessageDialog(null, "Dinero insuficiente");
		
	}

	public void isSentado() {
		JOptionPane.showMessageDialog(null, "Espectador sentado");
		
	}

}

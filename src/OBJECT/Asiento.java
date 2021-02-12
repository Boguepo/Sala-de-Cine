package OBJECT;
/**
 * @author: Myroslav Andreykiv
 **/
public class Asiento {
	//ATRIBUTOS
	private boolean ocupado;
	private String id;

	//CONSTRUCTOR
	public Asiento(String id) {
		this.ocupado = false;
		this.id = id;
	}
	
	//GETTERS Y SETTERS
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}

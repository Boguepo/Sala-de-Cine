package OBJ;

public class Asiento {
	//Constantes
	private final boolean OC_DEF = false;
	//Atributos	
	private String id;
	private boolean ocupado;
	
	//Constructor por defecto que nos pide el identificador
	public Asiento(String id) {
		this.id = id;
		this.ocupado = OC_DEF;
	}
	//GET & SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	

}

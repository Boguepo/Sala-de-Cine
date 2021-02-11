package OBJ;

public class Asiento {

	private final boolean OC_DEF = false;
	
	private String id;
	private boolean ocupado;
	
	public Asiento(String id) {
		this.id = id;
		this.ocupado = OC_DEF;
	}

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

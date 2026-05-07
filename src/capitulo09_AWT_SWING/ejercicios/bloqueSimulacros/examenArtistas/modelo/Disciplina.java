package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo;

public class Disciplina {
	
	private int id;
	private String descripcion;
	
	
	public Disciplina() {
		super();
	}
	
	public Disciplina(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return descripcion;
	}

}

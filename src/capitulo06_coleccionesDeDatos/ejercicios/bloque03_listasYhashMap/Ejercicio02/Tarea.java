package capitulo06_coleccionesDeDatos.ejercicios.bloque03_listasYhashMap.Ejercicio02;

public class Tarea {

	private int id;
	private String descripcion;
	private Boolean completada;
	
	/**
	 * 
	 * @param id
	 * @param descripcion
	 */
	public Tarea(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.completada = false;
	}

	
	////////////////////////////////////////////////

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
	public Boolean getCompletada() {
		return completada;
	}
	public void setCompletada(Boolean completada) {
		this.completada = completada;
	}

	@Override
	public String toString() {
		return "Tarea " + id + " | descripcion = " + descripcion + " | completada = " + completada;
	}
	
}

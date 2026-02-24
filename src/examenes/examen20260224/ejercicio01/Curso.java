package examenes.examen20260224.ejercicio01;

public class Curso {

	private int id;
	private String nombre;
	private int duracionHoras;
	private int precio;
	
	
	
	public Curso(int id, String nombre, int duracionHoras, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracionHoras = duracionHoras;
		this.precio = precio;
	}
	
	///////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracionHoras() {
		return duracionHoras;
	}
	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", precio=" + precio
				+ "]";
	}
	
}

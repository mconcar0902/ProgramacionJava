package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo;

public class Provincia {

	private int id;
	private String nombre;
	
	
	public Provincia() {
		super();
	}
	
	public Provincia(int id, String provincia) {
		super();
		this.id = id;
		this.nombre = provincia;
	}
	
///////////////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String provincia) {
		this.nombre = provincia;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}

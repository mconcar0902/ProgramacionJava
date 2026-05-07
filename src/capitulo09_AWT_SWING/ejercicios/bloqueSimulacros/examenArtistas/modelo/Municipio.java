package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo;

public class Municipio {

	private int id;
	private int idProvicia;
	private String nombre;
	
	
	public Municipio() {
		super();
	}
	
	public Municipio(int id, int idProvicia, String nombre) {
		super();
		this.id = id;
		this.idProvicia = idProvicia;
		this.nombre = nombre;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProvicia() {
		return idProvicia;
	}
	public void setIdProvicia(int idProvicia) {
		this.idProvicia = idProvicia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}

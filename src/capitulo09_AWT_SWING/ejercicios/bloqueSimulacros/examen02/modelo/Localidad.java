package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo;

public class Localidad {
	
	private int id;
	private String localidad;
	
	
	public Localidad() {
		super();
	}
	
	public Localidad(int id, String localidad) {
		super();
		this.id = id;
		this.localidad = localidad;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return localidad;
	}
	
}

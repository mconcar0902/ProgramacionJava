package examenes.examen20260320.ejercicio01;

public class Concursante {

	private String nombre;
	private double media;
	
	
	public Concursante(String nombre, double media) {
		super();
		this.nombre = nombre;
		this.media = media;
	}

///////////////////////////////////////////////////////////////////////////	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}

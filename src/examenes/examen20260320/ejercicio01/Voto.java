package examenes.examen20260320.ejercicio01;

public class Voto {
	
	private String nombreJuez;
	private String nombreParticipante;
	private int puntuacion;
	
	
	public Voto(String nombreJuez, String nombreParticipante, int puntuacion) {
		super();
		this.nombreJuez = nombreJuez;
		this.nombreParticipante = nombreParticipante;
		this.puntuacion = puntuacion;
	}

///////////////////////////////////////////////////////////////////////////////////////////

	public String getNombreJuez() {
		return nombreJuez;
	}


	public void setNombreJuez(String nombreJuez) {
		this.nombreJuez = nombreJuez;
	}


	public String getNombreParticipante() {
		return nombreParticipante;
	}


	public void setNombreParticipante(String nombreParticipante) {
		this.nombreParticipante = nombreParticipante;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
	
}

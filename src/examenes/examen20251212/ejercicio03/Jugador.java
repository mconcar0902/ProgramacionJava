package examenes.examen20251212.ejercicio03;

import java.util.Random;

public class Jugador {
	private String nombre;
	private int nivel;
	private int puntosObtenidos;
	private int victorias;
	private int derrotas;

	
	
	public Jugador(String nombre) {
		Random rand = new Random();
		
		this.nombre = nombre;
		this.nivel = rand.nextInt(1,100);
		this.puntosObtenidos = 0;
		this.victorias = 0;
		this.derrotas = 0;

	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}
	public void setPuntosObtenidos(int puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}



	@Override
	public String toString() {
		return "\n" + nombre + " | nivel: " + nivel + " | victorias: " + victorias + " | derrotas: " + derrotas;
	}
	
}

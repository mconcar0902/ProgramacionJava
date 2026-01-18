package capitulo05_objetos.ejercicios.bloque01.ejercicio01;

import java.util.Random;

public class Humano {
	private int puntosVida;
	private String nombre;
	private boolean vivo;
	
	public Humano(String nombre) {
		Random rand = new Random();
		this.puntosVida = rand.nextInt(50,100);
		this.vivo = true;
		this.nombre = nombre;
	}

	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	

	public String toString() {
		return  (vivo == true)? nombre + "-" + puntosVida : "";
	}

}

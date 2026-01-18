package capitulo05_objetos.ejercicios.bloque01.ejercicioArkanoid;

import java.util.Random;

public class Ladrillo {
	private String color;
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int puntosVida;
	private static String array[] = new String[] {"Rojo", "Verde", "Azul"};
	
	public Ladrillo() {
		super();
		Random rand = new Random();
		this.x = rand.nextInt(0,800);
		this.y = rand.nextInt(0,500);
		this.ancho = 100;
		this.alto = 50;
		this.puntosVida = rand.nextInt(1,3);
		
		if (getPuntosVida() == 1) {
			this.color = array[rand.nextInt(1,3)-1];
		}
		else if (getPuntosVida() == 2) {
			this.color = "Plateado";
		}
		else if (getPuntosVida() == 3) {
			this.color = "Dorado";
		}
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}


	@Override
	public String toString() {
		return "Ladrillo [color=" + color + ", x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto
				+ ", puntosVida=" + puntosVida + "]";
	}
	
}

package proyectoArkanoid;

import java.awt.Graphics;

public abstract class Objetos {

	protected int x;
	protected int y;
	protected int alto;
	protected int ancho;
	
	
	public Objetos(int x, int y, int alto, int ancho) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
	}


	public abstract void paint(Graphics g);
	public abstract void actua();


	
/////////////////////////////////////////////////////////////////////////////////////

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
	
}

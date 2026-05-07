package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Nave extends Objetos {

	private int velocidad = 20;
	
	public Nave(int x, int y, int alto, int ancho) {
		super(x, y, alto, ancho);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, ancho, alto);
	}

	@Override
	public void actua() {
		for (Pelota p : Arkanoid.pelotas) {
			
			Rectangle rectNave = new Rectangle(this.x, this.y, this.ancho, this.alto);
			Rectangle rectPelota = new Rectangle(p.getX(), p.getY(), p.getAncho(), p.getAlto());
			
			if (rectPelota.intersects(rectNave)) {
				p.cambiaSentidoY();
			}
		}
		
	}
		

	/**
	 * 
	 * @param x
	 */
	public void moverRaton(int x) {
		this.x = x;
	
		if (this.x > (Arkanoid.canvas.getWidth() - this.ancho)) {
			this.x = Arkanoid.canvas.getWidth() - this.ancho;
		}
	}
	
	/**
	 * 
	 * @param cod
	 */
	public void moverTecla(int cod) {
		
		if (this.x > 0 - velocidad && this.x < (Arkanoid.canvas.getWidth() - this.ancho + velocidad)) {
			if (this.x > 0 && cod == KeyEvent.VK_LEFT) {
				this.x -= velocidad;
			}
			
			if (this.x < (Arkanoid.canvas.getWidth() - this.ancho) && cod == KeyEvent.VK_RIGHT) {
				this.x += velocidad;
			}
		}	
	}

}

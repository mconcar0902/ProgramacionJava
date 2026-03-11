package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Nave extends Objetos {

	private int velocidad = 15;
	
	public Nave(int x, int y, int alto, int ancho) {
		super(x, y, alto, ancho);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, ancho, alto);
	}

	
	/**
	 * 
	 * @param x
	 */
	public void moverRaton(int x) {
		this.x = x;
		
		MiCanvas canvas = Arkanoid.canvas;
		
		if (this.x > (canvas.getWidth() - this.ancho)) {
			this.x = canvas.getWidth() - this.ancho;
		}
	}
	
	public void moverTecla(int cod) {
		MiCanvas canvas = Arkanoid.canvas;
		
		if (this.x > 0 && this.x < (canvas.getWidth() - this.ancho)) {
			if (cod == KeyEvent.VK_LEFT) {
				this.x += -velocidad;
			}
			
			if (cod == KeyEvent.VK_RIGHT) {
				this.x += velocidad;
			}
		}
		
		
	}


	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}
		
		

	
}

package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota extends Objetos {
	private static int velocidadX = -10;
	private static int velocidadY = 10;
	
	public Pelota(int x, int y, int alto, int ancho) {
		super(x, y, alto, ancho);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(x, y, ancho, alto);
	}


	@Override
	public void actua() {
		
		this.x += velocidadX;
		if (this.x <= 0 || this.x >= 600 - ancho) {
			velocidadX = -velocidadX;
		}
		
		this.y += velocidadY;
		if (this.y <= 0 || this.y >= 800 - alto) {
			velocidadY = -velocidadY;
		}
		
	}

	
}

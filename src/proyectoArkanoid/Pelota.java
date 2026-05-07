package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Pelota extends Objetos {
	// Velocidad a la que se mueve la pelota por la pantalla
	private int velocidadX = 5;
	private int velocidadY = -5;
	private boolean terminado;
	
	public Pelota(int x, int y, int alto, int ancho) {
		super(x, y, alto, ancho);
		this.terminado = false;
	}

	
	@Override
	public void paint(Graphics g) {
		if (!terminado) {
			g.setColor(Color.WHITE);
			g.fillOval(x, y, ancho, alto);
		}
	}


	@Override
	public void actua() {
		if (terminado) {
			return;
		}
		
		this.x += velocidadX;
		if (this.x <= 0 || this.x >= Arkanoid.canvas.getWidth() - ancho) {
			cambiaSentidoX();
		}
		
		this.y += velocidadY;
		if (this.y <= 0) {
			cambiaSentidoY();
		}
		if (this.x >= Arkanoid.jugador.getY() + 100) {
			this.terminado = true;
		}
	}
	
	//Cambiar el sentido dela pelota cuando toque algo
	public void cambiaSentidoX() {
		velocidadX = -velocidadX;
	}
	public void cambiaSentidoY() {
		velocidadY = -velocidadY;
	}
	
//////////////////////////////////////////////////////////////////////////////

	public boolean isTerminado() {
		return terminado;
	}
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	
}

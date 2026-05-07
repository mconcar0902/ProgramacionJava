package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Explosion extends Objetos {
	private int fase;
	private int reduccion;
	private boolean terminado;

	public Explosion(int x, int y, int alto, int ancho) {
		super(x, y, alto, ancho);
		// TODO Auto-generated constructor stub
		this.fase = 0;
		this.reduccion = 2;
		this.terminado = false;
	}

	@Override
	public void paint(Graphics g) {
		if (terminado) {
			return;
		}
		
		switch (fase) {
		case 1:
			g.setColor(Color.RED.darker());
			g.fillOval(x, y, this.ancho, this.alto);
			this.ancho -= this.reduccion;
			this.alto -= this.reduccion;
			break;
		case 2:
			g.setColor(Color.RED);
			g.fillOval(x, y, this.ancho, this.alto);
			this.ancho -= this.reduccion;
			this.alto -= this.reduccion;
			break;
		case 3:
			g.setColor(Color.RED.brighter());
			g.fillOval(x, y, this.ancho, this.alto);
			this.ancho -= this.reduccion;
			this.alto -= this.reduccion;
			break;
		case 4:
			g.setColor(Color.ORANGE.brighter());
			g.fillOval(x, y, this.ancho, this.alto);
			this.ancho -= this.reduccion;
			this.alto -= this.reduccion;
			break;
		case 5:
			this.terminado = true;
			Arkanoid.lista.add(new Bonus(this.x, this.y, 15, 15));
			break;
		}

		this.fase ++;
	}

	@Override
	public void actua() {
		
	}

}

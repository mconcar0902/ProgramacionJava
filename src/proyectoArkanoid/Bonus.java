package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Bonus extends Objetos {
	private int velocidad = 5;
	private boolean terminado = false;

	public Bonus(int x, int y, int alto, int ancho) {
		super(x, y, alto, ancho);
		Random rand = new Random();
		int num = rand.nextInt(0, 100);
		if (num <= 80) {
			this.terminado = true;
		}
		
	}

	@Override
	public void paint(Graphics g) {
		if (terminado) {
			return;
		}
		g.setColor(Color.RED);
		g.fillOval(x, y, ancho, alto);
		g.setColor(Color.black);
		g.fillOval((x + (ancho/3)), (y + (alto/3)), ancho/2, alto/2);

	}

	@Override
	public void actua() {
		if(terminado) {
			return;
		}
		
		Rectangle rectNave = new Rectangle(Arkanoid.jugador.getX(), Arkanoid.jugador.getY(), Arkanoid.jugador.getAncho(), Arkanoid.jugador.getAlto());
		Rectangle rectPelota = new Rectangle(this.x, this.y, this.ancho, this.alto);
		
		if (rectPelota.intersects(rectNave)) {
			Arkanoid.pelotas.add(new Pelota(200, 600, 15, 15));
			this.terminado = true;
		}
		
		if (this.y < Arkanoid.canvas.getHeight()) {
			this.y += velocidad;
		}
		else if (this.y >= Arkanoid.canvas.getHeight()) {
			this.terminado = true;
		}

	}

}

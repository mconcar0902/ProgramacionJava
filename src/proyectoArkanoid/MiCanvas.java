package proyectoArkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.util.List;


public class MiCanvas extends Canvas {

	static List<Objetos> objetos = null;
	private BufferStrategy strategy = null;
	
	
	public MiCanvas(List<Objetos> objetos) {
		this.objetos = objetos;
	}

	
	/**
	 * 
	 */
	public void pintaEscena () {
		// Tengo que inicializar el objeto "strategy" una única vez
		if (this.strategy == null) {
			this.createBufferStrategy(2);
			strategy = getBufferStrategy();
			Toolkit.getDefaultToolkit().sync();			
		}
		// Obtengo el objeto gráfico que me permita pintar en el doble búffer
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		// Pinto un rectángulo negro que ocupe toda la escena
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		for (Objetos o : objetos) {
			o.paint(g);
		}

		Arkanoid.explosiones(Arkanoid.explosiones, g);
		Arkanoid.pintarPelotas(Arkanoid.pelotas, g);
		
		// Muestro en pantalla el buffer con el nuevo frame creado para el juego
		strategy.show();
	}
	
	
}

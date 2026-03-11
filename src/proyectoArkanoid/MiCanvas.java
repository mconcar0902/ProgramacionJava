package proyectoArkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class MiCanvas extends Canvas {

	List<Objetos> objetos = null;
	
	
	public MiCanvas(List<Objetos> objetos) {
		this.objetos = objetos;
	}


	@Override
	public void paint(Graphics g) {
		this.setBackground(Color.BLACK);
		for (Objetos o : this.objetos) {
			o.paint(g);
		}
	}
	
	
}

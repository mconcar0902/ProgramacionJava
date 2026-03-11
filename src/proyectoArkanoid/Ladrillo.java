package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Ladrillo extends Objetos {

	private Color color;
	private Boolean destruido;
	
	public Ladrillo(int x, int y, int alto, int ancho, Color color) {
		super(x, y, alto, ancho);
		this.color = color;
		this.destruido = false;
	}


	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, ancho, alto);
	}
	
	@Override
	public void actua() {
		
	}


////////////////////////////////////////////////////////////////////////////

	public Color getColor() {
		return color;
	}
	
	public Boolean getDestruido() {
		return destruido;
	}
	
	public void setDestruido(Boolean destruido) {
		this.destruido = destruido;
	}

}

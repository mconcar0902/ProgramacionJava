package proyectoArkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
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
		if (!this.destruido) {
			g.setColor(color);
			g.fillRect(x, y, ancho, alto);
		}
	}
	
	@Override
	public void actua() {
		
		if (this.destruido) {
			return;
		}
		
		for (Pelota p : Arkanoid.pelotas) {
			Rectangle rectPelota = new Rectangle(p.getX(), p.getY(), p.getAncho(), p.getAlto());
			Rectangle rectBloque = new Rectangle(this.x, this.y, this.ancho, this.alto);

			if (rectPelota.intersects(rectBloque)) {
			    this.destruido = true;
			    
				Arkanoid.explosiones.add(new Explosion((this.x + (this.ancho/2)), (this.y + (this.alto/2)), 20, 20));
			    
			    Rectangle interseccion = rectPelota.intersection(rectBloque);
			    
			    if (interseccion.width >= interseccion.height) {
			        p.cambiaSentidoY();
			    } else {
			        p.cambiaSentidoX();
			    }
			}
		}
		
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

package capitulo05_objetos.ejercicios.bloque01.ejercicioArkanoid;

public class Pelota {
	private int x;
	private int y;
	
	public Pelota() {
		super();
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Pelota [x=" + x + ", y=" + y + "]";
	}
	
}

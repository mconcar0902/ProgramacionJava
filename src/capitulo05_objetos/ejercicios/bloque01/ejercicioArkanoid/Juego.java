package capitulo05_objetos.ejercicios.bloque01.ejercicioArkanoid;

import java.util.Arrays;
import java.util.Random;

public class Juego {
	private Ladrillo ladrillos[] = new Ladrillo[20];
	private Pelota pelota;
	private Ladrillo ladrillosDestruidos[] = new Ladrillo[20];
	private int cont = 0;
	
	public Juego() {
		super();
	}
	
	public Juego(Ladrillo ladrillos[], Pelota pelota) {
		super();
		this.ladrillos = ladrillos;
		this.pelota = pelota;
	}

	public void inicializarJuego() {
		for (int i = 0; i < ladrillos.length; i++) {
			ladrillos[i] = new Ladrillo();
			
		}
		Pelota pelota = new Pelota();
	}
	
	
	public void jugar() {
		Random rand = new Random();
		
		do {
			pelota.setX(rand.nextInt(0,800));
			pelota.setY(rand.nextInt(0,500));
			
			for (int i = 0; i < ladrillos.length; i++) {
				if(ladrillos[i] != null) {
					Ladrillo l = ladrillos[i];
					
					if (pelota.getX() >= l.getX() &&
							pelota.getX() <= (l.getX() + l.getAncho()) &&
							pelota.getY() >= l.getY() &&
							pelota.getY() <= (l.getY() + l.getAlto())) {
						
						l.setPuntosVida(l.getPuntosVida() -1);
						if(l.getPuntosVida() <= 0) {
							ladrillosDestruidos[cont] = ladrillos[i];
							ladrillos[i] = null;
							cont++;
						}
					}
				}
			}
			
			ladrillos.toString();
		} while (quedanLadrillos());
	}
	
	
	
	private boolean quedanLadrillos() {
		for (int i = 0; i < ladrillos.length; i++) {
			if(ladrillos[i] != null) {
				return true;
			}
		}
		return false;
	}
	
	
	public Ladrillo[] getLadrillos() {
		return ladrillos;
	}
	public void setLadrillos(Ladrillo[] ladrillos) {
		this.ladrillos = ladrillos;
	}
	public Pelota getPelota() {
		return pelota;
	}
	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}

	@Override
	public String toString() {
		return "Juego [ladrillos=" + Arrays.toString(ladrillos) + ", pelota=" + pelota + "]";
	}
	
}

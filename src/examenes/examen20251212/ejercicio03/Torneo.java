package examenes.examen20251212.ejercicio03;

import java.util.Arrays;
import java.util.Random;

import javaUtils.JavaUtils;


public class Torneo {
	private Jugador jugadores[] = new Jugador[8];
	private int rondas = 5;
	
	public Torneo() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador("Jugador-" + (i + 1));
		}
	}

	public void clasificacionFinal() {
		boolean hayCambios;
		
		do {
			hayCambios = false;
			for (int i = 0; i < jugadores.length - 1; i++) {
				if (jugadores[i].getVictorias() < jugadores[i + 1].getVictorias()) {
					Jugador aux = jugadores[i];
					jugadores[i] = jugadores[i + 1];
					jugadores[i + 1] = aux;
					hayCambios = true;
				}
			}
		} while (hayCambios);
	}
	
	
	
	public void rondaTorneo() {
		jugadoresObtienenPuntuacion(jugadores);
		
		compruebaGanador(jugadores);
	}
	
	public void compruebaGanador(Jugador jugadores[]) {
		ordenaPorPuntos(jugadores);
		System.out.println();
		
		for (int i = jugadores.length -1; i >= 0; i--) {
			if(jugadores[jugadores.length -1].getPuntosObtenidos() != jugadores[i].getPuntosObtenidos()) {
				jugadores[i].setDerrotas(jugadores[i].getDerrotas() + 1);
			}
			else {
				jugadores[i].setVictorias(jugadores[i].getVictorias() + 1);
				System.out.println("El jugador " + jugadores[i].getNombre() + " ha ganado la sigiente ronda.");
			}
		}
	}
	
	
	public void jugadoresObtienenPuntuacion(Jugador jugadores[]) {
		Random rand = new Random();
		
		for (int i = 0; i < jugadores.length; i++) {
			Jugador j = jugadores[i];
			j.setPuntosObtenidos(rand.nextInt(0,j.getNivel()));
		}
	}
	
	public void ordenaPorPuntos(Jugador jugadores[]) {
		boolean hayCambios;
		
		do {
			hayCambios = false;
			for (int i = 0; i < jugadores.length - 1; i++) {
				if (jugadores[i].getPuntosObtenidos() < jugadores[i + 1].getPuntosObtenidos()) {
					Jugador aux = jugadores[i];
					jugadores[i] = jugadores[i + 1];
					jugadores[i + 1] = aux;
					hayCambios = true;
				}
			}
		} while (hayCambios);
	}
	
	
	
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	public int getRondas() {
		return rondas;
	}
	public void setRondas(int rondas) {
		this.rondas = rondas;
	}

	
	@Override
	public String toString() {
		return "\n" + Arrays.toString(jugadores);
	}
}

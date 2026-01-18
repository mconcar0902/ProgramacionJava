package capitulo05_objetos.ejercicios.bloque01.ejercicio01;

import java.util.Arrays;
import java.util.Random;
import javaUtils.JavaUtils;

public class CampoBatalla {
	private String nombre;
	private Humano humanos[];
	private Malvado malvados[];
	
	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		this.humanos = new Humano[20];
		this.malvados = new Malvado[20];
		
		for (int i = 0; i < malvados.length; i++) {
			this.malvados[i] = new Malvado("Malvado " + i);
			this.humanos[i] = new Humano("Humano " + i);
		}
		
		//Duplica la vida de los ultimos del array.
		
		Humano ultimoHumano = this.humanos[this.humanos.length - 1];
		ultimoHumano.setPuntosVida(ultimoHumano.getPuntosVida() * 2);
		
		Malvado ultimoMalvado = this.malvados[this.malvados.length - 1];
		ultimoMalvado.setPuntosVida(ultimoMalvado.getPuntosVida() * 2);
		
		//Desordenar los arrays de los humanos y los malvados.
		Random rand = new Random();
		for (int i = 0; i < humanos.length; i++) {
			int pos1 = rand.nextInt(0,20);
			int pos2 = rand.nextInt(0,20);
			Humano aux = humanos[pos1];
			humanos[pos1] = humanos[pos2];
			humanos[pos2] = aux;
		}
		for (int i = 0; i < humanos.length; i++) {
			int pos1 = rand.nextInt(0,20);
			int pos2 = rand.nextInt(0,20);
			Malvado aux = malvados[pos1];
			malvados[pos1] = malvados[pos2];
			malvados[pos2] = aux;
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Humano[] getHumanos() {
		return humanos;
	}
	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}
	public Malvado[] getMalvados() {
		return malvados;
	}
	public void setMalvados(Malvado[] malvados) {
		this.malvados = malvados;
	}
	
	public Malvado getPrimerMalvado() {
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].isVivo()) {
				Malvado primerMalvado = malvados[i];
				return primerMalvado;
			}
		}
		return null;
	}
	public Humano getPrimerHumano() {
		for (int i = 0; i < humanos.length; i++) {
			if(humanos[i].isVivo()) {
				Humano primerHumano = humanos[i];
				return primerHumano;
			}
		}
		return null;	
	}
	
	/**
	 * 
	 * 
	 */
	public void batalla() {
		Random rand = new Random();
		int turno = 0;
		int disparosAMalvado = 0;
		int disparosAHumano = 0;
		int contHumanos = 0;
		int contMalvados = 0;
		
		int[] disparosAHumanos = new int[humanos.length];
		int[] disparosAMalvados = new int[malvados.length];
		
		do {
			if(turno % 2 == 0) {
				// Para que se mueste cuando los dos bandos hayan recibido daño.
				System.out.println("\nTurnos " + (turno/2) + "\n" + toString());  
				
				getPrimerMalvado().setPuntosVida(getPrimerMalvado().getPuntosVida()- rand.nextInt(5,25));
				disparosAMalvado++;
				
				if(getPrimerMalvado().getPuntosVida() <= 0) {
					getPrimerMalvado().setVivo(false);
					disparosAMalvados[contMalvados] = disparosAMalvado;
					disparosAMalvado = 0;
					contMalvados++;
				}
			}
			else if(turno % 2 == 1) {
				getPrimerHumano().setPuntosVida(getPrimerHumano().getPuntosVida()-rand.nextInt(5,25));
				disparosAHumano++;
				
				if(getPrimerHumano().getPuntosVida() <= 0) {
					getPrimerHumano().setVivo(false);
					disparosAHumanos[contHumanos] = disparosAHumano;
					disparosAHumano = 0;
					contHumanos++;
				}
			}
			turno++;
		} while (!(getPrimerHumano() == null || getPrimerMalvado() == null));
		
		System.out.println("\nTurnos " + (turno/2) + "\n" + toString());
		
		if(getPrimerHumano() == null) {
			System.out.println("\nLos humanos han perdido la batalla pero no la guerra."
					+ "\nLos malvados ganan.");
			disparosAMalvados[contMalvados] = disparosAMalvado;
		}
		else if(getPrimerMalvado() == null) {
			System.out.println("\nLos humanos han ganado la batalla.");
			disparosAHumanos[contHumanos] = disparosAHumano;
		}
		
		estadisticas(disparosAMalvados, disparosAHumanos);
		
	}
	
	@Override
	public String toString() {
		return  Arrays.toString(humanos) + "\n"
				+ Arrays.toString(malvados);
	}
	
	/**
	 * 
	 * @param disparosAMalvados
	 * @param disparosAHumanos
	 */
	public void estadisticas(int[] disparosAMalvados, int[] disparosAHumanos) {
		mostrarArraysDisparos(disparosAMalvados, disparosAHumanos);
		masDisparosRecibidos(disparosAMalvados, disparosAHumanos);
		menosDisparosRecibidos(disparosAMalvados, disparosAHumanos);
	}
	
	/**
	 * 
	 * @param disparosAMalvados
	 * @param disparosAHumanos
	 */
	public void mostrarArraysDisparos(int[] disparosAMalvados, int[] disparosAHumanos) {
		System.out.println("\nEstadisticas de la batalla de " + getNombre() + ".");
		System.out.print("Disparos resicidos por los humanos: ");
		JavaUtils.mostrarArray(disparosAHumanos);
		System.out.print("Disparos resicidos por los malvados: ");
		JavaUtils.mostrarArray(disparosAMalvados);	
	}
	
	/**
	 * 
	 * @param disparosAMalvados
	 * @param disparosAHumanos
	 */
	public void masDisparosRecibidos(int[] disparosAMalvados, int[] disparosAHumanos) {
		int maxHumanos = JavaUtils.obtenerMaximo(disparosAHumanos);
		int maxMalvados = JavaUtils.obtenerMaximo(disparosAMalvados);
		int posMal = JavaUtils.buscarIndice(disparosAMalvados, maxMalvados);
		int posHum = JavaUtils.buscarIndice(disparosAHumanos, maxHumanos);
		
		System.out.println("\nMás disparos recibidos.");
		System.out.println(humanos[posHum].getNombre() +" ha recibido " + maxHumanos + " disparos.");
		System.out.println(malvados[posMal].getNombre() +" ha recibido " + maxMalvados + " disparos.");
	}
	
	/**
	 * 
	 * @param disparosAMalvados
	 * @param disparosAHumanos
	 */
	public void menosDisparosRecibidos(int[] disparosAMalvados, int[] disparosAHumanos) {
		int minHumanos = JavaUtils.obtenerMinimo(disparosAHumanos);
		int minMalvados = JavaUtils.obtenerMinimo(disparosAMalvados);
		int posMal = JavaUtils.buscarIndice(disparosAMalvados, minMalvados);
		int posHum = JavaUtils.buscarIndice(disparosAHumanos, minHumanos);
		
		System.out.println("\nMenos disparos recibidos.");
		System.out.println(humanos[posHum].getNombre() +" ha recibido " + minHumanos + " disparos.");
		System.out.println(malvados[posMal].getNombre() +" ha recibido " + minMalvados + " disparos.");
	}
}

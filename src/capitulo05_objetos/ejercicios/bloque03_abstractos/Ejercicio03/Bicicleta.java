package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio03;

import java.util.Random;

public class Bicicleta extends Vehiculo {
	Random rand = new Random();
	
	public Bicicleta() {
		super();
	}
	
	public Bicicleta(String modelo) {
		super();
		this.modelo = modelo;
		this.velocidadActual = 0;
	}
	
	/**
	 * 
	 */
	@Override
	public int acelerar() {
			velocidadActual = (velocidadActual + rand.nextInt(5,15));
		return velocidadActual;
	}

	@Override
	public int frenar() {
		if (velocidadActual - rand.nextInt(5,20) >= 0 ) {
			velocidadActual = (velocidadActual - rand.nextInt(5,20));
			return velocidadActual;
		}
		else {
			velocidadActual = 0;
			return velocidadActual;	
		}	
	}

}

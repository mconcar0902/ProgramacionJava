package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio03;

import java.util.Random;

public class Coche extends Vehiculo{
	Random rand = new Random();
	
	public Coche() {
		super();
	}
	
	public Coche(String modelo) {
		super();
		this.modelo = modelo;
		this.velocidadActual = 0;
	}
	
	/**
	 * 
	 */
	@Override
	public int acelerar() {
			velocidadActual = (velocidadActual + rand.nextInt(15,25));
		return velocidadActual;
	}

	@Override
	public int frenar() {
		if (velocidadActual - rand.nextInt(15,25) >= 0 ) {
			velocidadActual = (velocidadActual - rand.nextInt(15,25));
			return velocidadActual;
		}
		else {
			velocidadActual = 0;
			return velocidadActual;	
		}	
	}

}

package capitulo04_array.ejercicios.bloque11;

import java.util.Random;

public class Ejercicio03_GeneraNumerosHastaQueLaMediaSea500 {

	public static void main(String[] args) {
		float media = 0, total = 0, num;
		int cont = 0;
		
		do {
			Random rand = new Random();
			num = rand.nextInt(1,1000);
			total += num;
			cont++;
			media = total / cont;
		} while (!(media > 499.5 && media < 500.5));
		
		System.out.println("Se han puesto " + cont + " numeros para que la media sea " + media);
	}
}

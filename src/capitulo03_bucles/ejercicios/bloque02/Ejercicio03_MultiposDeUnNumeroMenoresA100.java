package capitulo03_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiposDeUnNumeroMenoresA100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el numero del que quiere saber sus multiplos: ");
		int num = sc.nextInt();
		
		for (int i = 1; (i * num) < 100; i++) {
			
			System.out.println(i*num);
		}
	}

}

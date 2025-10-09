package capitulo03_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercico04_MultiposDeUnNumeroYPideUnLimite {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el numero del que quiere saber sus multiplos: ");
		int num = sc.nextInt();
		
		System.out.print("Escibe cual quieres que sea el numero limite: ");
		int limite = sc.nextInt();
		
		for (int i = 1; (i * num) < limite; i++) {
			
			System.out.println(i * num);
		}
	}

}

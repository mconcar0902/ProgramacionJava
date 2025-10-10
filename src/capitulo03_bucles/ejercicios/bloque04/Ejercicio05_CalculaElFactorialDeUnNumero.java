package capitulo03_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio05_CalculaElFactorialDeUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero para calcular su factorial: ");
		int num = sc.nextInt();
	
		int factorial = num;
		int i = 0;
		
		while (num > i && i != (num - 1)) {
			factorial = factorial + (i * factorial);
			i = i + 1;
		}
		
		System.out.println("El factorial de " + num + " es " + factorial);

	}

}

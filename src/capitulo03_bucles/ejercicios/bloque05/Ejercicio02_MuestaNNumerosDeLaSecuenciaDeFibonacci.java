package capitulo03_bucles.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio02_MuestaNNumerosDeLaSecuenciaDeFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe cuantos numeros de la secuencia de Fibonacci quieres que se muestren: ");
		int n = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		
		for (int i = 0 ; i != n; i++) {
			System.out.println(num1);
			
			num1 = num2 ;
			num2 = num3 ;
			num3 = num1 + num2 ;
		}
		
	}

}

package capitulo03_bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio02_PideLasVecesQueSeRepiteElBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Escribe cuantos numeros quieres que se te pregunte: ");
		int repeticiones = sc.nextInt();
		
		for (int i = 0 ; i < repeticiones; i++) {
			System.out.print((i + 1) + ". Escribe un numero :");
			int num1 = sc.nextInt();
				
			if (num1 > 10) {
				num = num + num1 ;
			}
		}
		System.out.println("La suma de los numeros mayores de diez que as escrito es " + num);

	}

}

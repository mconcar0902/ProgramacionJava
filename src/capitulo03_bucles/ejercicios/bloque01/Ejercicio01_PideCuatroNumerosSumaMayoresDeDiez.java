package capitulo03_bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio01_PideCuatroNumerosSumaMayoresDeDiez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Escribe cuatro numeros.");
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Escribe un numero :");
			int num1 = sc.nextInt();
				
			if (num1 > 10) {
				num = num + num1 ;
			}
		}
		System.out.println("La suma de los numeros mayores de diez que as escrito es " + num);

	}

}

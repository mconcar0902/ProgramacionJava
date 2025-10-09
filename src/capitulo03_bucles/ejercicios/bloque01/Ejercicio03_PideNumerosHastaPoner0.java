package capitulo03_bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_PideNumerosHastaPoner0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int nneg = 0;
		int npos = 0;
		
		System.out.print("Escribe cuantos numeros quieres que se te pregunte: ");
		
		
		for (int i = 1 ; num != 0; i++) {
			System.out.print("Escribe un numero :");
			num = sc.nextInt();
			
			if (num > 0) {
				nneg = nneg + 1 ;
			}
			else if (num < 0) {
				npos = npos + 1 ;
			}
		}
		System.out.println("Has escrito " + nneg + " numeros negativos y " + npos + " numeros positivos.");

	}

}

package capitulo03_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio04_PideNumerosCuentaLosPositivosYNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int npos = 0;
		int nneg = 0;
		
		System.out.print("Escribe un numero: ");
		int num = sc.nextInt();
		
		for (int i = 0 ; num != 0; i++) {
			
			if (num > 0) {
				npos = npos + 1;
			}
			
			else if (num < 0){
				nneg = nneg + 1;
			}
			
			System.out.print("Escribe un numero (0 para salir): ");
			num = sc.nextInt();
			}
			System.out.println("Se han escrito " + npos + " positivos y " + nneg + " negativos.");
		}
	}

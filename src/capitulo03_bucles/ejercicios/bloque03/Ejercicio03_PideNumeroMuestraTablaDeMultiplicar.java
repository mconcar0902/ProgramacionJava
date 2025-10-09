package capitulo03_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio03_PideNumeroMuestraTablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
		int num = sc.nextInt();
		
		for (int i = 0 ; num != 0 ; i++) {
			
			System.out.println("Tabla de miltiplicar del " + num);
			
			for(int m = 1 ; m <= 10 ; m++) {
				
				System.out.println(num + " * " + m + " = " + (num*m));				
			}
			
			System.out.print("Escribe otro numero: ");
			num = sc.nextInt();
		}
		
		System.out.println("El programa se a terminado al introducir 0.");

	}

}

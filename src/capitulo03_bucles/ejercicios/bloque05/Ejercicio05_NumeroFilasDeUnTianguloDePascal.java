package capitulo03_bucles.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio05_NumeroFilasDeUnTianguloDePascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Escibe el numero de filas del triangulo de Pascal: ");
        int filas = sc.nextInt();
        
        for (int i = 0 ; i <= filas ; i++) {
        	
        	int num = 1;
        	
        	for (int j = 0 ; j <= i ; j++) {
        		
        		System.out.print(num + " ");
        		num = num * (i - j) / (j + 1);
        		
        	}
        	System.out.println("");
        	
        }

   }
}
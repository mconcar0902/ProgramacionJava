package examenes.examen20251024;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero para comprobar si sus digitos son consecutivos crecientes: ");
		int num = sc.nextInt();
		int n = num ;
		int resto, restaux;
		for (int i = 0;n >= 1 ;i++) {
			resto = n % 10;
			n = n / 10;

			if (resto < (num - i)) {
				System.out.print(resto );
			}

		}
		
	}

}

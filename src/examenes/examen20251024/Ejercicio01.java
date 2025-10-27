package examenes.examen20251024;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer numero:");
		int num1 = sc.nextInt();
		System.out.print("Escribe el segundo numero:");
		int num2 = sc.nextInt();
		
		int cont1 = 0;
		int cont2 = 0;
		int n1 = num1;
		int n2 = num2;
		
		while (n1 >= 1) {
			cont1 = cont1 + 1;
			n1 = n1 / 10 ;
		}
		
		while (n2 >= 1) {
			cont2 = cont2 + 1;
			n2 = n2 / 10 ;
		}
		 if(cont1 > cont2) {
			 System.out.println("El numero " + num1 + " tiene mas digitos que " + num2);
		}
		 else if(cont1 < cont2) {
			 System.out.println("El numero " + num2 + " tiene mas digitos que " + num1);
		 
	    }
		 else if(cont1 == cont2) {
			 System.out.println("El numero " + num2 + " y el numero " + num1 + " tienen la misma cantidad de digitos.");
		 
	    }
	}
}

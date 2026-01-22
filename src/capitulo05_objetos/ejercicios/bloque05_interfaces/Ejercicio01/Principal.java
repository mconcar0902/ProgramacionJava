package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Suma suma = new Suma();
		Resta resta = new Resta();
		
		System.out.print("Escribe un numero entero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Escribe otro numero entero: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + suma.operar(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + resta.operar(num1, num2));

	}

}

package examenes.examen20260320.ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

	static ComprobacionMatematica multiplo2 = new ComprobacionMatematica() {
		
		@Override
		public boolean aplicar(int valor) {
			int divisor = valor;
			while (divisor == 0) {
				if (valor / divisor != 0) {
					return false;
				}
				
			}
			
			
			return true;
		}
	};
	
	static ComprobacionMatematica Mayor50 = new ComprobacionMatematica() {
		
		@Override
		public boolean aplicar(int valor) {
			if (valor > 50) {
				return true;
			}
			else {
				return false;
			}
		}
	};
	
	static ComprobacionMatematica primo = new ComprobacionMatematica() {
		
		@Override
		public boolean aplicar(int valor) {
			int divisor = 2;
			while (divisor <= Math.sqrt(valor)) {
				
				if (valor % divisor == 0) {
						return false ;
				}
				divisor++ ;  
			}
			return true;
		}
	};
	
	
	public static void main(String[] args) {
		List<ComprobacionMatematica> lista = new ArrayList<ComprobacionMatematica>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero entero: ");
		int num = sc.nextInt();
		

		if (multiplo2.aplicar(num)) {
			System.out.println("El numero es multiplo de 2.");
		}
		else {
			System.out.println("No es multiplo de 2.");
		}

		if (Mayor50.aplicar(num)) {
			System.out.println("El numero es mayor de 50.");
		}
		else {
			System.out.println("No es mayor de 50.");
		}
		
		if (primo.aplicar(num)) {
			System.out.println("El numero es primo.");
		}
		else {
			System.out.println("No es primo.");
		}
		
		
		

	}

}

package capitulo07_.ejercicios.bloque03_excepciones.Ejercicio01;

import java.util.Scanner;

public class PeticionNumeros {

	public static void pideNumeroPar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero par: ");
		int num = sc.nextInt();
		try {
			if (num % 2 == 0) {
				System.out.println("El numero " + num + " es par");
			}
			else {
				throw new ExceptionNumImpar("El numero " + num + " es impar");
			}
		} catch (ExceptionNumImpar e) {
			System.out.println(e.getMessage());
			e.getMessage().notify();
			
		} catch (Exception e) {
			e.getMessage().notify();
		}
	}
	
	
	
	public static void main(String[] args) {
		pideNumeroPar();
	}
	
}

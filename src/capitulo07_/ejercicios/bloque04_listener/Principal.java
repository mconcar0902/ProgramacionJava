package capitulo07_.ejercicios.bloque04_listener;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc ;
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.addListener(new CalculadoraListener() {
			
			@Override
			public void notificacion(String mensaje) {
				System.out.println(mensaje);
			}
		});
		
		
		do {
			menu();
			opc = sc.nextInt();
			double num1 = 0;
			double num2 = 0;
			double resultado = 0;
			
			if (opc >= 1 && opc <= 5) {
				System.out.print("\nIntroduce un numero: ");
				num1 = sc.nextDouble();
				
				if (opc != 5) {
					System.out.print("\nIntroduce otro numero: ");
					num2 = sc.nextDouble();
				}
			}
			
			
			switch (opc) {
			case 1:
				resultado = calculadora.suma(num1, num2);
				break;
			case 2:
				resultado = calculadora.resta(num1, num2);		
				break;
			case 3:
				resultado = calculadora.multiplicacion(num1, num2);
				break;
			case 4:
				resultado = calculadora.divicion(num1, num2);
				break;
			case 5:
				resultado = calculadora.raizCuadrada(num1);
				break;
			case 0:
				System.out.println("\nSaliendo...");
				break;
			default:
				System.out.println("\nOpcion no valida");
				break;
			}
			
			if (opc >= 1 && opc <= 5) {
				System.out.println("El resultado de la operacion es " + resultado);
			}
			
		} while (opc != 0);

	}

	/**
	 * 
	 * 
	 */
	public static void menu() {
		System.out.print("Menu"
				         + "\n----"
				         + "\n1.Suma"
				         + "\n2.Resta"
				         + "\n3.Multiplicacion"
				         + "\n4.Division"
				         + "\n5.Raiz cuadrada"
				         + "\nElije una opcion: ");
	}
}

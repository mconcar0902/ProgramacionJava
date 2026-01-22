package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	Banco banco = new Banco(2);
	
	int opc;
	
	do {
		for (int i = 0; i < banco.getCuentas().length ; i++) {
			banco.toString();
		}
		
		System.out.print("Quieres cambiar la tasa de interes (1-Si o 0-No): ");
		int n = sc.nextInt();
		if (n == 1) {
			Banco.cambiarTasaInteres();
		}
		
		for (int i = 0; i < banco.getCuentas().length; i++) {
			float interes = (banco.getCuentas()[i].getSaldo() * Banco.getTasaInteres()/100);
			
			System.out.println("Saldo + interes = nuevo saldo");
			System.out.println( banco.getCuentas()[i].getSaldo() + " + " + interes + " = " + (banco.getCuentas()[i].getSaldo() + interes));
			banco.getCuentas()[i].setSaldo(banco.getCuentas()[i].getSaldo() + interes);
			System.out.println();
		}
		
		System.out.print("Quieres salir (1-Si o 0-No): ");
		opc = sc.nextInt();
		
	} while (opc != 1);
		
	}

}

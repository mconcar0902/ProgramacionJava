package capitulo02_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio04_ImporteYCambio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el importe de la compra: ");
        int importe = sc.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();
        
        int cambio = recibida - importe;
        
    	 if (cambio >= 100) {
         	int monedas100 = cambio / 100 ;
         	cambio = cambio - (monedas100 * 100);
         	System.out.println("Se devuelven " + monedas100 + " monedas de 100.");
         }
         if (cambio >= 50) {
         	int monedas50 = cambio / 50 ;
         	cambio = cambio - (monedas50 * 50);
         	System.out.println("Se devuelven " + monedas50 + " monedas de 50.");
         }
         if (cambio >= 20) {
         	int monedas20 = cambio / 20;
         	cambio = cambio - (monedas20 * 20);
         	System.out.println("Se devuelven " + monedas20 + " monedas de 20.");
         }
         if (cambio >= 5) {
         	int monedas5 = cambio / 5;
         	cambio = cambio - (monedas5 * 5);
         	System.out.println("Se devuelven " + monedas5 + " monedas de 5.");
         }
         if (cambio > 0 ) {
         	System.out.println("Se devuelven " + cambio + " monedas de 1.");
        }
       
	}

}

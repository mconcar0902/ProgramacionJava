package capitulo01.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio06_CalculosCuotaHipoteca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		float Euribor;
		float Diferencial;
		float Capital;
		int Plazo;
		double IAnual;
		double CuotaM;
		double IMensual;
		
		System.out.print("Escibe el Euribor actual: ");
		Euribor =  sc.nextFloat();
		
		System.out.print("Escribe el diferencial: ");
		Diferencial = sc.nextFloat();
		
		System.out.print("Escribe el capital: ");
		Capital =sc.nextFloat();
		
		System.out.print("Escribe el numero de plazos mensuales: ");
		Plazo = sc.nextInt();
		
		IAnual = Euribor + Diferencial;
		IMensual = ((IAnual/12)/100);
		CuotaM = Capital*(IMensual *(Math.pow((1 + IMensual),Plazo)))/Math.pow((1 + IMensual), Plazo);
		
		System.out.println(" ");
		System.out.println("La cuota mensual de la hipoteca es de " + CuotaM);
		
	}

}

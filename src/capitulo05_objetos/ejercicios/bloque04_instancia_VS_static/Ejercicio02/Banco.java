package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Banco {
	
	private static float tasaInteres;
	private Cuenta cuentas[] = new Cuenta[10];


	/**
	 * 
	 */
	public Banco() {
		super();
	}
	
	public Banco(float tasaInteres) {
		super();
		this.tasaInteres = tasaInteres;
		
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = new Cuenta(i + 1);
		}
	}
	
	/**
	 * 
	 */
	public static void cambiarTasaInteres() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe la tasa de interes: ");
		tasaInteres = sc.nextFloat();
	}

	
	

////////////////////////////////////////////////////////////////////

	public static float getTasaInteres() {
		return tasaInteres;
	}
	public static void setTasaInteres(float tasaInteres) {
		Banco.tasaInteres = tasaInteres;
	}
	
	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public String toString() {
		return  Arrays.toString(cuentas);
	}
	
}

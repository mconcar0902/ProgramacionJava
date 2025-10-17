package capitulo04_array.ejercicios.bloque01;

public class Ejercicio06_SumaLosNumerosConIndicePar {

	public static void main(String[] args) {
		
		int[] numeros = new int[150];	
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100 ) ;
		}
		
		int suma = 0;
		
		for (int i = 0 ; i < numeros.length ; i++) {

			if (i % 2 == 0) {
				suma += numeros[i] ;
			}
		}
		
		System.out.println("La suma de los numeros con indice par es " + suma);
		
	}

}

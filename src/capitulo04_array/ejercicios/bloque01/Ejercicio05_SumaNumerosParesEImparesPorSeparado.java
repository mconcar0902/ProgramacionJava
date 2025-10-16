package capitulo04_array.ejercicios.bloque01;

public class Ejercicio05_SumaNumerosParesEImparesPorSeparado {

	public static void main(String[] args) {

		int[] numeros = new int[150];	
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) (Math.random() * 100 + 1 ) ;
		}
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for (int i = 0 ; i < numeros.length ; i++) {

			if (numeros[i] % 2 == 0) {
				sumaPares += numeros[i] ;
			}
			else if (numeros[i] % 2 == 1) {
				sumaImpares += numeros[i];
			}
		}
		
		System.out.println("La suma de los numeros pares es " + sumaPares);
		System.out.println("La suma de los numeros impares es " + sumaImpares);
		
	}

}

package capitulo04_array.ejercicios.bloque01;

public class Ejercicio01_MuestraArrayNumeroMayorMenorSumaYMedia {

	public static void main(String[] args) {
		
		int[] numeros = new int[150];

		int suma = 0 ;
		
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100 ) ;
		}
		
		int menor = numeros[1];
		int mayor = numeros[1];
		
		for (int i = 0 ; i < numeros.length ; i++) {

			System.out.print(numeros[i] + ", ");
			 
			suma += i ;
			
			if (menor > numeros[i]) {
				menor = numeros[i];
			}
			else if (mayor < numeros[i]){
				mayor = numeros[i];
			}
		}
		
		System.out.println("");
		System.out.println("La suma de todos los numeros es " + suma);
		System.out.println("La media de los numeros es " + suma/150f);
		System.out.println("El numero menor es " + menor + " y el mayor es " + mayor);
		
		
	}

}

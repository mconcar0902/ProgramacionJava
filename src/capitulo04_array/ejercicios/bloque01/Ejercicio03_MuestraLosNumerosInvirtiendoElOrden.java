package capitulo04_array.ejercicios.bloque01;

public class Ejercicio03_MuestraLosNumerosInvirtiendoElOrden {

	public static void main(String[] args) {
		
		int[] numeros = new int[150];		
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100 ) ;
		}
		
		System.out.print("Los numeros son: ");
		
		for (int i = 0 ; i < numeros.length ; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Los numeros con orden invertido son: ");
		for (int i = 149 ; i >= 0 ; i--) {
			System.out.print(numeros[i] + ", ");
		}
		
	}

}

package capitulo04_array.ejercicios.bloque10;

public class Ejercicio01_CambiaDeArrayACadenadaDeCaracteres {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6};

		StringBuffer str = stringFromArray(array);
		System.out.println("La cadena StringBuffer es: " + str);
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static StringBuffer stringFromArray(int array[]) {
		StringBuffer str = new StringBuffer();
		
		for (int i = 0; i < array.length; i++) {
			str.append(array[i]);
		}
		return str;	
	}
}

package capitulo07_.ejercicios.bloque05_recursividad;

public class Ejercicio03 {

	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int contador(int num) {
		if (num == 0) {
			return 0;
		}
		System.out.print(num + ", ");
		return contador(num - 1);
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(contador(15) + "\n");

		System.out.println(contador(50) + "\n");
	}

}

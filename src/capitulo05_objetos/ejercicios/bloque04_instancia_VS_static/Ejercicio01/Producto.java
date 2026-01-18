package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio01;

public class Producto {
	
	private static int contador;
	
	/**
	 * 
	 */
	public Producto() {
		super();
		contador++;
	}
	
	/**
	 * 
	 */
	public static void tenerContador() {
		System.out.println(contador);
	}
	
	
	//////////////////////////////////////////////////////
	
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Producto.contador = contador;
	}
	
}

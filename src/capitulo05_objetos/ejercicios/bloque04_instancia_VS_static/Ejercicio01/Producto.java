package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio01;

public class Producto {
	
	private static int CONTADOR = 0;
	private String nombre;
	
	/**
	 * 
	 */
	public Producto(String nombre) {
		super();
		this.nombre = nombre;
		CONTADOR++;
	}
	
	/**
	 * 
	 */
	public static void tenerContador() {
		System.out.println("Hay " + CONTADOR + " productos.");
	}
	
	
	//////////////////////////////////////////////////////
	
	public static int getContador() {
		return CONTADOR;
	}
	public static void setContador(int contador) {
		Producto.CONTADOR = contador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("Producto A");
		Producto p2 = new Producto("Producto B");
		Producto p3 = new Producto("Producto C");
		Producto p4 = new Producto("Producto D");

		Producto.tenerContador();
		
		System.out.println(p1.getNombre());
		System.out.println(p2.getNombre());
		System.out.println(p3.getNombre());
		System.out.println(p4.getNombre());

	}

}

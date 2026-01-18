package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Producto productos[] = new Producto[100];
		
		for (int i = 0; i < productos.length; i++) {
			productos[i] = new Producto();
		}

		Producto.tenerContador();

	}

}

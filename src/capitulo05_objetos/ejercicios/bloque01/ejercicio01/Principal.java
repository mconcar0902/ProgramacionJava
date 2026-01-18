package capitulo05_objetos.ejercicios.bloque01.ejercicio01;

public class Principal {

	public static void main(String[] args) {
		CampoBatalla campo = new CampoBatalla("Carcabuey");
		System.out.println("Comienza la batalla en " + campo.getNombre() + ".");
		campo.batalla();
	}

}

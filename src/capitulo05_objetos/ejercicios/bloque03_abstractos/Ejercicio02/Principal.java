package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio02;

public class Principal {

	public static void main(String[] args) {
		Animal animales[] = new Animal[4];
		
		animales[0] = new Perro("Perro");
		animales[1] = new Gato("Gato");
		animales[2] = new Pajaro("Pajaro");
		animales[3] = new Raton("Raton");
		
		for (int i = 0; i < animales.length; i++) {
			System.out.println(animales[i].nombre + " hace " +  animales[i].emitirSonido());
		}
	}

}

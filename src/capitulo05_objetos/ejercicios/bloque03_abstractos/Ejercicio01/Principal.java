package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Figura figuras[] = new Figura[2];
		
		figuras[0] = new Rectangulo(5,8);
		figuras[1] = new Circulo(19);
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].getArea());
		}
		
		
	}

}

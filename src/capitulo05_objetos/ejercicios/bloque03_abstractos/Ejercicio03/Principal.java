package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio03;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Vehiculo vehiculos[] = new Vehiculo[] {
				new Coche("Mondeo"),
				new Bicicleta("BMX"),
				new Coche("Fiesta"),
				new Bicicleta("Trial")
		};
		
		int veces = rand.nextInt(1,7);
		
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i].modelo);
			
			for (int j = 0; j < veces; j++) {
				System.out.println("Acelera a " + vehiculos[i].acelerar() + " Km/h");
				System.out.println("Acelera a " + vehiculos[i].acelerar() + " Km/h");
				System.out.println("Frena a " + vehiculos[i].frenar() + " Km/h\n");
			}
			System.out.println("--------------------------------------");
		}

	}

}

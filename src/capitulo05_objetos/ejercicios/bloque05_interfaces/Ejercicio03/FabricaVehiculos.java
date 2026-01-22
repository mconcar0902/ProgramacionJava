package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio03;

public class FabricaVehiculos {

	public static Vehiculo crearVehiculo(String nombre) {
		String moto = "moto";
		String coche = "coche";
		
		if (moto.equalsIgnoreCase(nombre) == true) {
			Moto m = new Moto();
			return m;
		}
		else if (coche.equalsIgnoreCase(nombre) == true) {
			Coche c = new Coche();
			return c;
		}
		else {
			return null;
		}
	}
}

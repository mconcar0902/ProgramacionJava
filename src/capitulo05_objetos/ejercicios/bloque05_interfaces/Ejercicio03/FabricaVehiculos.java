package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio03;

public class FabricaVehiculos {

	public static Vehiculo crearVehiculo(String nombre) {

		if (nombre.equalsIgnoreCase("moto") == true) {
			Moto m = new Moto();
			return m;
		}
		else if (nombre.equalsIgnoreCase("coche") == true) {
			Coche c = new Coche();
			return c;
		}
		else {
			return null;
		}
	}
}

package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio03;

public class Principal {

	public static void main(String[] args) {

		FabricaVehiculos fv = new FabricaVehiculos();
		
		Vehiculo v[] = new Vehiculo[] {
				fv.crearVehiculo("moto"),
				fv.crearVehiculo("coche"),
				fv.crearVehiculo("bici"),
		};
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] != null) {
				v[i].arrancar();
				v[i].detener();
				System.out.println();
			}
			else {
				System.out.println("Tipo de vehiculo no reconocido.\n");
			}
		}
		
	}

}

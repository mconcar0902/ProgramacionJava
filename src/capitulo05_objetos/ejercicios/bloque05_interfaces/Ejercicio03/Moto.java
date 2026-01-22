package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio03;

public class Moto implements Vehiculo {

	@Override
	public void arrancar() {
		System.out.println("La moto ha arrancado");
	}

	@Override
	public void detener() {
		System.out.println("La moto se ha detenido");
	}

}

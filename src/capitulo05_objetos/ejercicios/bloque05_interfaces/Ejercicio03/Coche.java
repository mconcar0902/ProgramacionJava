package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio03;

public class Coche implements Vehiculo {

	@Override
	public void arrancar() {
		System.out.println("La coche ha arrancado");
	}

	@Override
	public void detener() {
		System.out.println("La coche se ha detenido");
	}

}

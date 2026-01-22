package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio01;

public class Resta implements Operable {
	
	public Resta() {
		super();
	}
	
	
	@Override
	public int operar(int num1, int num2) {
		return (num1 - num2);
	}

}

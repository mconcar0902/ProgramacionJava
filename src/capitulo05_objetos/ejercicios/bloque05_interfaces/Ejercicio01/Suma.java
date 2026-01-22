package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio01;

public class Suma implements Operable {

	public Suma() {
		super();
	}
	
	@Override
	public int operar(int num1, int num2) {
		return (num1 + num2);	
	}

}

package capitulo07_.ejercicios.bloque04_listener;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	List<CalculadoraListener> listeners = new ArrayList<>();
	
	/**
	 * 
	 * @param listener
	 */
	public void addListener(CalculadoraListener listener) {
		listeners.add(listener);
	}
	
	/**
	 * 
	 * @param mensaje
	 */
	private void notificarEvento(String mensaje) {
        for (CalculadoraListener listener : listeners) {
            listener.notificacion(mensaje);
        }
    }
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double suma(double num1, double num2) {
		double resultado = num1 + num2;
		if (resultado >= 1000) {
			notificarEvento("El resultado de la suma es mayor a 1000.\n");
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double resta(double num1, double num2) {
		double resultado = num1 - num2;
		if (resultado < 0) {
			notificarEvento("El resultado es negativo.\n");
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double multiplicacion(double num1, double num2) {
		double resultado = num1 * num2;
		if (resultado >= 1000) {
			notificarEvento("El resultado de la multiplicacion es mayor a 1000.\n");
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double divicion(double num1, double num2) {
		if (num2 == 0) {
			notificarEvento("El divisor es 0, no es posible realizar la divicion.\n");
		}
		return num1 / num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @return
	 */
	public double raizCuadrada(double num1) {
		if (num1 < 0) {
			notificarEvento("No es posible sacar la raiz cuadrada de ese numero.\n");
		}
		return Math.sqrt(num1);
	}
}

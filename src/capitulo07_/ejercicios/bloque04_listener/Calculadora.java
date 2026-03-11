package capitulo07_.ejercicios.bloque04_listener;

import java.util.ArrayList;
import java.util.List;

public class Calculadora implements CalculadoraListener{

	List<Persona> listeners = new ArrayList<>();
	
	/**
	 * 
	 * @param listener
	 */
	public void addListener(Persona listener) {
		listeners.add(listener);
	}
	/**
	 * 
	 * @param listener
	 */
	public void removeListener(Persona listener) {
		listeners.remove(listener);
	}
	
	

	@Override
	public void fireSuma(String mensaje) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fireResta(String mensaje) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fireMultiplicacion(String mensaje) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fireDivicion(String mensaje) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fireRaiz(String mensaje) {
		for (Persona listener : listeners) {
            System.out.println(mensaje);
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
			fireSuma("El resultado de la suma es mayor a 1000.\n");
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
			fireResta("El resultado es negativo.\n");
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
			fireMultiplicacion("El resultado de la multiplicacion es mayor a 1000.\n");
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
			fireDivicion("El divisor es 0, no es posible realizar la divicion.\n");
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
			fireRaiz("No es posible sacar la raiz cuadrada de ese numero.\n");
		}
		return Math.sqrt(num1);
	}
	
	
}

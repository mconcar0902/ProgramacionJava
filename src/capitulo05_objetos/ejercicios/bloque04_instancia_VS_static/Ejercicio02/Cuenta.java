package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio02;

import java.util.Random;

public class Cuenta {
	Random rand = new Random();

	private int num;
	private float saldo;
	
	/**
	 * 
	 */
	public Cuenta() {
		super();
	}
	
	public Cuenta(int num) {
		super();
		this.num = num;
		this.saldo = (rand.nextInt(2,10) * 1000);
	}

////////////////////////////////////////////////
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Numero de cuenta: " + num + " - saldo: " + saldo;
	} 
}

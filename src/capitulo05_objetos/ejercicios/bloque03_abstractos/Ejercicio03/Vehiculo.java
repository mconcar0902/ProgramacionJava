package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio03;

public abstract class Vehiculo {

	public abstract int acelerar();
	public abstract int frenar();
	public int velocidadActual;
	public String modelo;
	
	
	/////////////////////////////////////////////////////////////////////////////
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", modelo=" + modelo + "]";
	}
}

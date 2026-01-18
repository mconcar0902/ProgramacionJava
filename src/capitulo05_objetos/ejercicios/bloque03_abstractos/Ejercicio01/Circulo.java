package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio01;

public class Circulo extends Figura {

	private float radio;
	
	/**
	 * 
	 */
	public Circulo() {
		super();
	}
	
	/**
	 * 
	 * @param radio
	 */
	public Circulo(float radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * 
	 */
	@Override
	public float getArea() {
		return (float) (Math.PI * (this.radio * this.radio));
	}

	@Override
	public float getPerimetro() {
		return (float) (2 * Math.PI * this.radio);
	}

	/////////////////////////////////////////////////////////////////////
	
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

}

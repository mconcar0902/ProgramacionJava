package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio01;

public class Rectangulo extends Figura{

	private float altura, base;
	
	/**
	 * 
	 */
	public Rectangulo() {
		super();
	}
	
	/**
	 * 
	 * @param base
	 * @param altura
	 */
	public Rectangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * 
	 */
	@Override
	public float getArea() {
		return (this.base * this.altura);
	}

	@Override
	public float getPerimetro() {
		return (this.base * 2) + (this.altura * 2);
	}

	///////////////////////////////////////////////////////////
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

}

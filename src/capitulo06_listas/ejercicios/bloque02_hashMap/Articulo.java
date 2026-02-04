package capitulo06_listas.ejercicios.bloque02_hashMap;

public class Articulo {
	
	private int codigo;
	private int numEstante;
	private int numCant;
	
	
	/**
	 * 
	 */
	public Articulo() {
		super();
	}
	
	/**
	 * 
	 * @param codigo
	 * @param numEstante
	 * @param numCant
	 */
	public Articulo(int codigo, int numEstante, int numCant) {
		super();
		this.codigo = codigo;
		this.numEstante = numEstante;
		this.numCant = numCant;
	}

	
/////////////////////////////////////////////////////////////////////////////////////
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumEstante() {
		return numEstante;
	}
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}
	public int getNumCant() {
		return numCant;
	}
	public void setNumCant(int numCant) {
		this.numCant = numCant;
	}

	@Override
	public String toString() {
		return "Articulo-> cod = " + codigo + ", Estante = " + numEstante + ", Cantidad = " + numCant ;
	}
	
}

package capitulo05_objetos.ejercicios.bloque02_herencia.Ejercicio01_ArticulosComestibles;

public class Articulo {
	private String nombre;
	private int codigo;
	private int precio;
	
	public Articulo() {
		super();
	}
	
	public Articulo(String nombre, int codigo, int precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
}


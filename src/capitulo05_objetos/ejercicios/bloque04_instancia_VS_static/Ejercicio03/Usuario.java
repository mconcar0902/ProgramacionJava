package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio03;

public class Usuario {
	
	private static int totalUsuarios = 0;
	private static int usuariosEliminados = 0;
	private String nombre;
	
	
	/**
	 * 
	 */
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		totalUsuarios++;
	}

	/**
	 * 
	 */
	public static void eliminarUsuario() {
		usuariosEliminados++;
		System.out.println("Ahora hay " + (totalUsuarios - usuariosEliminados) + " usuarios.");
	}
	
	
	
	////////////////////////////////////////////////////////////
	
	public static int getTotalUsuarios() {
		return totalUsuarios;
	}

	public static void setTotalUsuarios(int totalUsuarios) {
		Usuario.totalUsuarios = totalUsuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getUsuariosEliminados() {
		return usuariosEliminados;
	}

	public static void setUsuariosEliminados(int usuariosEliminados) {
		Usuario.usuariosEliminados = usuariosEliminados;
	}
	

}

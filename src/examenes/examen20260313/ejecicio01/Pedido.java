package examenes.examen20260313.ejecicio01;

public class Pedido {

	private int idPedido;
	private String cliente;
	private String producto;
	private int cantidad;
	private double precioUnitario;
	
	
	public Pedido(int idPedido, String cliente, String producto, int cantidad, double precioUnitario) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario; 
	}


/////////////////////////////////////////////////////////////////////////
	
	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cliente=" + cliente + ", producto=" + producto + ", cantidad="
				+ cantidad + ", precioUnitario=" + precioUnitario + "]";
	}
	
	
	
}

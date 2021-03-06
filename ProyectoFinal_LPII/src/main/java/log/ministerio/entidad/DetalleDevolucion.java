package log.ministerio.entidad;

public class DetalleDevolucion {
	
	private int id_DetalleDevolucion,id_Devolucion,id_Bien,cantidad;
    private String nro_orden_compra,descripcion_del_dano, desBien;
	private double precioCompra,credito_adeudado;
	
	private Bien bien;
	private OrdenCompra ordenCompra;
	private Devolucion devolucion;
	

	
	public DetalleDevolucion(int id_DetalleDevolucion, int id_Devolucion, int id_Bien, int cantidad,
			String nro_orden_compra, String descripcion_del_dano, String desBien, double precioCompra,
			double credito_adeudado, Bien bien, OrdenCompra ordenCompra, Devolucion devolucion) {
		this.id_DetalleDevolucion = id_DetalleDevolucion;
		this.id_Devolucion = id_Devolucion;
		this.id_Bien = id_Bien;
		this.cantidad = cantidad;
		this.nro_orden_compra = nro_orden_compra;
		this.descripcion_del_dano = descripcion_del_dano;
		this.desBien = desBien;
		this.precioCompra = precioCompra;
		this.credito_adeudado = credito_adeudado;
		this.bien = bien;
		this.ordenCompra = ordenCompra;
		this.devolucion = devolucion;
	}


	public DetalleDevolucion() {
		
	}


	public Bien getBien() {
		return bien;
	}



	public void setBien(Bien bien) {
		this.bien = bien;
	}



	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}



	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}



	public String getDesBien() {
		return desBien;
	}



	public void setDesBien(String desBien) {
		this.desBien = desBien;
	}



	public String getNro_orden_compra() {
		return nro_orden_compra;
	}



	public void setNro_orden_compra(String nro_orden_compra) {
		this.nro_orden_compra = nro_orden_compra;
	}



	public int getId_DetalleDevolucion() {
		return id_DetalleDevolucion;
	}


	public void setId_DetalleDevolucion(int id_DetalleDevolucion) {
		this.id_DetalleDevolucion = id_DetalleDevolucion;
	}


	public int getId_Devolucion() {
		return id_Devolucion;
	}


	public void setId_Devolucion(int id_Devolucion) {
		this.id_Devolucion = id_Devolucion;
	}


	public int getId_Bien() {
		return id_Bien;
	}


	public void setId_Bien(int id_Bien) {
		this.id_Bien = id_Bien;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getDescripcion_del_dano() {
		return descripcion_del_dano;
	}


	public void setDescripcion_del_dano(String descripcion_del_dano) {
		this.descripcion_del_dano = descripcion_del_dano;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getCredito_adeudado() {
		return credito_adeudado;
	}


	public void setCredito_adeudado(double credito_adeudado) {
		this.credito_adeudado = credito_adeudado;
	}


	public Devolucion getDevolucion() {
		return devolucion;
	}


	public void setDevolucion(Devolucion devolucion) {
		this.devolucion = devolucion;
	}

	
	
}

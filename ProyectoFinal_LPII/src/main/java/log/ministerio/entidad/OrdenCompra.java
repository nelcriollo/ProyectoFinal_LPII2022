package log.ministerio.entidad;

public class OrdenCompra {
	private int idOrdencompra;
	private String nroOrdencompra;
	private String fechaOrdencompra;
	private String fechaEntrega ;
	private int idProveedor;
	private String nomProveedor;
	private String CondicionesPago ;
	private String Embalaje ;
	private String Transporte ;
	private double ValorTotalOrdenCompra;
	

	
	public OrdenCompra(int idOrdencompra, String nroOrdencompra, String fechaOrdencompra, String fechaEntrega,
			int idProveedor, String condicionesPago, String embalaje, String transporte, double valorTotalOrdenCompra) {
		this.idOrdencompra = idOrdencompra;
		this.nroOrdencompra = nroOrdencompra;
		this.fechaOrdencompra = fechaOrdencompra;
		this.fechaEntrega = fechaEntrega;
		this.idProveedor = idProveedor;
		CondicionesPago = condicionesPago;
		Embalaje = embalaje;
		Transporte = transporte;
		ValorTotalOrdenCompra = valorTotalOrdenCompra;
	}
	
public OrdenCompra() {
		
	}



	public OrdenCompra(String nroOrdencompra, String nomProveedor) {
		this.nroOrdencompra = nroOrdencompra;
		this.nomProveedor = nomProveedor;
	}

	
	public int getIdOrdencompra() {
		return idOrdencompra;
	}



	public void setIdOrdencompra(int idOrdencompra) {
		this.idOrdencompra = idOrdencompra;
	}



	public OrdenCompra(String nroOrdencompra) {
		this.nroOrdencompra = nroOrdencompra;
	}

	public String getNroOrdencompra() {
		return nroOrdencompra;
	}



	public void setNroOrdencompra(String nroOrdencompra) {
		this.nroOrdencompra = nroOrdencompra;
	}



	public String getFechaOrdencompra() {
		return fechaOrdencompra;
	}



	public void setFechaOrdencompra(String fechaOrdencompra) {
		this.fechaOrdencompra = fechaOrdencompra;
	}



	public String getFechaEntrega() {
		return fechaEntrega;
	}



	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}



	public int getIdProveedor() {
		return idProveedor;
	}



	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}



	public String getNomProveedor() {
		return nomProveedor;
	}



	public void setNomProveedor(String nomProveedor) {
		this.nomProveedor = nomProveedor;
	}



	public String getCondicionesPago() {
		return CondicionesPago;
	}



	public void setCondicionesPago(String condicionesPago) {
		CondicionesPago = condicionesPago;
	}



	public String getEmbalaje() {
		return Embalaje;
	}



	public void setEmbalaje(String embalaje) {
		Embalaje = embalaje;
	}



	public String getTransporte() {
		return Transporte;
	}



	public void setTransporte(String transporte) {
		Transporte = transporte;
	}



	public double getValorTotalOrdenCompra() {
		return ValorTotalOrdenCompra;
	}



	public void setValorTotalOrdenCompra(double valorTotalOrdenCompra) {
		ValorTotalOrdenCompra = valorTotalOrdenCompra;
	}



	
}

package log.ministerio.entidad;

public class Proveedor {
	
	private int id_proveedor;
	private String razon_social,nombre_comercial,numero_ruc,email,direccion,departamento,telefonos;
	
	
	public Proveedor(int id_proveedor, String razon_social, String nombre_comercial, String numero_ruc, String email,
			String direccion, String departamento, String telefonos) {
		this.id_proveedor = id_proveedor;
		this.razon_social = razon_social;
		this.nombre_comercial = nombre_comercial;
		this.numero_ruc = numero_ruc;
		this.email = email;
		this.direccion = direccion;
		this.departamento = departamento;
		this.telefonos = telefonos;
	}

	public Proveedor() {
	}
	
	public Proveedor(String razon_social) {
		this.razon_social = razon_social;
	}

	public Proveedor(int id_proveedor, String razon_social) {
		this.id_proveedor = id_proveedor;
		this.razon_social = razon_social;
	}

	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getNombre_comercial() {
		return nombre_comercial;
	}
	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}
	public String getNumero_ruc() {
		return numero_ruc;
	}
	public void setNumero_ruc(String numero_ruc) {
		this.numero_ruc = numero_ruc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}
}

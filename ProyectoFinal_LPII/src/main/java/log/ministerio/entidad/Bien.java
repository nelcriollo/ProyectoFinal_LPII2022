package log.ministerio.entidad;

public class Bien {

	private int cod_bien, tipo_bien, stock;
	private String nombre, descripcion, estado,nombreTipo;



	public Bien(int cod_bien, int tipo_bien, int stock, String nombre, String descripcion, String estado,
			String nombreTipo) {
		this.cod_bien = cod_bien;
		this.tipo_bien = tipo_bien;
		this.stock = stock;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.nombreTipo = nombreTipo;
	}

	public Bien() {

	}
	


	public Bien(int cod_bien, String nombre, String descripcion) {
		this.cod_bien = cod_bien;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Bien(String descripcion,int cod_bien, String nombreTipo) {
		this.nombreTipo = nombreTipo;
		this.cod_bien = cod_bien;
		this.descripcion = descripcion;
		
	}




	public String getNombreTipo() {
		return nombreTipo;
	}


	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}


	public int getCod_bien() {
		return cod_bien;
	}


	public int getTipo_bien() {
		return tipo_bien;
	}

	public void setTipo_bien(int tipo_bien) {
		this.tipo_bien = tipo_bien;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCod_bien(int cod_bien) {
		this.cod_bien = cod_bien;
	}



}

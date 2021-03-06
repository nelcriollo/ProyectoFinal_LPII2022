package log.ministerio.entidad;

import java.time.LocalDate;
import java.util.Date;

public class Devolucion {
	
	
	private int id_Devolucion,id_proveedor;
    private String nro_ficha,nomRemitente;
	private Date fecha;
	private double total_credito_adeudado;
	private Proveedor proveedor;
	
	
	public Devolucion(int id_Devolucion, int id_proveedor, String nro_ficha, String nomRemitente, Date fecha,
			double total_credito_adeudado, Proveedor proveedor) {
		this.id_Devolucion = id_Devolucion;
		this.id_proveedor = id_proveedor;
		this.nro_ficha = nro_ficha;
		this.nomRemitente = nomRemitente;
		this.fecha = fecha;
		this.total_credito_adeudado = total_credito_adeudado;
		this.proveedor = proveedor;
	
	}
	
	public Devolucion() {
		
	}
	
	
	public Devolucion(int id_Devolucion, String nro_ficha) {
		this.id_Devolucion = id_Devolucion;
		this.nro_ficha = nro_ficha;
	}

	public int getId_Devolucion() {
		return id_Devolucion;
	}
	
	public void setId_Devolucion(int id_Devolucion) {
		this.id_Devolucion = id_Devolucion;
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getNro_ficha() {
		return nro_ficha;
	}
	public void setNro_ficha(String nro_ficha) {
		this.nro_ficha = nro_ficha;
	}
	public String getNomRemitente() {
		return nomRemitente;
	}
	public void setNomRemitente(String nomRemitente) {
		this.nomRemitente = nomRemitente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal_credito_adeudado() {
		return total_credito_adeudado;
	}
	public void setTotal_credito_adeudado(double total_credito_adeudado) {
		this.total_credito_adeudado = total_credito_adeudado;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
}

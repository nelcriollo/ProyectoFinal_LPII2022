package log.ministerio.interfaces;

import java.util.List;

import log.ministerio.entidad.DetalleDevolucion;

public interface DetalleDevolucionInterfaceDAO {
	
	public List<DetalleDevolucion> ListarDetalleDevolucionPorCodDevol(int codigo);
	public int  Delete(int codigoDetalle,String nroDevolucion, double nuevoCreditoAdeudado);

}

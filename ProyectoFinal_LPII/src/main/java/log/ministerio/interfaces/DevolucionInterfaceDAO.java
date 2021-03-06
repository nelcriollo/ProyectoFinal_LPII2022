package log.ministerio.interfaces;

import java.util.List;

import log.ministerio.entidad.DetalleDevolucion;
import log.ministerio.entidad.Devolucion;

public interface DevolucionInterfaceDAO {
	public int save(Devolucion bean, List<DetalleDevolucion> lista);
	public int delete(int codigoDevol);
	public int Update(Devolucion bean);
	
	public List<Devolucion> listAll();
	public String GenerarNuemroDevolucion();
	public Devolucion ListarDevol_Por_Codigo(int codigo);

}

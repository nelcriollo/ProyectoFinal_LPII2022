package log.ministerio.fabrica;

import log.ministerio.dao.MySqlAccesoDAO;
import log.ministerio.dao.MySqlBienDAO;
import log.ministerio.dao.MySqlDetalleDevolucion;
import log.ministerio.dao.MySqlDetalleOrdenCompraDAO;
import log.ministerio.dao.MySqlDevolucionDAO;
import log.ministerio.dao.MySqlMenuDAO;
import log.ministerio.dao.MySqlMovimientoAlmacenDAO;
import log.ministerio.dao.MySqlProveedorDAO;
import log.ministerio.dao.MySqlTipoBienDAO;
import log.ministerio.dao.MySqlTipoMovimientoDAO;
import log.ministerio.dao.MySqlUsuarioDAO;
import log.ministerio.interfaces.AccesoInterfaceDAO;
import log.ministerio.interfaces.BienInterfaceDAO;
import log.ministerio.interfaces.DetalleDevolucionInterfaceDAO;
import log.ministerio.interfaces.DetalleOrdenCompraInterfaceDAO;
import log.ministerio.interfaces.DevolucionInterfaceDAO;
import log.ministerio.interfaces.MenuInterfaceDAO;
import log.ministerio.interfaces.MovimientoAlmacenInterfaceDAO;
import log.ministerio.interfaces.ProveedorInterfaceDAO;
import log.ministerio.interfaces.TipoBienInterfaceDAO;
import log.ministerio.interfaces.TipoMovimientoInterfaceDAO;
import log.ministerio.interfaces.UsuarioInterfaceDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public UsuarioInterfaceDAO getUsuarioInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlUsuarioDAO();
	}

	@Override
	public MenuInterfaceDAO getMenuInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlMenuDAO();
	}

	@Override
	public AccesoInterfaceDAO getAccesoInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlAccesoDAO();
	}

	@Override
	public ProveedorInterfaceDAO getProveedorInterfaceDAO() {
		//TODO Auto-generated method stub
		return new MySqlProveedorDAO();
	}

	@Override
	public BienInterfaceDAO getBienInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlBienDAO();
	}

	@Override
	public TipoBienInterfaceDAO getTipoBienInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlTipoBienDAO();
	}

	@Override
	public DetalleOrdenCompraInterfaceDAO getDetalleOrdenCompraInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlDetalleOrdenCompraDAO();
	}

	@Override
	public DevolucionInterfaceDAO getDevolucionInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlDevolucionDAO();
	}

	@Override
	public DetalleDevolucionInterfaceDAO getDetalleDevolucionInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlDetalleDevolucion();
	}

	@Override
	public MovimientoAlmacenInterfaceDAO getMovimientoAlmacenInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlMovimientoAlmacenDAO();
	}

	@Override
	public TipoMovimientoInterfaceDAO getTipoMovimientoInterfaceDAO() {
		// TODO Auto-generated method stub
		return new MySqlTipoMovimientoDAO();
	}
	

}

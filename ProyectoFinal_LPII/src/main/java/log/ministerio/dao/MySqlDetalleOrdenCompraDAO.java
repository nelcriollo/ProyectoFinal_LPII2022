package log.ministerio.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import log.ministerio.entidad.Bien;
import log.ministerio.entidad.DetalleOrdenCompra;
import log.ministerio.entidad.OrdenCompra;
import log.ministerio.interfaces.DetalleOrdenCompraInterfaceDAO;
import log.ministerio.utils.MySqlConexion;

public class MySqlDetalleOrdenCompraDAO implements DetalleOrdenCompraInterfaceDAO {

	@Override
	public List<DetalleOrdenCompra> list_OC_Detalle() {
		List<DetalleOrdenCompra> lista=new ArrayList<DetalleOrdenCompra>();
		DetalleOrdenCompra bean=null;
		Connection conex=null;
		CallableStatement  cstm=null;
		ResultSet rs=null;
		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{call SP_REPORTE_ORDEN_COMPRA_DETALLE()}"); 

			rs=cstm.executeQuery();

			while(rs.next()) {

				bean=new DetalleOrdenCompra();
				
				//crear objeto de la clase Cargo
				OrdenCompra oc =new OrdenCompra(rs.getString(1),rs.getString(2));
				bean.setOrdenCompra(oc);
				
				Bien b =new Bien(rs.getInt(3),rs.getString(4),rs.getString(5));
				bean.setBien(b);
				
				bean.setPrecioUnitario(rs.getDouble(6));
				bean.setCantidad(rs.getInt(7));
				bean.setValortotal(rs.getDouble(8));



				lista.add(bean);
				
			} 
		}
		catch (Exception e) {
			System.out.println("Error en la Consulta..."+e.getMessage());
		}finally {
			try {
				if(cstm!=null || conex!=null)
					cstm.close();
				conex.close();
			} catch (SQLException ex) {
				System.out.println("No se pudo conectar a la BD "+ex.getMessage());
				ex.printStackTrace();
			}
		}

		return lista;
	}

}

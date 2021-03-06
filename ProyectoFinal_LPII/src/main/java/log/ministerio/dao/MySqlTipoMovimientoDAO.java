package log.ministerio.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import log.ministerio.entidad.TipoMovimiento;
import log.ministerio.interfaces.TipoMovimientoInterfaceDAO;
import log.ministerio.utils.MySqlConexion;

public class MySqlTipoMovimientoDAO implements TipoMovimientoInterfaceDAO {

	@Override
	public List<TipoMovimiento> listAll() {
		List<TipoMovimiento> lista=new ArrayList<TipoMovimiento>();
		TipoMovimiento bean=null;
		Connection conex=null;
		CallableStatement  cstm=null;
		ResultSet rs=null;
		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{call SP_LISTAR_TIPO_MOVI_ALMACEN()}"); 

			rs=cstm.executeQuery();

			while(rs.next()) {

				bean=new TipoMovimiento();
				
				bean.setId_TipoMovimiento(rs.getInt(1));
				bean.setNombreMovimiento(rs.getString(2));

				lista.add(bean);
				System.out.println("Se listaron: "+lista+ " datos");
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

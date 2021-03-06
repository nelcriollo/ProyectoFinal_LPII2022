package log.ministerio.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import log.ministerio.entidad.Acceso;
import log.ministerio.entidad.Bien;
import log.ministerio.interfaces.BienInterfaceDAO;
import log.ministerio.utils.MySqlConexion;

public class MySqlBienDAO implements BienInterfaceDAO {

	@Override
	public int Save(Bien bean) {
		int insert =-1;
		Connection conex=null;
		CallableStatement  cstm=null;

		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{CALL SP_REGISTRAR_BIEN(?,?,?,?,?,?)}");
			
			cstm.setInt(1,bean.getCod_bien());
			cstm.setInt(2,bean.getTipo_bien());
			cstm.setString(3,bean.getNombre());
			cstm.setString(4,bean.getDescripcion());
			cstm.setInt(5,bean.getStock());
			cstm.setString(6,bean.getEstado());

			insert=cstm.executeUpdate();


		} catch (Exception e) {
			System.out.println("Error en la insert..."+e.getMessage());
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

		return insert;
	}

	@Override
	public int Update(Bien bean) {
		int insert =-1;
		Connection conex=null;
		CallableStatement  cstm=null;

		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{CALL SP_ACTUALIZAR_BIEN(?,?,?,?,?,?)}");
			
			cstm.setInt(1,bean.getCod_bien());
			cstm.setInt(2,bean.getTipo_bien());
			cstm.setString(3,bean.getNombre());
			cstm.setString(4,bean.getDescripcion());
			cstm.setInt(5,bean.getStock());
			cstm.setString(6,bean.getEstado());

			insert=cstm.executeUpdate();
			

		} catch (Exception e) {
			System.out.println("Error en la actualización..."+e.getMessage());
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

		return insert;
	}

	@Override
	public int Delete(int cod_bien) {
		int salida=-1; 
		Connection conex=null; 
		CallableStatement cstm=null; 
		try { 

			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{call SP_ELIMINAR_BIEN(?)}"); 
			cstm.setInt(1, cod_bien); 

			salida=cstm.executeUpdate();
			
		} 
		catch (Exception e) {
			System.out.println("Error en la Eliminazación..."+e.getMessage());
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

		return salida;
	}

	@Override
	public Bien findById(int cod_bien) {
		Bien bean =null;
		Connection conex =null;
		CallableStatement  cstm=null;
		ResultSet rs =null;

		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{call SP_LISTAR_BIEN_POR_COD(?)}"); 
			cstm.setInt(1, cod_bien); 

			rs=cstm.executeQuery();

			while (rs.next()) {

				bean=new Bien();
				
				bean.setCod_bien(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setDescripcion(rs.getString(3));
				bean.setTipo_bien(rs.getInt(4));
				bean.setNombreTipo(rs.getString(5));
				bean.setStock(rs.getInt(6));
				bean.setEstado(rs.getString(7));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(conex != null)conex.close();
				if(cstm != null)cstm.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return bean;
	}

	@Override
	public List<Bien> listAll() {
		List<Bien> lista=new ArrayList<Bien>();
		Bien bean=null;
		Connection conex=null;
		CallableStatement  cstm=null;
		ResultSet rs=null;
		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{call SP_LISTAR_BIEN()}"); 

			rs=cstm.executeQuery();

			while(rs.next()) {

				bean=new Bien();
				
				
				bean.setCod_bien(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setDescripcion(rs.getString(3));
				bean.setNombreTipo(rs.getString(4));
				bean.setStock(rs.getInt(5));
				bean.setEstado(rs.getString(6));

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

	@Override
	public List<Bien> listAllEstado() {
		List<Bien> lista=new ArrayList<Bien>();
		Bien bean=null;
		Connection conex=null;
		CallableStatement  cstm=null;
		ResultSet rs=null;
		try {
			conex=MySqlConexion.getConectar();
			cstm=conex.prepareCall("{call SP_LISTAR_BIENES_ESTADO()}"); 

			rs=cstm.executeQuery();

			while(rs.next()) {

				bean=new Bien();
				
				
				bean.setCod_bien(rs.getInt(1));
				bean.setDescripcion(rs.getString(2));

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

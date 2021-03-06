package log.ministerio.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import log.ministerio.entidad.Acceso;
import log.ministerio.services.AccesoService;


@WebServlet("/ServletAcceso")
public class ServletAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AccesoService servicioAcceso = new AccesoService();

	public ServletAcceso() {
		super();

	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String accion;
		accion=request.getParameter("tipo");
		if(accion.equals("LISTAR")) 
			listarAccesos(request,response);
		else if(accion.equals("REGISTRAR")) 
			registrarAcceso(request,response);
		else if(accion.equals("ELIMINAR")) 
			eliminarAcceso(request,response);

		else if(accion.equals("GenerarID")) 
			ObtenerID(request,response);


	}


	private void eliminarAcceso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo;

		codigo=request.getParameter("codigoEliminar");

		int salida;
		salida=servicioAcceso.EliminarAcceso(Integer.parseInt(codigo));

		if(salida>0) {

			request.setAttribute("MENSAJE", "Acceso eliminado correctamente");
			listarAccesos(request, response);
		}
		else {
			request.setAttribute("MENSAJE", "Error en la eliminación de Acceso");
			listarAccesos(request, response);

		}

	}

	private void registrarAcceso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String identificador,codAcc,codUser,codmenu,codRol;

		identificador=request.getParameter("tipoOperacion");
		codAcc=request.getParameter("codAcc");
		codmenu=request.getParameter("menu");
		codUser=request.getParameter("user");
		codRol=request.getParameter("opcionMemu");

		Acceso bean=new Acceso();

		
		bean.setCod_menu(Integer.parseInt(codmenu));
		bean.setCod_usuario(Integer.parseInt(codUser));
		bean.setCod_Rol(Integer.parseInt(codRol));

		int tipo = Integer.parseInt(identificador);
		int salida;

		if(tipo==0) {

			salida=servicioAcceso.RegistrarAcceso(bean);

			if(salida>0) {


				request.setAttribute("MENSAJE", "Acceso registrado correctamente");
				listarAccesos(request, response);
			}
			else {
				request.setAttribute("MENSAJE", "Error en el registro de Acceso");
				listarAccesos(request, response);

			}

		}else if (tipo==1) {
			bean.setCod_acceso(Integer.parseInt(codAcc));
			salida=servicioAcceso.ActualizarAcceso(bean);

			if(salida>0) {


				request.setAttribute("MENSAJE", "Acceso Actualizado correctamente");
				listarAccesos(request, response);
			}
			else {
				request.setAttribute("MENSAJE", "Error al actualizar de Acceso");
				listarAccesos(request, response);

			}

		}
	}


	private void listarAccesos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Acceso> data=servicioAcceso.ListarAccesos();

		request.setAttribute("listaAccesos", data);

		request.getRequestDispatcher("/mantenimientoAcceso.jsp").forward(request, response);

	}


	private void ObtenerID(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			ResultSet rs = new AccesoService().GenerarCodigoAcceso();
			if(rs.next()) {

				request.setAttribute("ID", rs.getString(1));

				request.getRequestDispatcher("/mantenimientoAcceso.jsp").forward(request, response);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

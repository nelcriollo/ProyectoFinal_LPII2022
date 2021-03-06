package log.ministerio.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import log.ministerio.entidad.Acceso;
import log.ministerio.entidad.Usuario;
import log.ministerio.services.AccesoService;
import log.ministerio.services.UsuarioService;

/**
 * Servlet implementation class ServletUsuarioJSON
 */
@WebServlet("/ServletUsuarioJSON")
public class ServletUsuarioJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ServletUsuarioJSON() {
		super();

	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Usuario>  lista = new UsuarioService().ListarUsuarios();

		Gson Gson=new Gson();

		String json=Gson.toJson(lista);

		response.setContentType("application/json;charset=UTF-8");

		PrintWriter salida=response.getWriter();
		salida.println(json);
	}

}

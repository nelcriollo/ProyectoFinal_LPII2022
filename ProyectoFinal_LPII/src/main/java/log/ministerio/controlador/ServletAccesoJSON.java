package log.ministerio.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import log.ministerio.entidad.Acceso;
import log.ministerio.services.AccesoService;

/**
 * Servlet implementation class ServletAccesoJSON
 */
@WebServlet("/ServletAccesoJSON")
public class ServletAccesoJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ServletAccesoJSON() {
		super();

	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo=request.getParameter("codigo");
	

		Acceso  objAcceso = new AccesoService().Buscar_Por_codAcceso(Integer.parseInt(codigo));

		Gson Gson=new Gson();

		String json=Gson.toJson(objAcceso);

		response.setContentType("application/json;charset=UTF-8");

		PrintWriter salida=response.getWriter();
		salida.println(json);
	}

}

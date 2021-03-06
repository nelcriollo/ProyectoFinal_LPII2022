package log.ministerio.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.*;

import log.ministerio.entidad.Devolucion;
import log.ministerio.services.DevolucionService;

/**
 * Servlet implementation class ServletDevolucionBienJSON
 */
@WebServlet("/ServletDevolucionBienJSON")
public class ServletDevolucionBienJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DevolucionService DevolServicio=new DevolucionService();
	
    public ServletDevolucionBienJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigo = request.getParameter("codigo");
		Devolucion data=DevolServicio.listarDevoluciones_Por_Codigo(Integer.parseInt(codigo));
	
		Gson gson=new Gson();

		String json=gson.toJson(data);
		

		response.setContentType("application/json;charset=UTF-8");
		PrintWriter salida=response.getWriter();
		salida.println(json);	
	}

}

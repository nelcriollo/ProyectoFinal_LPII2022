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

import log.ministerio.entidad.Bien;
import log.ministerio.services.BienService;

/**
 * Servlet implementation class ServletBienesJSON
 */
@WebServlet("/ServletBienesJSON")
public class ServletBienesJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BienService servicioBien= new BienService();
	
    public ServletBienesJSON() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Bien> lista=servicioBien.ListarBienes();
		
		Gson gson=new Gson();
		
		String json=gson.toJson(lista);
		
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter salida=response.getWriter();
		salida.println(json);	
	}

}

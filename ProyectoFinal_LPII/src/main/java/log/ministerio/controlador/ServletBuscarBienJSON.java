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
import log.ministerio.entidad.Bien;
import log.ministerio.services.AccesoService;
import log.ministerio.services.BienService;



@WebServlet("/ServletBuscarBienJSON")
public class ServletBuscarBienJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
    public ServletBuscarBienJSON() {
        super();
        
    }

    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigo=request.getParameter("codbien");
		

		Bien  objBien = new BienService().BuscarBienPorCodigo(Integer.parseInt(codigo));

		Gson Gson=new Gson();

		String json=Gson.toJson(objBien);

		response.setContentType("application/json;charset=UTF-8");

		PrintWriter salida=response.getWriter();
		salida.println(json);
	}

}

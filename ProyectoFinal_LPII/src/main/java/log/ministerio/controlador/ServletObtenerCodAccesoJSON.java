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


@WebServlet("/ServletObtenerCodAccesoJSON")
public class ServletObtenerCodAccesoJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletObtenerCodAccesoJSON() {
        super();
        
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			 ResultSet rs = new AccesoService().GenerarCodigoAcceso();
			if(rs.next()) {
					Gson Gson=new Gson();
					String json=Gson.toJson(rs.getString(1));
					
					response.setContentType("application/json;charset=UTF-8");
					
					PrintWriter salida=response.getWriter();
					salida.println(json);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

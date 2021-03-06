package log.ministerio.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import log.ministerio.entidad.Proveedor;
import log.ministerio.services.ProveedorService;

/**
 * Servlet implementation class ServletProveedor
 */
@WebServlet("/ServletProveedor")
public class ServletProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//declarar objeto de la clase ProveedorService
	private ProveedorService servicio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProveedor() {
        super();
        //crear objeto
        servicio=new ProveedorService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion;
		accion=request.getParameter("tipo");
		
		if(accion.equals("LISTAR")) {
			listarProveedor(request,response);
		}
		else if(accion.equals("REGISTRAR")) {
			registrarProveedor(request,response);
		}
		else if(accion.equals("ELIMINAR")) {
			eliminarProveedor(request,response);
		}
	}
	
	private void eliminarProveedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idPro;
		idPro=request.getParameter("codigoEliminar");

		int salida;
		salida=servicio.eliminarPorId(Integer.parseInt(idPro));

		if(salida>0) {
			request.setAttribute("MENSAJE", "Proveedor eliminado correctamente");
			listarProveedor(request, response);
		}
		else {
			request.setAttribute("MENSAJE", "Error en la eliminación");
			listarProveedor(request, response);
		}
		
	}
	
	private void listarProveedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Proveedor> data=servicio.listarTodos();
		
		request.setAttribute("listaProveedor", data);
		request.getRequestDispatcher("/MantenimientoProveedor.jsp").forward(request, response);
	}
	
	private void registrarProveedor(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

String identificador,idPro,razoPro,nomPro,rucPro,emailPro,dirPro,depPro,telPro;
		
		identificador=request.getParameter("tipoOperacion");
		idPro=request.getParameter("mpIdProveedor");
		razoPro=request.getParameter("mpRazonSocial");
		nomPro=request.getParameter("mpNombreComercial");
		rucPro=request.getParameter("mpRuc");
		emailPro=request.getParameter("mpEmail");
		dirPro=request.getParameter("mpDireccion");
		depPro=request.getParameter("mpDepartamento");
		telPro=request.getParameter("mpTelefono");

		Proveedor bean=new Proveedor();		
		
		
		bean.setRazon_social(razoPro);
		bean.setNombre_comercial(nomPro);
		bean.setNumero_ruc(rucPro);
		bean.setEmail(emailPro);
		bean.setDireccion(dirPro);
		bean.setDepartamento(depPro);
		bean.setTelefonos(telPro);
		
		int tipo = Integer.parseInt(identificador);
		int salida;
		
		if (tipo == 0) {
			
			salida=servicio.registrar(bean);

			if(salida>0) {
				
				request.setAttribute("MENSAJE", "Proveedor registrado correctamente");
				listarProveedor(request, response);
				
			}
			else {
				request.setAttribute("MENSAJE", "Error en el registro");
				listarProveedor(request, response);
			}
						
		}
		else if (tipo == 1) {
			
			bean.setId_proveedor(Integer.parseInt(idPro));
			
			salida=servicio.actualizar(bean);			

			if(salida>0) {
				request.setAttribute("MENSAJE", "Proveedor actualizado correctamente");
				listarProveedor(request, response);
			}
			else {
				request.setAttribute("MENSAJE", "Error en la actualización");
				listarProveedor(request, response);
			}			
		}
	
	}

}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2022-06-13 00:20:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mantenimientoAcceso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Nelcriollo/Desktop/ProyectoFinal_LPII/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProyectoFinal_LPII/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098729090000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1653951253000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

if (request.getSession().getAttribute("LISTAMenu") == null)
	response.sendRedirect("login.jsp");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Mantenimiento de Acceso</title>\r\n");
      out.write("<!--  jquery-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\" https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap5.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".help-block {\r\n");
      out.write("    color: red;\r\n");
      out.write("}\r\n");
      out.write(".form-group.has-error .form-control-label {\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group.has-error .form-control {\r\n");
      out.write("\tborder: 1px solid red;\r\n");
      out.write("\tbox-shadow: 0 0 0 0.2rem rgba(250, 16, 0, 0.18);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row \">\r\n");
      out.write("\t\t\t<h1 class=\"text-center mt-5\">Mantenimiento de Aceso<img src=\"img/llave.svg\" class=\"img-thumbnail ms-3 mb-5\" width=\"75\"></h1>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<div class=\"row ms-0 d-flex p-2\">\r\n");
      out.write("\t\t\t\t<div class=\"col mt-5\">\r\n");
      out.write("\t\t\t\t\t<form id=\"idRegistrar\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\taction=\"ServletAcceso?tipo=REGISTRAR\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"row rounded p-2 border\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"hidden\" class=\"form-control\" id=\"idIdentificador\" name=\"tipoOperacion\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputState\" class=\"form-label\">Código</label>\r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" class=\"form-control\" id=\"idcodigo\" name=\"codAcc\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputState\" class=\"form-label\">Usuario</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"idUser\" class=\"form-select form-control\" name=\"user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected>--Seleccione Usuario--</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputState\" class=\"form-label\">Menu</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"idcodMenu\" class=\"form-select form-control\" name=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected>--Seleccione Menú--</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputState\" class=\"form-label\">Opcion de Menu</label>\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"idcodOpcionMemu\" class=\"form-select form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"opcionMemu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected>--Seleccione Opcionde Menu--</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-3 p-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-registrar\"  disabled=\"disabled\">Registrar</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-3 p-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary btn-nuevo\">Nuevo</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- Modal para Eliminar-->\r\n");
      out.write("\t\t\t\t\t<div class=\"modal fade\" id=\"modalElimimar\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t        <h7 class=\"modal-title\" id=\"exampleModalLabel\">Sistema</h7>\r\n");
      out.write("\t\t\t\t\t        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t        \t<form id=\"idRegistrar\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\taction=\"ServletAcceso?tipo=ELIMINAR\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\" name=\"codigoEliminar\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"codigoEliminar\">\r\n");
      out.write("\t\t\t\t\t\t\t<h6>¿Seguro de eliminar?</h6>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">SI</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-bs-dismiss=\"modal\">NO</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col mt-4\">\r\n");
      out.write("\t\t\t\t\t<table id=\"example\" class=\"table table-striped\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t<thead class=\"table-dark\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t    <th>CODIGO</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>MODULO</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>USUARIO</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>OPCION DE MENU</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t\t<scripts\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- JS para validación-->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.4.0/js/bootstrapValidator.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\tllenarCboMenu();\r\n");
      out.write("\t\t\tllenarcboUsuario();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t //fuciones para llenar los select\r\n");
      out.write("\t\t function llenarcboUsuario(){\r\n");
      out.write("\t\t\t$.get(\"ServletUsuarioJSON\",function(response){\r\n");
      out.write("\t\t\t\t$.each(response,function(index,item){\r\n");
      out.write("\t\t\t\t\t$(\"#idUser\").append(\"<option value='\"+item.cod_usuario+\"'>\"+item.login_usuario+\"</option>\");\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction llenarCboMenu(){\r\n");
      out.write("\t\t\t$.get(\"ServletMenuJSON\",function(response){\r\n");
      out.write("\t\t\t\t$.each(response,function(index,item){\r\n");
      out.write("\t\t\t\t\t$(\"#idcodMenu\").append(\"<option value='\"+item.cod_menu+\"'>\"+item.des_menu+\"</option>\");\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//funcion para llenar el select Opciones de menu Segun el código del modulo principal\r\n");
      out.write("\t\t $('#idcodMenu').on('change', function() {\r\n");
      out.write("\t\t\tlet codmenu;\r\n");
      out.write("\t\t\tcodmenu=$(\"#idcodMenu\").val();\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t$.get(\"ServletRolMenuJSON?rolesmenu=\"+codmenu,function(response){\r\n");
      out.write("\t\t\t\t$(\"#idcodOpcionMemu\").empty();\r\n");
      out.write("\t\t\t\t$('#idcodOpcionMemu').append('<option value=\"\" selected>--Seleccione Opcionde Menú--</option>');\r\n");
      out.write("\t\t\t\t$.each(response,function(index,item){\r\n");
      out.write("\t\t\t\t\t$(\"#idcodOpcionMemu\").append(\"<option value='\"+item.cod_rolmenu+\"'>\"+item.des_rolmenu+\"</option>\");\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//asignamos evento a todos los botones(\"editar\") con nombre de clase \"btn-editar\"\r\n");
      out.write("\t\t$(document).on(\"click\", \".btn-editar\", function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t $(\"#idIdentificador\").val(1); //pasamos el valor de uno como indicadorpara actualizar\r\n");
      out.write("\t\t\t $('.btn-registrar').text(\"Actualizar\"); // para cambiar el texto del boton registrar\r\n");
      out.write("\t\t\t $('.btn-nuevo').text(\"Cancelar\"); // para cambiar el texto del boton Nuevo\r\n");
      out.write("\t\t\t $('.btn-registrar').prop('disabled', false);// para habilitar el  boton registrar\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\tlet codigo;\r\n");
      out.write("\t\t\t //obtenemos el valor de la columna(0), para paserle como parametro al ServletAccesoJSON\r\n");
      out.write("\t\t\tcodigo = $(this).parents(\"tr\").find(\"td\")[0].innerHTML;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.get(\"ServletAccesoJSON\",{\"codigo\":codigo},function(response){\r\n");
      out.write("\t\t\t\tconsole.log(response);\r\n");
      out.write("\t\t\t\t$(\"#idcodigo\").val(response.cod_acceso);\r\n");
      out.write("\t\t\t\t$(\"#idUser\").val(response.cod_usuario);\r\n");
      out.write("\t\t\t\t$(\"#idcodMenu\").val(response.cod_menu);\r\n");
      out.write("\t\t\t\t$(\"#idcodOpcionMemu\").val(response.cod_Rol);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//funcion para eliminar por código\r\n");
      out.write("\t\t$(document).on(\"click\", \".btn-outline-danger\", function() {\r\n");
      out.write("\t\t\t//variable\r\n");
      out.write("\t\t\tlet codigo;\r\n");
      out.write("\t\t\t//obtener el código del Acceso según el botón eliminar que se a pulsado\r\n");
      out.write("\t\t\tcodigo = $(this).parents(\"tr\").find(\"td\")[0].innerHTML;\r\n");
      out.write("\t\t\t//asignar a la caja con id \"codigoEliminar\" el valor de la variable \"codigo\"\r\n");
      out.write("\t\t\t$(\"#codigoEliminar\").val(codigo);\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//funcion para el btn-nuevo \r\n");
      out.write("\t\t$(document).on(\"click\", \".btn-nuevo\", function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\tif( $('.btn-nuevo').text()==\"Nuevo\"){           \r\n");
      out.write("\t\t\t\t$.get(\"ServletObtenerCodAccesoJSON\",function(response){\r\n");
      out.write("\t\t\t\t\t$(\"#idcodigo\").val(response);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#idUser\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#idcodMenu\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#idcodOpcionMemu\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t $('.btn-registrar').text(\"Registrar\"); // para cambiar el texto del boton registrar\r\n");
      out.write("\t\t\t\t\t $('.btn-registrar').prop('disabled', false);// para habilitar el  boton registrar\r\n");
      out.write("\t\t\t\t\t $('.btn-nuevo').text(\"Cancelar\"); // para cambiar el texto del boton Nuevo\r\n");
      out.write("\t\t\t\t\t $(\"#idIdentificador\").val(0); //pasamos el valor de cero como indicadorpara registrar\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t  }else{\r\n");
      out.write("\t\t\t\t  $(\"#idcodigo\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#idUser\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#idcodMenu\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#idcodOpcionMemu\").val(\"\");\r\n");
      out.write("\t\t\t\t\t $('.btn-registrar').text(\"Registrar\"); // para cambiar el texto del boton registrar\r\n");
      out.write("\t\t\t\t\t $('.btn-nuevo').text(\"Nuevo\"); // para cambiar el texto del boton Nuevo\r\n");
      out.write("\t\t\t\t\t $('.btn-registrar').prop('disabled', true);// para deshabilitar el  boton registrar\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$('#idRegistrar').bootstrapValidator(\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfields : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tuser : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalidators : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnotEmpty: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmessage : 'Selecione un Usuario'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmenu : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalidators : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnotEmpty: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmessage : 'Selecione un Menu'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\topcionMemu : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalidators : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnotEmpty: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmessage : 'Selecione una opcion de Menu'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar popoverTriggerList = [].slice.call(document\r\n");
      out.write("\t\t\t\t.querySelectorAll('[data-bs-toggle=\"popover\"]'))\r\n");
      out.write("\t\tvar popoverList = popoverTriggerList.map(function(popoverTriggerEl) {\r\n");
      out.write("\t\t\treturn new bootstrap.Popover(popoverTriggerEl)\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t\r\n");
      out.write("    $('#example').DataTable();\r\n");
      out.write("   \r\n");
      out.write("} );\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$('.toast').toast('show');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /mantenimientoAcceso.jsp(47,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"toast bg-black mx-auto mt-2\" role=\"alert\"\r\n");
          out.write("\t\t\taria-live=\"assertive\" aria-atomic=\"true\" data-bs-delay=\"3000\">\r\n");
          out.write("\t\t\t<div class=\"toast-header\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"toast\"\r\n");
          out.write("\t\t\t\t\taria-label=\"Close\"></button>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"toast-body text-light\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /mantenimientoAcceso.jsp(153,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.listaAccesos}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /mantenimientoAcceso.jsp(153,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("row");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.cod_acceso}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.des_menu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.login_usuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.des_rol}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td class=\"p-1\"><button type=\"button\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-outline-success btn-sm align-top btn-editar\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\tdata-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"idbtn-editar\">Editar</button></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td class=\"p-1\"><button type=\"button\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-outline-danger btn-sm align-top p-1\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\tdata-bs-toggle=\"modal\" data-bs-target=\"#modalElimimar\">Eliminar</button></td>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}

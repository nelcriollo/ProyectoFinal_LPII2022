/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2022-06-17 14:21:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1653951253000L));
    _jspx_dependants.put("jar:file:/C:/Users/Nelcriollo/Desktop/ProyectoFinal_LPII/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProyectoFinal_LPII/WEB-INF/lib/standard.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1098729090000L));
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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 
if (request.getSession().getAttribute("LISTAMenu") == null)
	response.sendRedirect("login.jsp");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  jquery-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\" https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Los iconos tipo Solid de Fontawesome-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"\r\n");
      out.write("\tintegrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\"\r\n");
      out.write("\tintegrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\"\r\n");
      out.write("\tcrossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<!-- Los estilos de Bootstrap-->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Los estilos locales de la carpeta css de proyecto-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/header.css\">\r\n");
      out.write("\r\n");
      out.write("<footer class=\"text-center text-white  h-auto navbar-dark fondonavsup\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"container p-1\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row fs-15\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 mb-6 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<h7 class=\"text-uppercase fw-bolder\">UBICACIÓN</h7>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tAv. Abancay 5, <br> Cercado de Lima 15001\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-6 mb-12 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<!-- Section: Social media -->\r\n");
      out.write("\t\t\t\t<section class=\"mb-4\">\r\n");
      out.write("\t\t\t\t\t<h6>Ministerio Público - Fiscalía de la Nación 2022</h6>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-outline-light btn-social mx-1\"\r\n");
      out.write("\t\t\t\t\t\thref=\"https://es-la.facebook.com/\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fab fa-fw fa-facebook-f\"></i></a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-outline-light btn-social mx-1\"\r\n");
      out.write("\t\t\t\t\t\thref=\"https://twitter.com/\"><i class=\"fab fa-fw fa-twitter\"></i></a>\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-outline-light btn-social mx-1\"\r\n");
      out.write("\t\t\t\t\t\thref=\"https://www.youtube.com/\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fab fa-fw fa-youtube\"></i></a>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--Grid column-->\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 mb-3 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<h7 class=\"text-uppercase fw-bolder\">CONTACTO</h7>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tCentral Telefónica: <br> 625-5555<br> Línea Gratuita:<br>\r\n");
      out.write("\t\t\t\t\t0-800-00-205\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"text-center p-2\">© Derechos\r\n");
      out.write("\t\tReservados</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}

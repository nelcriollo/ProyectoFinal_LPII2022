/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2022-06-25 19:10:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div style=\"text-align:right; tamaño de fuente: 18px; ancho: 95%; margin-top:1%\"><a href=\"https://stackfame.com/editable-html-table-using-javascript-jquery/\" >tutorial |  <a href=\"https://stackfame.com/\">Página web de </a></div>\r\n");
      out.write(" <Br>\r\n");
      out.write("    <h1 class=\"col-md-12 text-center\" style=\"color: black\">Dynamic Editable HTML table using Javascript, Jquery and Bootstrap with add, edit, and Delete Options</h1>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <Br>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"col-md-10 con capacidad de respuesta a la tabla\">\r\n");
      out.write("<table class=\"table table-bordered table-striped table-hover table-condensed  text-center\" id=\"DyanmicTable\">\r\n");
      out.write(" <thead>\r\n");
      out.write("   <Tr>\r\n");
      out.write("     <th class=\"centro de texto\">\r\n");
      out.write("Nombre completo\r\n");
      out.write("     </ésimo>\r\n");
      out.write("     <th class=\"centro de texto\">\r\n");
      out.write("Sitio web\r\n");
      out.write("     </ésimo>\r\n");
      out.write("     <th class=\"centro de texto\">\r\n");
      out.write("Contacto No\r\n");
      out.write("     </ésimo>\r\n");
      out.write("     <th class=\"centro de texto\">\r\n");
      out.write("       <button id=\"addNewRow\" class=\"btn btn-primary btn-sm\">Agregar nueva fila</button>\r\n");
      out.write("     </ésimo>\r\n");
      out.write("   </Tr>\r\n");
      out.write(" </thead>\r\n");
      out.write(" <tbody>\r\n");
      out.write("   <Tr>\r\n");
      out.write("     <Td>\r\n");
      out.write("Juan M\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       http://john-m.com\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       9876543210\r\n");
      out.write("     </Td>\r\n");
      out.write("   </Tr>\r\n");
      out.write("   <Tr>\r\n");
      out.write("     <Td>\r\n");
      out.write("       Ariana Smith\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       https://araiana-smith.com\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       1234567890\r\n");
      out.write("     </Td>\r\n");
      out.write("   </Tr>\r\n");
      out.write("   <Tr>\r\n");
      out.write("     <Td>\r\n");
      out.write("Plata Bourne\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       https://silver-bourne.com\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       988889888\r\n");
      out.write("     </Td>\r\n");
      out.write("   </Tr>\r\n");
      out.write("   <Tr>\r\n");
      out.write("     <Td>\r\n");
      out.write("       Rahul Ray\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       https://rahul-ray.com\r\n");
      out.write("     </Td>\r\n");
      out.write("     <Td>\r\n");
      out.write("       9797979797\r\n");
      out.write("     </Td>\r\n");
      out.write("   </Tr>\r\n");
      out.write(" </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</Div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<script  src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\"   crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"bootstable.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"jquery.dynamicTable.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"dataTable.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script  src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\"   crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"bootstable.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$('#DyanmicTable').SetEditable({\r\n");
      out.write("    \r\n");
      out.write("\t $addButton:$('#add_new fila')\r\n");
      out.write("\t  });\r\n");
      out.write("\t//Si desea alertar o hacer algo después de la edición, elimínelo y, a continuación, utilice las siguientes funciones\r\n");
      out.write("\t onEdit: function() {}, //Edit evento\r\n");
      out.write("\t onDelete: function() {}, //Delete evento\r\n");
      out.write("\t onAdd: function() {} //Add evento\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("$('#DyanmicTable').SetEditable({ $addButton: $('#addNewRow')});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
}

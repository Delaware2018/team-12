package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Registration</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"body-wrapper\" class=\"container containder-fluid my-5\">\n");
      out.write("\t\t<form class=\"form\" method=\"POST\" name=\"registration-form\" action=\"Registration\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"name\">Name: </label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"name\" id=\"name\" placeholder=\"name\"> \n");
      out.write("\t\t\t\t<span id=\"name_err\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name_err!=null? name_err : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"age\">Age: </label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"age\" id=\"age\" placeholder=\"age\">\n");
      out.write("\t\t\t\t<span id=\"age_err\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${age_err!=null? age_err : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"gender\">Gender: </label> <select\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"gender\">\n");
      out.write("\t\t\t\t\t<option>???</option>\n");
      out.write("\t\t\t\t\t<option>Male</option>\n");
      out.write("\t\t\t\t\t<option>Female</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<span id=\"gender_err\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gender_err!=null? gender_err : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"email\">Email: </label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"email\" id=\"email\" placeholder=\"email\"> \n");
      out.write("\t\t\t\t<span id=\"email_err\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email_err!=null? email_err : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"phone\">Phone: </label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"phone\" id=\"phone\" placeholder=\"phone\"> \n");
      out.write("\t\t\t\t<span id=\"phone_err\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone_err!=null? phone_err : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"zip\">Zip: </label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"zip\" id=\"zip\" placeholder=\"zip\"> \n");
      out.write("\t\t\t\t<span id=\"zip_err\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zip_err!=null? zip_err : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- bottom submit and reset button -->\n");
      out.write("\t\t\t<input type=\"submit\" class=\"btn btn-primary\"></input>\n");
      out.write("\t\t\t<input type=\"reset\" class=\"btn btn-outline-danger\"></input>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t\tvar validate = function () {\n");
      out.write("\t\t\tconsole.log('triggered validate function!');\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

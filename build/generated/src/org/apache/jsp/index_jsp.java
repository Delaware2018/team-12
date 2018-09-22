package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t<title>Home - Goodwill Delaware</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<!-- <nav class=\"navbar navbar-light bg-light\"> -->\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("\t\t<span class=\"navbar-brand mb-0 h1\"><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Goodwill_Industries_Logo.svg/200px-Goodwill_Industries_Logo.svg.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\">   Goodwill Delaware</span>\n");
      out.write("\t\t<a class=\"navbar-brand\"></a>\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("\t\t\t<ul class=\"navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">Home\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">(current)</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Rewards</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Pricing</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<div id=\"page-wrapper\" class=\"container\" style=\"border: 1px solid red;\">\n");
      out.write("\t\t<div id=\"featured-items\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t<h1>Featured Items</h1>\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t\t\t<img class=\"d-block w-100\"\n");
      out.write("\t\t\t\t\t\twidth=\"100\"\n");
      out.write("\t\t\t\t\t\theight=\"100\"\n");
      out.write("\t\t\t\t\t\tsrc=\"ui-stuff/bed.svg\"\n");
      out.write("\t\t\t\t\t\talt=\"First slide\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t<img class=\"d-block w-100\"\n");
      out.write("\t\t\t\t\t\twidth=\"100\"\n");
      out.write("\t\t\t\t\t\theight=\"100\"\n");
      out.write("\t\t\t\t\t\tsrc=\"ui-stuff/clock.svg\"\n");
      out.write("\t\t\t\t\t\talt=\"Second slide\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t<img class=\"d-block w-100\"\n");
      out.write("\t\t\t\t\t\twidth=\"100\"\n");
      out.write("\t\t\t\t\t\theight=\"100\"\n");
      out.write("\t\t\t\t\t\tsrc=\"ui-stuff/cutlery.svg\"\n");
      out.write("\t\t\t\t\t\talt=\"Third slide\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<a class=\"carousel-control-prev\" href=\"#featured-items\"\n");
      out.write("\t\t\t\trole=\"button\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Previous</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a class=\"carousel-control-next\"\n");
      out.write("\t\t\t\thref=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("\t\t\t\t<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Next</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>Goodwill Stories</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
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

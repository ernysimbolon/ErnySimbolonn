package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Flights_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <title>Flights Page</title>            \n");
      out.write("          </head>\n");
      out.write("           <body>\n");
      out.write("                 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("           \n");
      out.write("            <td valign=\"top\" rowspan=\"200\" cosplan=\"80\">\n");
      out.write("            <table>\n");
      out.write("             <tr>\n");
      out.write("                 <td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp"). toString ());
      out.write("'>Domestic Flights</a></td>\n");
      out.write("                <td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp"). toString ());
      out.write("'>International Flights</a></td>\n");
      out.write("                <td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp"). toString ());
      out.write("'>Hotel</a></td>\n");
      out.write("                <td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp"). toString ());
      out.write("'>CarRentals</a></td>\n");
      out.write("                <td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("TourPackage.jsp"). toString ());
      out.write("'>Tour Package</a></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("                <font align='center' color='darkblue' size='+1'>Please select the airline by which you want to go to your destination:\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <form action='");
out.println(response.encodeURL("SessionServlet").toString());
      out.write("' name='MyForm' Method='POST'>             \n");
      out.write("            <table cellspacing='10' align='center' border='2' bordercolor='black'>\n");
      out.write("           <tr><td bordercolor='white'>Select Hotel:</td>\n");
      out.write("           <td bordercolor='white'>\n");
      out.write("           <select name='Airline'>\n");
      out.write("           <option value='British Airways'>British Airways</option>\n");
      out.write("           <option value='Cathay Pacific'>Cathay Pacific</option>\n");
      out.write("           <option value='Qantas'>Qantas</option>\n");
      out.write("           <option value='US Airways'>US Airways</option>\n");
      out.write("           </select>\n");
      out.write("               <input type='hidden' value='FlightsServlet' name='PageName'/></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr><td bordercolor='white'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <input type='Submit' value='Next'></input></a>\n");
      out.write("                </td></tr></table></form>         \n");
      out.write("           </body>\n");
      out.write("            \n");
      out.write("</html>\n");
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

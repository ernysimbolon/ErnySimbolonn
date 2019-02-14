package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_radio_value_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_radio_value_property.release();
    _jspx_tagPool_html_form_method_action.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Home Page</title>\n");
      out.write("</head>\n");
      out.write("</body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\"><!--\n");
      out.write("\n");
      out.write("refreshdiv();\n");
      out.write("\n");
      out.write("//--></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var seconds = 5;\n");
      out.write("var img =\"imgchng\";\n");
      out.write("var url = \"ImageChange\";\n");
      out.write("function refreshdiv()\n");
      out.write("{\n");
      out.write("\tvar xmlHttp;\n");
      out.write("\n");
      out.write("\ttry{\n");
      out.write("\t\txmlHttp = new XMLHttpRequest(); // Firefox, Opera 8.0+, Safari\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tcatch (e) {\n");
      out.write("\t\ttry{\n");
      out.write("\t\t\txmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\"); // Internet Explorer\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\tcatch (e) {\n");
      out.write("\t\ttry{\n");
      out.write("\t\t\txmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tcatch (e) {\n");
      out.write("\t\t\talert(\"Your browser does not support AJAX.\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("// Timestamp for preventing IE caching the GET request fetch_unix_timestamp = function ()\n");
      out.write("\n");
      out.write("fetch_unix_timestamp fetch_unix_timestamp();\n");
      out.write("\t{\n");
      out.write("\t\treturn parseInt(new Date().getTime().toString().substring(0, 10))\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tvar timestamp = fetch_unix_timestamp();\n");
      out.write("\tvar nochaceurl = url+\"?t=\"+timestamp;\n");
      out.write("\txmlHttp.onreadystatechange=function(){\n");
      out.write("\t\tif(xmlHttp.readyState==4){\n");
      out.write("\t\t\tdocument.getElementById(img).src=xmlHttp.responseText;\n");
      out.write("\t\t\tsetTimeout('refreshdiv()',seconds*1000);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\txmlHttp.open(\"GET\",nocacheurl,true);\n");
      out.write("\txmlHttp.send(null);\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Start the refreshing process var seconds;\n");
      out.write("\n");
      out.write("window.onload  = function startfresh(){\n");
      out.write("\tsetTimeout('refreshdiv()',seconds*1000);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<td valign=\"top\"> <br/><br/><B><I><font style='font-family: Brush Script MT Italics, Gadget, sans-serif;' size='+1' color='darkblue'>Exotica Travels is a travel management company established by Jordan Desilva in Colombo, Sri Lanka. Today under the chairmanship of Jim Henry , the company has spread across the country . It provides online air tickets booking. In addition, it provides hotel suite booking in various exotic locations all over the world. Moreover, it provides rental car bookings. To avail the travel package services kindly log on to the website.</B></I>\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    </html>");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setMethod("post");
    _jspx_th_html_form_0.setAction("/SubmitAction");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<table cellspacing='10' align='center'>\n");
        out.write("<tr>\n");
        out.write("    <td><font color='darkblue' size='+2'>LOGIN AS:\n");
        out.write("</tr>\n");
        out.write("    </td>\n");
        out.write("</table>\n");
        out.write("    <table cellspacing='10' align='center'border='2' bordercolor='black'> \n");
        out.write("        <tr><td bordercolor='white'>");
        if (_jspx_meth_html_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <tr><td bordercolor='white'>");
        if (_jspx_meth_html_radio_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <tr><td bordercolor='white'><input type=\"submit\" value=\"Submit\"/>\n");
        out.write("    </table>\n");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_radio_0.setProperty("r1");
    _jspx_th_html_radio_0.setValue("existinguser");
    int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
    if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_radio_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_radio_0.doInitBody();
      }
      do {
        out.write("Existing User");
        int evalDoAfterBody = _jspx_th_html_radio_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property.reuse(_jspx_th_html_radio_0);
      return true;
    }
    _jspx_tagPool_html_radio_value_property.reuse(_jspx_th_html_radio_0);
    return false;
  }

  private boolean _jspx_meth_html_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_radio_1.setProperty("r1");
    _jspx_th_html_radio_1.setValue("newuser");
    int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
    if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_radio_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_radio_1.doInitBody();
      }
      do {
        out.write("New User");
        int evalDoAfterBody = _jspx_th_html_radio_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property.reuse(_jspx_th_html_radio_1);
      return true;
    }
    _jspx_tagPool_html_radio_value_property.reuse(_jspx_th_html_radio_1);
    return false;
  }
}

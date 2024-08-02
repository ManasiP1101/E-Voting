package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdHomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    \n");
      out.write("    <title>E-Voting</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style1.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <header>\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a><img src=\"images/logo1.png\" alt=\"logo\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"nav-menu\">\n");
      out.write("          <ul>\n");
      out.write("              <li><a href=\"AdHomepage.jsp\">Home</a></li><br><br>\n");
      out.write("              <li><a href=\"CandidateInfo.jsp\">CandidateInfo</a></li><br><br>\n");
      out.write("              <li><a href=\"ApplyForElection.jsp\">ApplyForElection</a></li><br><br>\n");
      out.write("              <li><a href=\"CandidateSign.jsp\">CandidateSign</a></li><br><br>\n");
      out.write("              <li><a href=\"ConfirmSign.jsp\">ConfirmSign</a></li><br><br>\n");
      out.write("            \n");
      out.write("              <li><a href=\"report.jsp\">Report</a></li><br><br>\n");
      out.write("               \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/mnp.jpg\" alt=\"Hero image\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero-content\">\n");
      out.write("            <br> <h1>\"Welcome  To Electronic Voting\"</h1></br>\n");
      out.write("          <p> E-Voting You Should Set an example by Voting.</p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      <!-- Destinations -->\n");
      out.write("      <section id=\"destinations\" class=\"destinations\">\n");
      out.write("        <h2>E-Voting</h2>\n");
      out.write("        <div class=\"destination-grid\">\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("              <img src=\"images/A11.png\" alt=\"\" />\n");
      out.write("              <h3>\"Voting Shapes the Future of Our Country.\"</h3>\n");
      out.write("              \n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/A3.png\" alt=\"\" />\n");
      out.write("            <h3> \"Every Single Vote is significant.\"</h3>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("              <img src=\"images/1234.jpg\" alt=\"\" />\n");
      out.write("            <h3> \"voting is an investment in the future.\"</h3>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <footer>\n");
      out.write("        \n");
      out.write("          <marquee> <p>Developed By:- Manasi patil & Priyanka patil</p></marquee>\n");
      out.write("      </footer>\n");
      out.write("    </main>\n");
      out.write("  </body>\n");
      out.write("  <script\n");
      out.write("    src=\"https://kit.fontawesome.com/6558443b63.js\"\n");
      out.write("    crossorigin=\"anonymous\"\n");
      out.write("  ></script>\n");
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

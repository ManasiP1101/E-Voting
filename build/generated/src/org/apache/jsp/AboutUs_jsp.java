package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("               <li><a href=\"MainHomePage.jsp\">Home</a></li><br><br>\n");
      out.write("              <li><a href=\"AdminLogin.jsp\">Admin</a></li><br><br>\n");
      out.write("              <li><a href=\"VoterLogin.jsp\">Voter</a></li><br><br>\n");
      out.write("              <li><a href=\"AboutUs.jsp\">AboutUs</a></li><br><br>\n");
      out.write("              <li><a href=\"Contactus.jsp\">ContactUs</a></li><br><br>\n");
      out.write("              <li><a href=\"Feedback.jsp\">Feedback</a></li><br><br>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/pm35.jpg\" alt=\"Hero image\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero-content\">\n");
      out.write("            <br> <h1>\"Welcome  To Electronic Voting\"</h1></br>\n");
      out.write("          <p> E-Voting You Should Set an example by Voting.</p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      <!-- Destinations -->\n");
      out.write("     \n");
      out.write("\n");
      out.write("      <section id=\"about\" class=\"about\">\n");
      out.write("          <h3>AboutUs</h3><br>\n");
      out.write("        <p>\n");
      out.write("         The Indian electronic voting machine (EVM) were developed in 1989 by Election Commission of India in collaboration with Bharat Electronics \n");
      out.write("         Limited and Electronics Corporation of India Limited. The Industrial designers of the EVMs were faculty members at the Industrial Design Centre,\n");
      out.write("         IIT Bombay. The EVMs were first used in 1982 in the by-election to North Paravur Assembly Constituency in Kerala for a limited number of polling stations.\n");
      out.write("         The EVMs were first time used on an experimental basis in selected constituencies of Rajasthan, Madhya Pradesh and Delhi. The EVMs were used first \n");
      out.write("         time in the general election (entire state) to the assembly of Goa in 1999. In 2003, all by-elections and state elections were held using EVMs, \n");
      out.write("         encouraged by this election commission decided to use only EVMs for Lok Sabha elections in 2004.\n");
      out.write("        </p>\n");
      out.write("        <div class=\"team-members\">\n");
      out.write("          \n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img src=\"images/pp10.jpg\" alt=\"\"  width=\"1000\"/>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      \n");
      out.write("      <footer>\n");
      out.write("        \n");
      out.write("          <marquee>  <p>Developed By:- Manasi patil & Priyanka patil</p></marquee>\n");
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

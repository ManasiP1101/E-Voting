package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("              <li><a href=\"MainHomePage.jsp\">Home</a></li><br><br>\n");
      out.write("              <li><a href=\"AdminLogin.jsp\">Admin</a></li><br><br>\n");
      out.write("              <li><a href=\"VoterLogin.jsp\">Voter</a></li><br><br>\n");
      out.write("              <li><a href=\"AboutUs.jsp\">AboutUs</a></li><br><br>\n");
      out.write("              <li><a href=\"Contactus.jsp\">ContactUs</a></li><br><br>\n");
      out.write("              <li><a href=\"Feedback.jsp\">Feedback</a></li><br><br>\n");
      out.write("           \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/pp10.jpg\" alt=\"Hero image\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero-content\">\n");
      out.write("            <br> <h1>\"Welcome  To Electronic Voting\"</h1></br>\n");
      out.write("          <p> E-Voting You Should Set an example by Voting.</p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"contact\" class=\"contact\">\n");
      out.write("        <h3>Contact Us</h3>\n");
      out.write("        <div class=\"contact-info\">\n");
      out.write("          \n");
      out.write("          <ul>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-map-marker-alt\"></i>Karad-South,Maharashtra-415111\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-envelope\"></i\n");
      out.write("              ><a href=\"mailto:info@travelcompany.com\"\n");
      out.write("                >mansipatil1101@gmail.com</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-phone-alt\"></i\n");
      out.write("              ><a href=\"tel:555-123-4567\">7385471101</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("           <ul>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-map-marker-alt\"></i>Karad-South,Maharashtra-415111\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-envelope\"></i\n");
      out.write("              ><a href=\"mailto:info@travelcompany.com\"\n");
      out.write("                >pp7730292@gmail.com</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-phone-alt\"></i\n");
      out.write("              ><a href=\"tel:555-123-4567\">8010087291</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </section>\n");
      out.write("      <footer>\n");
      out.write("        <div class=\"social-icons\">\n");
      out.write("          <a href=\"https://www.facebook.com/\" target=\"_blank\"\n");
      out.write("            ><i class=\"fab fa-facebook\"></i\n");
      out.write("          ></a>\n");
      out.write("          <a href=\"https://www.twitter.com/\" target=\"_blank\"\n");
      out.write("            ><i class=\"fab fa-twitter\"></i\n");
      out.write("          ></a>\n");
      out.write("          <a href=\"https://www.instagram.com/\" target=\"_blank\"\n");
      out.write("            ><i class=\"fab fa-instagram\"></i\n");
      out.write("          ></a>\n");
      out.write("        </div>\n");
      out.write("          <marquee> <p>Developed By:- Manasi patil & Priyanka patil</p></marquee>\n");
      out.write("      </footer>\n");
      out.write("    </main>\n");
      out.write("  </body>\n");
      out.write(" \n");
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

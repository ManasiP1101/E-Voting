package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VoterHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <li><a href=\"VoterHome.jsp\">Home</a></li><br><br>\n");
      out.write("              <li><a href=\"VoterInfo.jsp\">VoterInfo</a></li><br><br>\n");
      out.write("              <li><a href=\"VOTING.jsp\">Voting</a></li><br><br>\n");
      out.write("              <li><a href=\"VoteHere.jsp\">VoteHere</a></li><br><br>\n");
      out.write("              <li><a href=\"MainHomePage.jsp\">Logout</a></li><br><br>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/pm32.jpg\" alt=\"Hero image\" />\n");
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
      out.write("            <img src=\"images/sp.jpg\" alt=\"\" />\n");
      out.write("            <h3> \"Every Single Vote is significant.\"</h3>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("              <img src=\"images/vote3.jpg\" alt=\"\" />\n");
      out.write("            <h3> \"voting is an investment in the future.\"</h3>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      <section id=\"hotels\" class=\"destinations\">\n");
      out.write("        <h2> Future of our Nation </h2>\n");
      out.write("        <div class=\"destination-grid\">\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/A10.png\"alt=\"\" />\n");
      out.write("            <h3> \"voting is an exercise in self-respect.\"</h3>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/on1.jpg\" alt=\"\" />\n");
      out.write("            <h3>\"voting is a responsibility as a citizen.\"</h3>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/A4.png\" alt=\"\" />\n");
      out.write("            <h3>\"voting is a symbol of freedom.\"</h3>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      <section id=\"activites\" class=\"destinations\">\n");
      out.write("          <br>\n");
      out.write("        <div class=\"destination-grid\">\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/A9.png\" alt=\"\" />\n");
      out.write("            <h3>\"\"Vote for a better tomorrow.\"</h3>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/sp1.png\" alt=\"\" />\n");
      out.write("            <h3>\"Your Vote,Your Choice\"</h3>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"destination-item\">\n");
      out.write("            <img src=\"images/vote2.jpeg\" alt=\"\" />\n");
      out.write("            <h3>\"Be the change,Vote for change.\"</h3>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("      <section id=\"about\" class=\"about\">\n");
      out.write("        <h3>About Our E-Voting</h3>\n");
      out.write("        <p>\n");
      out.write("          An E-voting is a platform that allows organizational members to cast their votes electronically, which can be through a website, mobile app,\n");
      out.write("        or any internet-connected device.\n");
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
      out.write("      <section id=\"contact\" class=\"contact\">\n");
      out.write("        <h3>Contact Us</h3>\n");
      out.write("        <div class=\"contact-info\">\n");
      out.write("          <p>\n");
      out.write("          <h2> If you have any queries or feedback regrading the e-voting Website you may mail or contact us  </h2>\n");
      out.write("          </p>\n");
      out.write("          <ul>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-map-marker-alt\"></i>karad,Maharastra-415111\n");
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
      out.write("           <ul>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fas fa-map-marker-alt\"></i>karad,Maharastra-415111\n");
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
      out.write("        </div>\n");
      out.write("        <form action=\"#\" class=\"form\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input\n");
      out.write("              type=\"name\"\n");
      out.write("              name=\"name\"\n");
      out.write("              id=\"name\"\n");
      out.write("              placeholder=\"Enter Your Name\"\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input\n");
      out.write("              type=\"email\"\n");
      out.write("              name=\"email\"\n");
      out.write("              id=\"email\"\n");
      out.write("              placeholder=\"Enter Your Email\"\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <textarea\n");
      out.write("              name=\"textarea\"\n");
      out.write("              id=\"textarea\"\n");
      out.write("              cols=\"30\"\n");
      out.write("              rows=\"10\"\n");
      out.write("              placeholder=\"Message\"\n");
      out.write("            ></textarea>\n");
      out.write("          </div>\n");
      out.write("          <button type=\"submit\">Send Message</button>\n");
      out.write("        </form>\n");
      out.write("      </section>\n");
      out.write("      <footer>\n");
      out.write("        \n");
      out.write("         <marquee><p>Developed By:- Manasi patil & Priyanka patil</p></marquee> \n");
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

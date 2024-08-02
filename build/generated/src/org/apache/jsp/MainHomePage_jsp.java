package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        .dropdown{\n");
      out.write("            display:inline-block;\n");
      out.write("        }\n");
      out.write("        .dropdown-content{\n");
      out.write("            display: none;\n");
      out.write("            position:absolute;\n");
      out.write("            background-color: white;\n");
      out.write("            min-width: 160px;\n");
      out.write("            z-index: 1;\n");
      out.write("            font-weight: normal; \n");
      out.write("        }\n");
      out.write("        .dropdown-content a{\n");
      out.write("            color:black;\n");
      out.write("            padding:12px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: block;\n");
      out.write("            text-align: left;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .dropdown-content a:hover{\n");
      out.write("            font-weight: bold\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .dropdwon:hover.dropdown-content{\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("    </style>\n");
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
      out.write("             \n");
      out.write("                  <a href=\"report.jsp\" >Report</a>\n");
      out.write("                  \n");
      out.write("                      <a href=\"registrationreport.jsp\">registration</a>\n");
      out.write("                      <a href=\"candidateinforeport.jsp\">candidateinfo</a>\n");
      out.write("                      <a href=\"Confirmsignreport.jsp\">confirm candidate sign</a>\n");
      out.write("                      <a href=\"feedbackreport.jsp\">feedback</a>\n");
      out.write("                      \n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("              <li><a href=\"MainHomePage.jsp\"></a></li>\n");
      out.write("                  \n");
      out.write("              </li>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/vote1.jpg\" alt=\"Hero image\" />\n");
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
      out.write("          <h3>About Our E-Voting</h3><br>\n");
      out.write("        <p>\n");
      out.write("          An E-voting is a platform that allows organizational members to cast their votes electronically, which can be through a website, mobile app,\n");
      out.write("        or any internet-connected device.\n");
      out.write("        </p>\n");
      out.write("        <div class=\"team-members\">\n");
      out.write("          \n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img src=\"images/pp10.jpg\" width=\"1000px\"/>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("     \n");
      out.write("      <footer>\n");
      out.write("        \n");
      out.write("          <marquee><p>Developed By:- Manasi patil & Priyanka patil</p></marquee> \n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class VoterLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connection.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_voting","root","root");
          
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>E-Voting</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("       ");

    String unm=null;
    String pass=null;
    unm=request.getParameter("txtvnm");
    pass=request.getParameter("txtpass");
    
      out.write("\n");
      out.write("    <header>\n");
      out.write("      <header>\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a><img src=\"images/logo1.png\" alt=\"logo\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"nav-menu\">\n");
      out.write("          <ul>\n");
      out.write("              <li><a href=\"MainHomePage.jsp\">Home</a></li><br><br>\n");
      out.write("              <li><a href=\"VoterLogin.jsp\">Login</a></li><br><br>\n");
      out.write("              <li><a href=\"MainHomePage.jsp\">Logout</a></li><br><br>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/v3.webp\" alt=\"Hero image\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero-content\">\n");
      out.write("            <br> <h1>\"Welcome  To Electronic Voting\"</h1></br>\n");
      out.write("          <p> E-Voting You Should Set an example by Voting.</p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      <!-- Destinations -->\n");
      out.write("      <style>\n");
      out.write("          table,th,td{\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          table.center{\n");
      out.write("              margin-left: auto;\n");
      out.write("              margin-right: auto;\n");
      out.write("          }\n");
      out.write("          h1{\n");
      out.write("              text-align: center;\n");
      out.write("          }\n");
      out.write("      </style>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("     \n");
      out.write("      <form>\n");
      out.write("          \n");
      out.write("                   <table class=\"center\"  border=\"2\" Width=\"400px\" style=\"background-color:whitesmoke\">\n");
      out.write("                      <thead>\n");
      out.write("                           <tr>\n");
      out.write("                              <th height=\"50px\" colspan=\"2\"> VOTER LOGIN</th>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          <tr>\n");
      out.write("                              <td Width=\"100px\"  align=\"center\"> Voter Name</td>\n");
      out.write("                              <td  Width=\"100px\"  align=\"center\"><input type=\"text\" name=\"txtvnm\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                         \n");
      out.write("                          <tr>\n");
      out.write("                             <td Width=\"100px\" align=\"center\"> Password</td>\n");
      out.write("                              <td Width=\"100px\" align=\"center\"><input type=\"password\" name=\"txtpass\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\"><input type=\"submit\" value=\"Login\" name=\"Login\" /> </td>         \n");
      out.write("                              <td align=\"center\"><input type=\"reset\" value=\"Reset\" name=\"Reset\" /></td>\n");
      out.write("                                         \n");
      out.write("                           </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                          </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                  </table> \n");
      out.write("          ");

    Statement st= con.createStatement();
    
    if(unm!=null && unm!= "" && pass!=null && pass!="")
    {
    String str="select * from  registration where Username='"+unm+"' and Password='"+pass+"'";
    ResultSet rs=st.executeQuery(str);
    if(rs.next())
    {
         out.println("<script>alert('login success....')</script>");
         session.setAttribute("nm", unm);
         response.sendRedirect("VoterHome.jsp");
    }
    else
    {
         out.println("<script>alert('login failed....')</script>");
         response.sendRedirect("VoterRegistration.jsp");
    }
    }
                 
      out.write("\n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("   <section id=\"activites\" class=\"destinations\">\n");
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

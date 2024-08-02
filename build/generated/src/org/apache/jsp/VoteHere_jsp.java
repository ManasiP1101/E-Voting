package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class VoteHere_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/style1.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("   ");

   String vnm=null;
  vnm=(String)session.getAttribute("nm");
  


      out.write("\n");
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
      out.write("            <img src=\"images/123456789.jpg\" alt=\"Hero image\" />\n");
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
      out.write("         input{\n");
      out.write("             margin: 7px;\n");
      out.write("             padding: 2px;\n");
      out.write("             width: 200px;\n");
      out.write("          }\n");
      out.write("      </style>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("     \n");
      out.write("      <form method=\"post\" name=\"form\" >\n");
      out.write("          \n");
      out.write("                   <table class=\"center\"  border=\"2\" Width=\"500px\" style=\"background-color:whitesmoke\">\n");
      out.write("                      <thead>\n");
      out.write("                           <tr >\n");
      out.write("                              <th  height=\"50px\"  colspan=\"2\"> Vote Here</th>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                      </thead>\n");
      out.write("                     <tbody>\n");
      out.write("                          \n");
      out.write("                          <tr>\n");
      out.write("              \n");
      out.write("                       <tr><td>Candidate_name</td><td>mobile_no</td><td>ward_no</td><td>Party_name</td><td>Party_sign</td></tr>\n");
      out.write("                ");

                 
               String cnm=null;
               String mob1=null;
               int wr1=0;
               String pn=null;
               String img1=null;
               String img2=null;
                Statement st=con.createStatement();
                String str= "select * from confirm_candidate_sign";
                ResultSet rs=st.executeQuery(str);
                
                while(rs.next())
                {
                 cnm=rs.getString(1);
                 mob1=rs.getString(2);
                 wr1=rs.getInt(3);
                 pn=rs.getString(4);
                 img1="images/"+rs.getString(5);
              img2="images/"+img1;
                
      out.write("\n");
      out.write("                <tr><td>");
      out.print(cnm);
      out.write("</td><td>");
      out.print(mob1);
      out.write("</td><td>");
      out.print(wr1);
      out.write("</td><td>");
      out.print(pn);
      out.write("</td><td><img src=\"");
      out.print(img1);
      out.write("\" width=\"100\" height=\"100\"/>\n");
      out.write("                    </td><td><input type=\"submit\" value=\"Vote\" name=\"Vote\" style=\"background-color:greenyellow\" /></td></tr>\n");
      out.write("              \n");
      out.write("               ");

                }
               Statement st1=con.createStatement();
               String str6="select * from registration where Registrator_name='"+vnm+"'";
               ResultSet rs1=st1.executeQuery(str6);
               while(rs1.next())
               {
                   vnm=rs1.getString(1);
               }
               
      out.write("\n");
      out.write("               </tbody>\n");
      out.write("                  </table> \n");
      out.write("                 ");

                            Statement st2=con.createStatement();
                if(cnm!=null && cnm!=""  && pn!=null && pn!="" && img1!=null  && img1!="")
                
                           {   
                               
            String str7="insert into vote_here(Voter_name,Constituacy,Candidate_name,Party_sign,Party_name,mobile_no) values('"+vnm+"','"+wr1+"','"+cnm+"','"+img1+"','"+pn+"','"+mob1+"')";
                            
                            int s=st2.executeUpdate(str7);
                           }
                          // out.println("<script>alert('you are voting  successful....')</script>");
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                </from>\n");
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

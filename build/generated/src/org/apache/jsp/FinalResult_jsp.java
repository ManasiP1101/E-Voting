package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public final class FinalResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("      ");

      
      String cnm=null;
       String mob=null;
       
         String prtnm=null;
      
      
      
      
      out.write("\n");
      out.write("    <header>\n");
      out.write("      <header>\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a><img src=\"images/logo1.png\" alt=\"logo\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"nav-menu\">\n");
      out.write("          <ul>\n");
      out.write("              <li><a href=\"AdHomepage.jsp\">Home</a></li><br><br>\n");
      out.write("              <li><a href=\"CandidateInfo.jsp\">CandidateInfo</a></li><br><br>\n");
      out.write("              <li><a href=\"ApplyForElection.jsp\">ApplyElection</a></li><br><br>\n");
      out.write("              <li><a href=\"CandidateSign.jsp\">CandidateSign</a></li><br><br>\n");
      out.write("          \n");
      out.write("           \n");
      out.write("              \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/re2.png\" alt=\"Hero image\" />\n");
      out.write("        </div>\n");
      out.write("       \n");
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
      out.write("                   <form>\n");
      out.write("                   <table class=\"center\"  border=\"2\" Width=\"500px\" style=\"background-color:whitesmoke\">\n");
      out.write("                     \n");
      out.write("                      <tbody>\n");
      out.write("                             <tr>\n");
      out.write("                              <td align=\"center\">ward_no</td>\n");
      out.write("                              <td align=\"center\"> <select name=\"drpwr\">\n");
      out.write("                                     \n");
      out.write("                                      <option>1</option>\n");
      out.write("                                      <option>2</option>\n");
      out.write("                                      <option>3</option>\n");
      out.write("                                      <option>4</option>\n");
      out.write("                                  </select></td>\n");
      out.write("                                    \n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                           <tr>\n");
      out.write("                              <td align=\"center\"> Select Party </td>\n");
      out.write("                              <td align=\"center\"> <select name=\"drpparty\">\n");
      out.write("                                    \n");
      out.write("                                      <option> BJP</option>\n");
      out.write("                                      <option>NCP</option>\n");
      out.write("                                      <option>CP</option>\n");
      out.write("                                      <option>MNS</option>\n");
      out.write("                                     \n");
      out.write("                                  </select></td>\n");
      out.write("                          </tr>\n");
      out.write("                            ");

                  int i=0;
                  String party[]={"BGP","NCP","CP","MNS"};
                  int votes[]=new int[4];
                  String str1=null;
                  ResultSet rs1=null;
                  String img=null;
                  String wrno=request.getParameter("drpwr");
                 String partynm=request.getParameter("drpparty");
                    Statement st=con.createStatement();
                    if(wrno!=null && wrno!="")
                    {
                        // out.println("ssss="+wrno);
                       String str="Select count(*)from vote_here Where Constituacy="+wrno+" and Party_name='"+partynm+"'";
                           rs1=st.executeQuery(str);
                       ResultSet rs=st.executeQuery(str);
                       if (rs.next())
                       {
                           i=rs.getInt(1);  
                       }
                    }
                       Statement st1=con.createStatement();
                       for(int c=0;c<4;c++)
                       {
                          // str1="select count(*)from vote_here Where Constituacy='"+wrno+"' and Party_name='"+partynm+"' ";
                           str1="select count(*)from vote_here Where Constituacy='"+wrno+"'";
                           rs1=st1.executeQuery(str1);
                           
                           if (rs1.next())
                           {
                               votes[c]=rs1.getInt(1);
                               // out.println("ddd="+votes[c]);
                               
                           }
                          
                           }
                       
                  
              
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("               <tr>\n");
      out.write("                  <td><input type=\"Submit\" value=\"Search\" name=\"Search\"/></td>\n");
      out.write("              </tr><tr style=\"height: 100px; color: #ffcccc\"><td><h4>Election Results</h4></td></tr>\n");
      out.write("<!--                <tr> <td><h6>BJP</h6></td>  <td><h6>");
      out.print(votes[0]);
      out.write("</h6></td>\n");
      out.write("                    <tr> <td><h6>NCP</h6></td>  <td><h6>");
      out.print(votes[1]);
      out.write("</h6></td>\n");
      out.write("                        <tr> <td><h6>CP</h6></td>  <td><h6>");
      out.print(votes[2]);
      out.write("</h6></td>\n");
      out.write("                            <tr> <td><h6>MNS</h6></td>  <td><h6>");
      out.print(votes[3]);
      out.write("</h6></td>-->\n");
      out.write("                            <tr><td><h6>Total votes</h6></td> <td><h6>");
      out.print(i);
      out.write("</h6></td>\n");
      out.write("                            </tr>\n");
      out.write("      \n");
      out.write("                      </tbody> \n");
      out.write("                   </table>     \n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("              </form>\n");
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
      out.write("\n");
      out.write("     \n");
      out.write("      <footer>\n");
      out.write("        \n");
      out.write("        <marquee><p>Developed By:- Manasi patil & Priyanka patil</p></marquee> \n");
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

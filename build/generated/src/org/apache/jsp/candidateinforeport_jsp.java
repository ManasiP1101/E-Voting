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

public final class candidateinforeport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("    <header>\n");
      out.write("      <header>\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a><img src=\"images/logo1.png\" alt=\"logo\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"nav-menu\">\n");
      out.write("          <ul>\n");
      out.write("              <li><a href=\"AdHomepage.jsp\">Home</a></li><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("              <li><a href=\"candidateinforeport.jsp\">CandidateInfo report</a></li><br><br>\n");
      out.write("              \n");
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
      out.write("            <img src=\"images/vote1.jpg\" alt=\"Hero image\" />\n");
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
      out.write("      <from>\n");
      out.write("     \n");
      out.write("                           \n");
      out.write("                         <table class=\"center\" border=\"4\" width=\"100px\" style=\"background-color:whitesmoke\">\n");
      out.write("                           \n");
      out.write("                            <tbody>\n");
      out.write("                                 \n");
      out.write("                       <tr>\n");
      out.write("                                    <th height=\"50px\" colspan=\"2\">  Candidateinfo report</th>\n");
      out.write("                          </tr> \n");
      out.write("                                \n");
      out.write("                                 <tr td width=\"100px\" align=\"centre\">\n");
      out.write("                                     <td align=\"center\">Candidate_name</td>\n");
      out.write("                                     <td align=\"center\">Address</td>\n");
      out.write("                                   <td align=\"center\">Email_id</td>\n");
      out.write("                                     <td align=\"center\">Voting_id</td>\n");
      out.write("                                     <td align=\"center\">Date_of_Birth</td>\n");
      out.write("                                     <td align=\"center\">Age</td>\n");
      out.write("                                     <td align=\"center\">Gender</td>\n");
      out.write("                                     <td align=\"center\">Marital_status</td>\n");
      out.write("                                     <td align=\"center\">cast</td>\n");
      out.write("                                     <td align=\"center\">Adhar_Card_no</td>\n");
      out.write("                                     <td align=\"center\">Pan_card_no</td>\n");
      out.write("                                     <td align=\"center\">Consituancy</td>\n");
      out.write("                                      <td align=\"center\">Id</td>\n");
      out.write("                                       <td align=\"center\">mobile_no</td>\n");
      out.write("                                 </tr>\n");
      out.write("                                   ");

    
         int id=0;
      
        String cnm=null;
        String add=null;
        String eid=null;
        String vid=null;
        String bdate=null;
        String age=null;
       String gender=null;
       String mstatus=null;
       String cst=null;
       String ano=null;
       String pno=null;
        String cons=null;
         String i=null;
          String mno=null;
         
    

     Statement st=con.createStatement();
  String str="select * from  candidate_info";
  
    ResultSet rs=st.executeQuery(str);
    
    while(rs.next())
{
    
    cnm=rs.getString(1);
    add=rs.getString(2);
    
   // sou=rs.getString(3);
    //Des=rs.getString(4);
    
    eid=rs.getString(3);
    vid=rs.getString(4);
   bdate=rs.getString(5);
    
    //=rs.getString(9);
     age=rs.getString(6);
     gender=rs.getString(7);
      mstatus=rs.getString(8);
       cst=rs.getString(9);
        ano=rs.getString(10);
         pno=rs.getString(11);
          cons=rs.getString(12);
           i=rs.getString(13);
            mno=rs.getString(14);
     
  

      out.write("         \n");
      out.write("                               \n");
      out.write("<tr>\n");
      out.write("    \n");
      out.write("   <td>");
      out.print(cnm);
      out.write("</td>\n");
      out.write("   <td>");
      out.print(add);
      out.write("</td>\n");
      out.write("   <td>");
      out.print(eid);
      out.write("</td>\n");
      out.write("   \n");
      out.write("   <td>");
      out.print(vid);
      out.write("</td>  \n");
      out.write("        <td>");
      out.print(bdate);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(age);
      out.write("</td> \n");
      out.write("         <td>");
      out.print(gender);
      out.write("</td> \n");
      out.write("        \n");
      out.write("   <td>");
      out.print(mstatus);
      out.write("</td>\n");
      out.write("    <td>");
      out.print(cst);
      out.write("</td>\n");
      out.write("     <td>");
      out.print(ano);
      out.write("</td>\n");
      out.write("      <td>");
      out.print(pno);
      out.write("</td>\n");
      out.write("       <td>");
      out.print(cons);
      out.write("</td>\n");
      out.write("       <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(mno);
      out.write("</td>\n");
      out.write("         \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</tr>\n");

}
    
      out.write("\n");
      out.write("                            \n");
      out.write("                               </form>\n");
      out.write("                           <br>\n");
      out.write("                           \n");
      out.write("      \n");
      out.write("    </main>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("  <script\n");
      out.write("      \n");
      out.write("          \n");
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

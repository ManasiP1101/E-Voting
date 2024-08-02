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

public final class CandidateInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       ");

    int a=0;
   
   
    String cnm=null;
    String add=null;
    String eid=null;
    String mno=null;
    String vid=null;
    String bdate=null;
  
    String gender=null;
    String mstatus=null;
     String cst=null;
    String ano=null;
    String pno=null;
    String cons=null;
    
    
    
    cnm=request.getParameter("cnm");
    add=request.getParameter("add");
    eid=request.getParameter("eid");
    mno=request.getParameter("mno");
    vid=request.getParameter("vid");
    bdate=request.getParameter("bdate");
    gender=request.getParameter("drpgender");
    mstatus=request.getParameter("mstatus");
    cst=request.getParameter("cst");
    ano=request.getParameter("ano");
     pno= request.getParameter("pno");
     cons=request.getParameter("cons");
    
            
            
            
      out.write("\n");
      out.write("   \n");
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
      out.write("     \n");
      out.write("                   <form>\n");
      out.write("                   <table class=\"center\"  border=\"2\" Width=\"500px\" style=\"background-color:whitesmoke\">\n");
      out.write("                      <thead>\n");
      out.write("                           <tr>\n");
      out.write("                              <th height=\"50px\" colspan=\"2\"> Candidate Info</th>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                              ");

                           int i=0;
                            Statement st=con.createStatement();
                            String str="select count(*)from candidate_info";
                            ResultSet rs=st.executeQuery(str);
                            if(rs.next())
                            {
                                i=rs.getInt(1);
                                i++;
                                  
                             }
                            
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Id</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"textId\" name=\"txtid\" value=\"");
      out.print(i);
      out.write("\" /> </td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\"> Candidate Name</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"text\" name=\"cnm\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                           \n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Address</td>\n");
      out.write("                              <td Width=\"250px\" align=\"center\"><input type=\"text\" name=\"add\" value=\"\"  /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Email-id</td>\n");
      out.write("                              <td Width=\"250px\" align=\"center\"><input type=\"tel\" name=\"eid\" value=\"\"/></td>\n");
      out.write("                          </tr>\n");
      out.write("                                \n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">mobile no</td>\n");
      out.write("                              <td Width=\"250px\" align=\"center\"><input type=\"tel\" name=\"mno\" value=\"\"  /></td>\n");
      out.write("                          </tr>\n");
      out.write("                                \n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Voter id</td>\n");
      out.write("                              <td Width=\"250px\" align=\"center\"><input type=\"tel\" name=\"vid\" value=\"\"  /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                                     ");

                          long age=0;                             
         String dob=null;
          String dob2=null;
           dob=request.getParameter("bdate");
           dob2=dob;
           
          if(dob!=null && dob!="")
          {
                 LocalDate dob1=LocalDate.parse(dob2);
                 
                  
                  LocalDate currdt=LocalDate.now();
                  
                 age=ChronoUnit.YEARS.between(dob1,currdt);
                 
                   
                    
          }
                          
      out.write("\n");
      out.write("                          \n");
      out.write("                               <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Date Of Birth\n");
      out.write("                         \n");
      out.write("                                  <td   align=\"center\">  <input type=\"date\" name=\"bdate\" value=\"\" />\n");
      out.write("                             <input type=\"submit\" value=\"Agecalculate\" name=\"Agecalculate\" /></td>\n");
      out.write("                              </td>\n");
      out.write("                           </tr>\n");
      out.write("                           \n");
      out.write("                           <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Age</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"text\" name=\"age\" value=\"");
      out.print(age);
      out.write("\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Gender</td>\n");
      out.write("                              <td align=\"center\" width=\"250px\"><select name=\"drpgender\">\n");
      out.write("                                      <option>select</option>\n");
      out.write("                                      <option>Male</option>\n");
      out.write("                                      <option>Female</option>\n");
      out.write("                                  </select></td>\n");
      out.write("                              \n");
      out.write("                      \n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Marital Status</td>\n");
      out.write("                              <td align=\"center\"width=\"250px\">  <select name=\"mstatus\">\n");
      out.write("                                      <option>select</option>\n");
      out.write("                                      <option>yes</option>\n");
      out.write("                                      <option>no</option>\n");
      out.write("                                  </select></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Cast</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"text\" name=\"cst\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Adhar card no</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"tel\" name=\"ano\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Pan card no</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"text\" name=\"pno\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" width=\"250px\">Consituancy</td>\n");
      out.write("                              <td align=\"center\" width=\"250px\"><select name=\"cons\">\n");
      out.write("                                    \n");
      out.write("                                      <option>Grampanchyat</option>\n");
      out.write("                                     \n");
      out.write("                                  </select></td>\n");
      out.write("                            </tr>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                          \n");
      out.write("                                                    \n");
      out.write("\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\" colspan=\"2\"><input type=\"submit\" value=\"submit\" name=\"sumbit\" /></td>\n");
      out.write("                               <td align=\"center\" >  <a href=\"ApplyForElection.jsp\">Next</a></td>\n");
      out.write("                          </tr>\n");
      out.write("                         \n");
      out.write("                      </tbody>\n");
      out.write("                  </table> \n");
      out.write("                          \n");
      out.write("                                 ");

                                 //if(s.equals("no"))
                                     
                            Statement st1=con.createStatement();
                         
                       if(cnm!=null && cnm!="" && add!=null && add!="" && eid!=null && eid!=""   && vid!=null  && vid!="" && bdate!=null && bdate!="" && gender!=null && gender!="" && mstatus!=null && mstatus!="" && cst!=null && cst!=""&& ano!=null && ano!=""&& pno!=null && pno!="" && cons!=null && cons!="" &&  mno!=null && mno!="")
                           {   
                               
           String strl="insert into candidate_info(Candidate_name,Address,Email_id,Voting_id,Date_of_Birth, Age,Gender,Marital_status,cast,Adhar_Card_no,Pan_card_no,Consituancy,Id,mobile_no) values('"+cnm+"','"+add+"','"+eid+"','"+vid+"','"+bdate+"',"+age+",'"+gender+"','"+mstatus+"','"+cst+"',"+ano+",'"+pno+"','"+cons+"',"+i+",'"+mno+"')";
                            
                            int s=st1.executeUpdate(strl);
                            out.println("<script>alert('you are candidate_info success....')</script>");
                            
                               
                               
                            
                                }
                             
                               
                         
                            
      out.write(" \n");
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

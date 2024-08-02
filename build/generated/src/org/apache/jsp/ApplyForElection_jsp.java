package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ApplyForElection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");


   String mob=null;
    String sp=null;
    String wr=null;
    String nc=null;
    String fc=null;
    String pro=null;
    
    
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
      out.write("              <li><a href=\"ApplyForElection.jsp\">ApplyForElection</a></li><br><br>\n");
      out.write("              <li><a href=\"CandidateSign.jsp\">CandidateSign</a></li><br><br>\n");
      out.write("              <li><a href=\"ConfirmSign.jsp\">ConfirmSign</a></li><br><br>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"hero\">\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <img src=\"images/A5.jpg\" alt=\"Hero image\" />\n");
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
      out.write("                  <form>\n");
      out.write("                    <table class=\"center\"  border=\"2\" Width=\"500px\" style=\"background-color:whitesmoke\">\n");
      out.write("                      <thead>\n");
      out.write("                           <tr>\n");
      out.write("                              <th height=\"50px\" colspan=\"2\">Apply For Election</th>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          \n");
      out.write("                           <tr>\n");
      out.write("                              <td align=\"center\">Id</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\"><input type=\"text\" name=\"txtid\" value=\"\" /><input type=\"submit\" value=\"Find\" name=\"Find\" /> </td>\n");
      out.write("                                     \n");
      out.write("                          </tr>\n");
      out.write("                          ");
   
    
                 
                         
                          String cnm=null;
                             String id1=request.getParameter("txtid");
                           Statement st=con.createStatement();
                        
                           String str="select * from candidate_info where id="+id1+"";
                           
                          
                       
                       
                          ResultSet rs= st.executeQuery(str);
                          
                          if(rs.next())
                          {
                             cnm=rs.getString(1);
                             mob=rs.getString(14);
                             
                             
                          }
                  
                  
                          
      out.write("\n");
      out.write("                           <tr>\n");
      out.write("                              <td align=\"center\"> Candidate Name</td>\n");
      out.write("                              <td width=\"250px\" align=\"center\">");
      out.print(cnm);
      out.write("</td>\n");
      out.write("                           </tr>\n");
      out.write("                             <tr>\n");
      out.write("                              <td align=\"center\">mobile no</td>\n");
      out.write("                              <td Width=\"250px\" align=\"center\">");
      out.print(mob);
      out.write("</td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          <tr>\n");
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
      out.write("                           <tr>\n");
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
      out.write("                         \n");
      out.write("                                \n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\">No. of Children</td>\n");
      out.write("                              <td align=\"center\"> <select name=\"drpchidran\">\n");
      out.write("                                       \n");
      out.write("                                      <option>0</option>\n");
      out.write("                                      <option>1</option>\n");
      out.write("                                      <option>2</option>\n");
      out.write("                                      \n");
      out.write("                                  </select></td>\n");
      out.write("                                    \n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td align=\"center\">Property</td>\n");
      out.write("                              <td  align=\"center\" Width=\"250px\"><input type=\"text\" name=\"pro\" value=\"\" /></td>\n");
      out.write("                          </tr>\n");
      out.write("                                \n");
      out.write("                          <tr>\n");
      out.write("                                 <td align=\"center\">Any FIR Case</td>\n");
      out.write("                                 <td align=\"center\">  <select name=\"drpfir\">\n");
      out.write("                                        \n");
      out.write("                                         <option>Yes</option>\n");
      out.write("                                         <option>No</option>\n");
      out.write("                                     </select></td>\n");
      out.write("                          </tr>\n");
      out.write("                         \n");
      out.write("                          <tr>\n");
      out.write("                              <td colspan=\"2\" align=\"center\" ><input type=\"submit\" value=\"submit\" name=\"sumbit\" /></td>\n");
      out.write("                               <td align=\"center\" >  <a href=\"CandidateSign.jsp\">Next</a></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                          </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                  </table> \n");
      out.write("                           ");

                         // int i=Integer.valueOf(id1);
                           
                          
                           sp=request.getParameter("drpparty");
                             wr=request.getParameter("drpwr");
                             nc=request.getParameter("drpchidran");
                             fc=request.getParameter("drpfir");
                             pro=request.getParameter("pro");
    
    
                           Statement st1=con.createStatement();
                          
                          if(sp!=null && sp!="" && wr!=null && wr!="" &&  nc!=null && nc!="" && fc!=null && fc!="" && pro!=null && pro!="")
                           {
                              if(fc.equals("No"))
                               { 
                           String str2= "insert into apply_for_election(Candidate_name,mobile_no,Select_party,ward_no,No_of_childrens,Any_fir_case,id,property) values('"+cnm+"',"+mob+",'"+sp+"',"+wr+","+nc+",'"+fc+"',"+id1+","+pro+")";
                         
                           
                            int s=st1.executeUpdate(str2);
                            out.println("<script>alert('you are apply_for_election success....')</script>");
                               }
                               else
                               {
                                   out.println("<script>alert('You are not eligible for standing in Election')</script>");
                               }
                               }
                           
                           
      out.write("\n");
      out.write("                  \n");
      out.write("              </form>\n");
      out.write("                           <br>\n");
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

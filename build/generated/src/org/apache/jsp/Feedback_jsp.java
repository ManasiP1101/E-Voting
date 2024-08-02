package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html> \n");
      out.write("<html lang=\"en\"> \n");
      out.write("\n");
      out.write("<head> \n");
      out.write("\t<meta charset=\"UTF-8\"> \n");
      out.write("\t<meta name=\"viewport\"\n");
      out.write("\t\tcontent=\"width=device-width,initial-scale=1.0\"> \n");
      out.write("\t <link rel=\"stylesheet\" href= \n");
      out.write("\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"> \n");
      out.write("        \n");
      out.write("\t\n");
      out.write("</head> \n");
      out.write("<style>\n");
      out.write("    /*style.css */\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("body { \n");
      out.write("\tmargin: 0; \n");
      out.write("\tdisplay: flex; \n");
      out.write("\talign-items: center; \n");
      out.write("\tjustify-content: space-around; \n");
      out.write("\tflex-direction: column; \n");
      out.write("\theight: 90vh; \n");
      out.write("        background-color: #ccccff; \n");
      out.write("\tfont-family: 'Poppins', sans-serif; \n");
      out.write("\n");
      out.write("} \n");
      out.write("\n");
      out.write(".textup { \n");
      out.write("\ttext-align: center; \n");
      out.write("\tcolor: rgb(11, 118, 11); \n");
      out.write("\tfont-weight: 700; \n");
      out.write("} \n");
      out.write("\n");
      out.write("i { \n");
      out.write("\tmargin-right: 3px; \n");
      out.write("} \n");
      out.write("\n");
      out.write(".form-box { \n");
      out.write("\tbackground-color: #fff; \n");
      out.write("\tbox-shadow: 0 0 10px rgba(36, 67, 40, 0.8); \n");
      out.write("\tpadding: 20px; \n");
      out.write("\tborder-radius: 8px; \n");
      out.write("\twidth: 500px; \n");
      out.write("} \n");
      out.write("\n");
      out.write("form { \n");
      out.write("\tmax-width: 400px; \n");
      out.write("\tmargin: 0 auto; \n");
      out.write("} \n");
      out.write("\n");
      out.write(".radio-group { \n");
      out.write("\tdisplay: flex; \n");
      out.write("\tmargin-bottom: 16px; \n");
      out.write("} \n");
      out.write("\n");
      out.write("input[type=\"radio\"] { \n");
      out.write("\tmargin-right: 8px; \n");
      out.write("} \n");
      out.write("\n");
      out.write("label { \n");
      out.write("\tdisplay: block; \n");
      out.write("\tmargin-bottom: 8px; \n");
      out.write("\tfont-size: 17px; \n");
      out.write("\tcolor: green; \n");
      out.write("\tfont-weight: 600; \n");
      out.write("} \n");
      out.write("\n");
      out.write("\n");
      out.write("input, \n");
      out.write("textarea { \n");
      out.write("\twidth: 100%; \n");
      out.write("\tpadding: 8px; \n");
      out.write("\tmargin-bottom: 12px; \n");
      out.write("\tbox-sizing: border-box; \n");
      out.write("\tborder-radius: 10px; \n");
      out.write("\n");
      out.write("} \n");
      out.write("\n");
      out.write("button { \n");
      out.write("\tbackground-color: #368b44; \n");
      out.write("\tcolor: #fff; \n");
      out.write("\tpadding: 10px; \n");
      out.write("\tborder: none; \n");
      out.write("\tborder-radius: 25px; \n");
      out.write("\tcursor: pointer; \n");
      out.write("\twidth: 100%; \n");
      out.write("\tfont-size: 15px; \n");
      out.write("\ttransition: .8s linear; \n");
      out.write("} \n");
      out.write("\n");
      out.write("button:hover { \n");
      out.write("\tbackground-color: #0a6808; \n");
      out.write("\tborder: none; \n");
      out.write("\transform: translateY(-10px); \n");
      out.write("} \n");
      out.write("\n");
      out.write("h1 { \n");
      out.write("\tcolor: green; \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body> \n");
      out.write("      \n");
      out.write("      ");

      
    
       
     String nm=null;
     String emid=null;
    String yc=null;
   // String c=null;
    String mob=null;
    // nm=request.getParameter("txtanm"); 
     
   //  emid=request.getParameter("txtemail");     
    // yc=request.getParameter("dryc");
     
     
 

      out.write("\n");
      out.write("\t<h1>Feedback</h1> \n");
      out.write("\t\n");
      out.write("\t<div class=\"form-box\"> \n");
      out.write("\t\t<div class=\"textup\"> \n");
      out.write("\t\t\t<i class=\"fa fa-solid fa-clock\"></i> \n");
      out.write("\t\t\tIt only takes two minutes!! \n");
      out.write("\t\t</div> \n");
      out.write("\t\t<form> \n");
      out.write("               \n");
      out.write("\t\t\t<label for=\"uname\"> \n");
      out.write("\t\t\t\t<i class=\"fa fa-solid fa-user\"></i> \n");
      out.write("\t\t\t\tName \n");
      out.write("\t\t\t</label> \n");
      out.write("\t\t\t<input type=\"text\" id=\"uname\"\n");
      out.write("\t\t\t\tname=\"txtanm\" required> \n");
      out.write("\n");
      out.write("\t\t\t<label for=\"email\"> \n");
      out.write("\t\t\t\t<i class=\"fa fa-solid fa-envelope\"></i> \n");
      out.write("\t\t\t\tEmail Address \n");
      out.write("\t\t\t</label> \n");
      out.write("\t\t\t<input type=\"email\" id=\"email\"\n");
      out.write("\t\t\t\tname=\"txtemail\" required> \n");
      out.write("\n");
      out.write("\t\t\t<label for=\"phone\"> \n");
      out.write("\t\t\t\t<i class=\"fa-solid fa-phone\"></i> \n");
      out.write("\t\t\t\tPhone No \n");
      out.write("\t\t\t</label> \n");
      out.write("\t\t\t<input type=\"tel\" id=\"phone\"\n");
      out.write("\t\t\t\tname=\"txtephone\" required> \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<label for=\"msg\"> \n");
      out.write("\t\t\t\t<i class=\"fa-solid fa-comments\"\n");
      out.write("\t\t\t\tstyle=\"margin-right: 3px;\"></i> \n");
      out.write("\t\t\t\tWrite your Suggestions: \n");
      out.write("\t\t\t</label> \n");
      out.write("\t\t\t<textarea id=\"msg\" name=\"dryc\"\n");
      out.write("\t\t\t\t\trows=\"4\" cols=\"10\" required> \n");
      out.write("\t\t\t</textarea> \n");
      out.write("\t\t\t\n");
      out.write("                        <button type=\"submit\"> Submit</button>\n");
      out.write("            \n");
      out.write("                       \n");
      out.write("                        ");

     nm=request.getParameter("txtanm"); 
     emid=request.getParameter("txtemail");
     mob=request.getParameter("txtephone");
     yc=request.getParameter("dryc");   
                                     Statement st1=con.createStatement();
                                    
                                     if(nm!=null && nm!="" && emid!=null && emid!="" && mob!=null && mob!="" && yc!="" && yc!=null)
                                     {
                                         String strl="insert into feedback(name,email,Mob,you_com)values('"+nm+"','"+emid+"',"+mob+",'"+yc+"')";
                                         
                                         int b=st1.executeUpdate(strl);
                                         out.println("<script>alert(' information added Success....')</script>");
                                       
                                         
                                     }
                            
                                     
      out.write("\n");
      out.write("                \n");
      out.write("\t\t</form> \n");
      out.write("\t</div> \n");
      out.write("</body> \n");
      out.write("\n");
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

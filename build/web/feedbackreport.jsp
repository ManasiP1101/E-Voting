<%-- 
    Document   : AdHomepage
    Created on : 21 Feb, 2024, 12:12:24 PM
    Author     : user
--%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.temporal.ChronoUnit"%>
<%@include file="connection.jsp" %>
<%@page import="java.util.Date" %>
<%@page import ="java.text.SimpleDateFormat" %>
<%@page import ="java.util.Calendar" %>
<%@page import ="java.text.DateFormat" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Voting</title>
    <link rel="stylesheet" href="css/style1.css" />
  </head>
  <body>
       
    <header>
      <header>
        <div class="logo">
            <a><img src="images/logo1.png" alt="logo" /></a>
        </div>
        <nav class="nav-menu">
          <ul>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="AdHomepage.jsp">Home</a></li><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="feedbackreport.jsp">feedback</a></li><br><br>
              
          
           
              
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/vote1.jpg" alt="Hero image" />
        </div>
        <div class="hero-content">
            <br> <h1>"Welcome  To Electronic Voting"</h1></br>
          <p> E-Voting You Should Set an example by Voting.</p>
         
        </div>
      </section>
      <!-- Destinations -->
      <style>
          table,th,td{
              
          }
          table.center{
              margin-left: auto;
              margin-right: auto;
          }
          h1{
              text-align: center;
          }
         input{
             margin: 7px;
             padding: 2px;
             width: 200px;
          }
      </style>
      <br>
      <br>
      <from>
     
                           
                         <table class="center" border="4" width="100px" style="background-color:whitesmoke">
                           
                            <tbody>
                                  <tr>
                                    <th height="50px" colspan="2">  Feedback report</th>
                          </tr> 
                      
                                
                                 <tr td width="100px" align="centre">
                                     <td align="center">name</td>
                                     <td align="center">email</td>
                                   <td align="center">Mob</td>
                                     <td align="center">you_com</td>
                                     
                                     
                                 </tr>
                                   <%
    
        
      
        String nm=null;
        
        String email=null;
        String mob=null;
        String yc=null;
      
    

     Statement st=con.createStatement();
     
  String str="select * from  feedback";
  
    ResultSet rs=st.executeQuery(str);
    
    
    while(rs.next())
{
    
    nm=rs.getString(1);
    
    
   // sou=rs.getString(3);
    //Des=rs.getString(4);
    
    email=rs.getString(2);
    mob=rs.getString(3);
 
      yc=rs.getString(4);
    //=rs.getString(9);
    
%>         
                               
<tr>
    
   <td><%=nm%></td>
   
   <td><%=email%></td>
   
   <td><%=mob%></td>  
        <td><%=yc%></td>
        
    
    
</tr>
<%
}
    %>
                          
                               </form>
                           <br>
   
    </main>
  </body>
  <script
    src="https://kit.fontawesome.com/6558443b63.js"
    crossorigin="anonymous"
  ></script>
</html>

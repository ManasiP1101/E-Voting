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
              <li><a href="AdHomepage.jsp">Home</a></li><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="registrationreport.jsp">registration report</a></li><br><br>
              
          
           
              
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
                                    <th height="50px" colspan="2">  Registration report</th>
                          </tr> 
                      
                                
                                 <tr td width="100px" align="centre">
                                     <td align="center">Registrator_name</td>
                                     <td align="center">Address</td>
                                   <td align="center">Email_id</td>
                                     <td align="center">mobile_no</td>
                                     <td align="center">age</td>
                                     <td align="center">Username</td>
                                     <td align="center">Password</td>
                                     <td align="center">id</td>
                                     
                                     
                                 </tr>
                                   <%
    
         int id=0;
      
        String nm=null;
        String add=null;
        String email=null;
        String mob=null;
        String age=null;
        String unm=null;
       String pass=null;
         
    

     Statement st=con.createStatement();
  String str="select * from  registration";
  
    ResultSet rs=st.executeQuery(str);
    
    while(rs.next())
{
    
    nm=rs.getString(1);
    add=rs.getString(2);
    
   // sou=rs.getString(3);
    //Des=rs.getString(4);
    
    email=rs.getString(3);
    mob=rs.getString(4);
   age=rs.getString(5);
    
    //=rs.getString(9);
     unm=rs.getString(6);
     pass=rs.getString(7);
   id=rs.getInt(8);
%>         
                               
<tr>
    
   <td><%=nm%></td>
   <td><%=add%></td>
   <td><%=email%></td>
   
   <td><%=mob%></td>  
        <td><%=age%></td>
        <td><%=unm%></td> 
         <td><%=pass%></td> 
        
   <td><%=id%></td>
    
    
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

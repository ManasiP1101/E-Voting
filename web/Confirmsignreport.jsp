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
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="AdHomepage.jsp">Home</a></li><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="Confirmsignreport.jsp">Confirmsignreport</a></li><br><br>
              
           
              
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
                                    <th height="50px" colspan="2"> Canfirmsign report </th>
                          </tr> 
                      
                                
                                 <tr td width="100px" align="centre">
                                     <td align="center">Candidate_name</td>
                                     <td align="center">mobile_no</td>
                                   <td align="center">ward_no</td>
                                     <td align="center">Party_name</td>
                                     <td align="center">Party_sign</td>
                                     
                                 </tr>
                                   <%
    
        
      
        String cnm=null;
        String mob1=null;
        String wr1=null;
        String pn=null;
        String img=null;
        
         
    

     Statement st=con.createStatement();
  String str="select * from  confirm_candidate_sign";
  
    ResultSet rs=st.executeQuery(str);
    
    while(rs.next())
{
    
    cnm=rs.getString(1);
    mob1=rs.getString(2);
    
   // sou=rs.getString(3);
    //Des=rs.getString(4);
    
    wr1=rs.getString(3);
    pn=rs.getString(4);
   img=rs.getString(5);
    
    //=rs.getString(9);
    
     
  
%>         
                               
<tr>
    
   <td><%=cnm%></td>
   <td><%=mob1%></td>
   <td><%=wr1%></td>
   
   <td><%=pn%></td>  
        <td><%=img%></td>
        
         
    
    
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

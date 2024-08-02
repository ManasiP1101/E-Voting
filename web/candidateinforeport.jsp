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
          <ul>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="AdHomepage.jsp">Home</a></li><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <li><a href="candidateinforeport.jsp">CandidateInfo report</a></li><br><br>
              
          
           
              
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
                                    <th height="50px" colspan="2">  Candidateinfo report</th>
                          </tr> 
                                
                                 <tr td width="100px" align="centre">
                                     <td align="center">Candidate_name</td>
                                     <td align="center">Address</td>
                                   <td align="center">Email_id</td>
                                     <td align="center">Voting_id</td>
                                     <td align="center">Date_of_Birth</td>
                                     <td align="center">Age</td>
                                     <td align="center">Gender</td>
                                     <td align="center">Marital_status</td>
                                     <td align="center">cast</td>
                                     <td align="center">Adhar_Card_no</td>
                                     <td align="center">Pan_card_no</td>
                                     <td align="center">Consituancy</td>
                                      <td align="center">Id</td>
                                       <td align="center">mobile_no</td>
                                 </tr>
                                   <%
    
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
     
  
%>         
                               
<tr>
    
   <td><%=cnm%></td>
   <td><%=add%></td>
   <td><%=eid%></td>
   
   <td><%=vid%></td>  
        <td><%=bdate%></td>
        <td><%=age%></td> 
         <td><%=gender%></td> 
        
   <td><%=mstatus%></td>
    <td><%=cst%></td>
     <td><%=ano%></td>
      <td><%=pno%></td>
       <td><%=cons%></td>
       <td><%=i%></td>
        <td><%=mno%></td>
         
    
    
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

<%-- 
    Document   : AdHomepage
    Created on : 21 Feb, 2024, 12:12:24 PM
    Author     : user
--%>
<%@include file="connection.jsp" %>
<%@page  import="java.io.*" %>
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
   <%
   
                           
                           String pn=null;
                           String wr1=null;
                           String cnm=null;
                           String mob1=null;
                           String img1=null;
                           cnm=(String)session.getAttribute("nm");
                           mob1=(String)session.getAttribute("mob2");
                           pn=(String)session.getAttribute("pro");
                           wr1=(String)session.getAttribute("wr2");
                         
                           
 
 %>
    <header>
      <header>
        <div class="logo">
            <a><img src="images/logo1.png" alt="logo" /></a>
        </div>
        <nav class="nav-menu">
          <ul>
              
                <li><a href="AdHomepage.jsp">Home</a></li><br><br>
              <li><a href="CandidateInfo.jsp">CandidateInfo</a></li><br><br>
              <li><a href="ApplyForElection.jsp">ApplyElection</a></li><br><br>
              <li><a href="CandidateSign.jsp">CandidateSign</a></li><br><br>
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/pp1.jpg" alt="Hero image" />
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
     
                   <form>
          
                   <table class="center"  border="2" Width="600px" style="background-color:whitesmoke">
                      <thead>
                           <tr>
                              <th height="50px" colspan="2">CONFIRM SIGN</th>
                          </tr>
                          
                      </thead>
                      <tbody>
                      
                             <tr>
                              <td align="center"> Candidate Name</td>
                              <td width="250px" align="center"><%=cnm%></td>
                                      
                                  
                          </tr>
                       
                          
                          <tr>
                              <td align="center">mobile no</td>
                              <td Width="250px" align="center"><%=mob1%></td>
                          </tr>
                  
                          <tr>
                              <td align="center">Party name</td>
                              <td Width="250px" align="center"><%=pn%></td>
                          </tr>
                          <tr>
                              <td align="center">ward_no</td>
                              <td Width="250px" align="center"><%=wr1%></td>
                          </tr>
                              
                       <%
    String img=request.getParameter("fileupload");
    File f=new File("images/"+img);
    String img2="images/"+img;
    %> 
                          <tr>
                              <td align="center">Party sign</td>
                              <td Width="300px" align="center"><input type="file" name="fileupload" value=""/> 
                          
                          </tr>
                          <tr>
                              <td align="center">Display images </td>
                              <td align="center"><img src="<%=img2%>" width="250px" /></td>
                        
                          </tr>
                           <tr>
                              <td colspan="2" align="center"><input type="submit" value="submit" name="sumbit" /></td>
                      
                          </tr>    
                      
                      </tbody>
                      
                  </table> 
                              <br>
                              <br>
                              <%
                            
                             
                           
                          Statement st3=con.createStatement();
                         //if(cnm!=null && cnm!=""&&mob1!=null && mob1!=""&&pn!=null && pn!=""&&wr1!=null && wr1!=""&&img!=null && img!="")
                          if(img!=null && img!="")
                          {
                              String str3="insert into confirm_candidate_sign(Candidate_name,mobile_no,ward_no,Party_name,Party_sign) values('"+cnm+"',"+mob1+","+wr1+",'"+pn+"','"+img+"')";
                              
                                      
                               int s=st3.executeUpdate(str3);
                               
                              out.println("<script>alert('you are confirm_candidate_sign....')</script>");
                          }
                      
                              %>
                              
                              
                                <%
                             
                              session.setAttribute("img",img1);
                              
                              %>
                  
              </form>

     
      <footer>
        
         <marquee><p>Developed By:- Manasi patil & Priyanka patil</p></marquee> 
      </footer>
    </main>
  </body>
  <script
    src="https://kit.fontawesome.com/6558443b63.js"
    crossorigin="anonymous"
  ></script>
</html>

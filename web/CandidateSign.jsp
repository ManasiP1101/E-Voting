<%-- 
    Document   : AdHomepage
    Created on : 21 Feb, 2024, 12:12:24 PM
    Author     : user
--%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Voting</title>
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body>
   <%

                            String pn=null;
                           String wr=null;
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
              
           
              
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/1234.jpg" alt="Hero image" />
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
                     <table class="center"  border="2" Width="500px" style="background-color:whitesmoke">
                      <thead>
                           <tr>
                              <th height="50px" colspan="3">Candidate Sign</th>
                          </tr>
                          
                      </thead>
                      <tbody>
                          <%
                         
                           Statement st=con.createStatement();
                        
                           String str="select * from apply_for_election";
                           
                          ResultSet rs= st.executeQuery(str);
                         
                          %>
                          <tr>
                              <td align="center"> Candidate Name</td>
                              <td  align="center" width="250px"><select name="drpcnm"> 
                                      <%
                          while(rs.next())
                          {
                             
                                      %>
                                      <option><%=rs.getString(1)%></option>
                                      <%
                          }
                          %>
                                  </select><td> <input type="submit" value="Find" name="Find" /> </td> 
                                  
                          </tr>
                          <%
                          String mob=null;
                          String cnm=request.getParameter("drpcnm");
                          Statement st1=con.createStatement();
                          
                          String str1="select * from apply_for_election where Candidate_name='"+cnm+"'";
                          
                          
                          ResultSet rs1=st1.executeQuery(str1);
                          if(rs1.next())
                          {
                          mob=rs1.getString(2);
                          pn=rs1.getString(3);
                          wr=rs1.getString(4);
                          }
                          
                          
                          
                  
                          %>
                          
                          
                          <tr>
                              <td align="center">mobile no</td>
                              <td align="center" Width="250px"><%=mob%></td>
                          </tr>
                  
                          <tr>
                              <td align="center">Party name</td>
                              <td align="center" Width="250px"><%=pn%></td>
                          </tr>
                          <tr>
                              <td align="center">ward_no</td>
                              <td align="center" Width="250px"><%=wr%></td>
                             
                          </tr>
                     
                  
                                    
                          
                      <td colspan="3" align="center"> <a href="ConfirmSign.jsp">Next</a></td>
                 </tbody>
                 </table>
              </form>
                      <%
                              session.setAttribute("nm",cnm);
                              String mob1=String.valueOf(mob);
                              session.setAttribute("mob2", mob1);
                              session.setAttribute("pro", pn);
                              String wr1=String.valueOf(wr);
                              session.setAttribute("wr2", wr1);
                             
                              
                              %>
                              
                          </body>
                          </html>
                          <br>
                          <br>
     
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

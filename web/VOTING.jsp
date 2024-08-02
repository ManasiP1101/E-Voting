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
    <link rel="stylesheet" href="css/style1.css" />
  </head>
  <body>
      <%
 String vnm=null;
 String vid=null;
 String ano=null;
 String pno=null;
 String con1=null;
 
 ano=request.getParameter("txtano");
    pno=request.getParameter("txtpno");
    con1=request.getParameter("dprconsitiueny");

vnm=(String)session.getAttribute("nm");
vid=(String)session.getAttribute("vid1");




%>
    <header>
      <header>
        <div class="logo">
            <a><img src="images/logo1.png" alt="logo" /></a>
        </div>
        <nav class="nav-menu">
          <ul>
              <li><a href="VoterHome.jsp">Home</a></li><br><br>
              <li><a href="VoterInfo.jsp">VoterInfo</a></li><br><br>
              <li><a href="VOTING.jsp">Voting</a></li><br><br>
              <li><a href="VoteHere.jsp">VoteHere</a></li><br><br>
              <li><a href="MainHomePage.jsp">Logout</a></li><br><br>
           
              
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/pp7.jpg" alt="Hero image" />
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
                              <th height="50px" colspan="2"> Voting</th>
                          </tr>
                          
                      </thead>
                     <tbody>
                          <%


Statement st=con.createStatement();
String str= "select*from voter_info where uname='"+vnm+"'";
ResultSet rs=st.executeQuery(str);
while(rs.next())
{
    
    vnm=rs.getString(2);
    
    vid=rs.getString(3);
}

                          %>
                          
                      
                 
                           
                            <tr>
                              <td align="center"> Voter Name</td>
                                      
                              <td Width="250px" align="center"><input type="text" name="txtvnm" value="<%=vnm%>" /></td>
                          </tr>
                          <tr>
                              <td align="center"> Voter-Id</td>
                              <td Width="250px" align="center"><input type="tel" name="txtid" value="<%=vid%>" /></td>
                          </tr>
                          
                          <tr>
                              <td align="center"> Adhar Card No</td>
                              <td Width="250px" align="center"><input type="tel" name="txtano" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center"> Pan Card no</td>
                              <td Width="250px" align="center"><input type="tel" name="txtpno" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center"> Consistiueny</td>
                              <td align="center"> <select name="dprconsitiueny">
                                      <option>1</option>
                                      <option>2</option>
                                      <option>3</option>
                                      <option>4</option>
                                  </select></td>
                          </tr>
                          
                          <tr>
                              <td align="center"><input type="submit" value="submit" name="submit" /> </td>
                              <td align="center"><a href="VoteHere.jsp">VoteHere</a></td>
                                         
                          </tr>
                          <tr>
                              <td></td>
                              <td></td>
                          </tr>
                              
                      </tbody>
                  </table> 
                   </form>  
                           <%
                          Statement st4=con.createStatement();
                         if(ano!=null && ano!="" && pno!=null && pno!="" && con1!=null && con1!="")
                          {
                              String str4="insert into voting(Name,Voter_id,AdharCard_No,PanCard_no,Consistiueny)values('"+vnm+"','"+vid+"',"+ano+",'"+pno+"',"+con1+")";
                             int s=st4.executeUpdate(str4);
                              out.println("<script>alert('you are voting success....')</script>");
                              
                          }
              
              %>
              
   <section id="activites" class="destinations">
          <br>
        <div class="destination-grid">
          <div class="destination-item">
            <img src="images/A9.png" alt="" />
            <h3>""Vote for a better tomorrow."</h3>
           
          </div>
          <div class="destination-item">
            <img src="images/sp1.png" alt="" />
            <h3>"Your Vote,Your Choice"</h3>
            
          </div>
          <div class="destination-item">
            <img src="images/vote2.jpeg" alt="" />
            <h3>"Be the change,Vote for change."</h3>
           
          </div>
        </div>
      </section>

     
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

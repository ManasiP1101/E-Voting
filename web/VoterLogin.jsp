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
    String unm=null;
    String pass=null;
    unm=request.getParameter("txtvnm");
    pass=request.getParameter("txtpass");
    %>
    <header>
      <header>
        <div class="logo">
            <a><img src="images/logo1.png" alt="logo" /></a>
        </div>
        <nav class="nav-menu">
          <ul>
              <li><a href="MainHomePage.jsp">Home</a></li><br><br>
              <li><a href="VoterLogin.jsp">Login</a></li><br><br>
              <li><a href="MainHomePage.jsp">Logout</a></li><br><br>
            
              
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/v3.webp" alt="Hero image" />
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
      </style>
      <br>
      <br>
     
      <form>
          
                   <table class="center"  border="2" Width="400px" style="background-color:whitesmoke">
                      <thead>
                           <tr>
                              <th height="50px" colspan="2"> VOTER LOGIN</th>
                          </tr>
                          
                      </thead>
                      <tbody>
                          <tr>
                              <td Width="100px"  align="center"> Voter Name</td>
                              <td  Width="100px"  align="center"><input type="text" name="txtvnm" value="" /></td>
                          </tr>
                         
                          <tr>
                             <td Width="100px" align="center"> Password</td>
                              <td Width="100px" align="center"><input type="password" name="txtpass" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center"><input type="submit" value="Login" name="Login" /> </td>         
                              <td align="center"><input type="reset" value="Reset" name="Reset" /></td>
                                         
                           </tr>
                          <tr>
                              <td></td>
                              <td></td>
                          </tr>
                      </tbody>
                  </table> 
          <%
    Statement st= con.createStatement();
    
    if(unm!=null && unm!= "" && pass!=null && pass!="")
    {
    String str="select * from  registration where Username='"+unm+"' and Password='"+pass+"'";
    ResultSet rs=st.executeQuery(str);
    if(rs.next())
    {
         out.println("<script>alert('login success....')</script>");
         session.setAttribute("nm", unm);
         response.sendRedirect("VoterHome.jsp");
    }
    else
    {
         out.println("<script>alert('login failed....')</script>");
         response.sendRedirect("VoterRegistration.jsp");
    }
    }
                 %>
      </form>
        
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

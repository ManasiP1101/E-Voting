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
  vnm=(String)session.getAttribute("nm");
  

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
            <img src="images/123456789.jpg" alt="Hero image" />
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
     
      <form method="post" name="form" >
          
                   <table class="center"  border="2" Width="500px" style="background-color:whitesmoke">
                      <thead>
                           <tr >
                              <th  height="50px"  colspan="2"> Vote Here</th>
                          </tr>
                          
                      </thead>
                     <tbody>
                          
                          <tr>
              
                       <tr><td>Candidate_name</td><td>mobile_no</td><td>ward_no</td><td>Party_name</td><td>Party_sign</td></tr>
                <%
                 
               String cnm=null;
               String mob1=null;
               int wr1=0;
               String pn=null;
               String img1=null;
               String img2=null;
                Statement st=con.createStatement();
                String str= "select * from confirm_candidate_sign";
                ResultSet rs=st.executeQuery(str);
                
                while(rs.next())
                {
                 cnm=rs.getString(1);
                 mob1=rs.getString(2);
                 wr1=rs.getInt(3);
                 pn=rs.getString(4);
                 img1="images/"+rs.getString(5);
              img2="images/"+img1;
                %>
                <tr><td><%=cnm%></td><td><%=mob1%></td><td><%=wr1%></td><td><%=pn%></td><td><img src="<%=img1%>" width="100" height="100"/>
                    </td><td><input type="submit" value="Vote" name="Vote" style="background-color:greenyellow" /></td></tr>
              
               <%
                }
               Statement st1=con.createStatement();
               String str6="select * from registration where Registrator_name='"+vnm+"'";
               ResultSet rs1=st1.executeQuery(str6);
               while(rs1.next())
               {
                   vnm=rs1.getString(1);
               }
               %>
               </tbody>
                  </table> 
                 <%
                            Statement st2=con.createStatement();
                if(cnm!=null && cnm!=""  && pn!=null && pn!="" && img1!=null  && img1!="")
                
                           {   
                               
            String str7="insert into vote_here(Voter_name,Constituacy,Candidate_name,Party_sign,Party_name,mobile_no) values('"+vnm+"','"+wr1+"','"+cnm+"','"+img1+"','"+pn+"','"+mob1+"')";
                            
                            int s=st2.executeUpdate(str7);
                           }
                          out.println("<script>alert('you are voting  successful....')</script>");
                            %>
                            
                </from>
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

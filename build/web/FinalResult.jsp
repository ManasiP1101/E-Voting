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
      <%
      
      String cnm=null;
       String mob=null;
       
         String prtnm=null;
      
      
      
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
            <img src="images/re2.png" alt="Hero image" />
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
                     
                      <tbody>
                             <tr>
                              <td align="center">ward_no</td>
                              <td align="center"> <select name="drpwr">
                                     
                                      <option>1</option>
                                      <option>2</option>
                                      <option>3</option>
                                      <option>4</option>
                                  </select></td>
                                    
                          </tr>
                          
                           <tr>
                              <td align="center"> Select Party </td>
                              <td align="center"> <select name="drpparty">
                                    
                                      <option> BJP</option>
                                      <option>NCP</option>
                                      <option>CP</option>
                                      <option>MNS</option>
                                     
                                  </select></td>
                          </tr>
                            <%
                  int i=0;
                  String party[]={"BGP","NCP","CP","MNS"};
                  int votes[]=new int[4];
                  String str1=null;
                  ResultSet rs1=null;
                  String img=null;
                  String wrno=request.getParameter("drpwr");
                 String partynm=request.getParameter("drpparty");
                    Statement st=con.createStatement();
                    if(wrno!=null && wrno!="")
                    {
                        // out.println("ssss="+wrno);
                       String str="Select count(*)from vote_here Where Constituacy="+wrno+" and Party_name='"+partynm+"'";
                           rs1=st.executeQuery(str);
                       ResultSet rs=st.executeQuery(str);
                       if (rs.next())
                       {
                           i=rs.getInt(1);  
                       }
                    }
                       Statement st1=con.createStatement();
                       for(int c=0;c<4;c++)
                       {
                          // str1="select count(*)from vote_here Where Constituacy='"+wrno+"' and Party_name='"+partynm+"' ";
                           str1="select count(*)from vote_here Where Constituacy='"+wrno+"'";
                           rs1=st1.executeQuery(str1);
                           
                           if (rs1.next())
                           {
                               votes[c]=rs1.getInt(1);
                               // out.println("ddd="+votes[c]);
                               
                           }
                          
                           }
                       
                  
              %>
              
              
              
              
               <tr>
                  <td><input type="Submit" value="Search" name="Search"/></td>
              </tr><tr style="height: 100px; color: #ffcccc"><td><h4>Election Results</h4></td></tr>
<!--                <tr> <td><h6>BJP</h6></td>  <td><h6><%=votes[0]%></h6></td>
                    <tr> <td><h6>NCP</h6></td>  <td><h6><%=votes[1]%></h6></td>
                        <tr> <td><h6>CP</h6></td>  <td><h6><%=votes[2]%></h6></td>
                            <tr> <td><h6>MNS</h6></td>  <td><h6><%=votes[3]%></h6></td>-->
                            <tr><td><h6>Total votes</h6></td> <td><h6><%=i%></h6></td>
                            </tr>
      
                      </tbody> 
                   </table>     
                            
                             
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

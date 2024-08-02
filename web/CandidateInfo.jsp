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
    int a=0;
   
   
    String cnm=null;
    String add=null;
    String eid=null;
    String mno=null;
    String vid=null;
    String bdate=null;
  
    String gender=null;
    String mstatus=null;
     String cst=null;
    String ano=null;
    String pno=null;
    String cons=null;
    
    
    
    cnm=request.getParameter("cnm");
    add=request.getParameter("add");
    eid=request.getParameter("eid");
    mno=request.getParameter("mno");
    vid=request.getParameter("vid");
    bdate=request.getParameter("bdate");
    gender=request.getParameter("drpgender");
    mstatus=request.getParameter("mstatus");
    cst=request.getParameter("cst");
    ano=request.getParameter("ano");
     pno= request.getParameter("pno");
     cons=request.getParameter("cons");
    
            
            
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
     
                   <form>
                   <table class="center"  border="2" Width="500px" style="background-color:whitesmoke">
                      <thead>
                           <tr>
                              <th height="50px" colspan="2"> Candidate Info</th>
                          </tr>
                          
                      </thead>
                      <tbody>
                              <%
                           int i=0;
                            Statement st=con.createStatement();
                            String str="select count(*)from candidate_info";
                            ResultSet rs=st.executeQuery(str);
                            if(rs.next())
                            {
                                i=rs.getInt(1);
                                i++;
                                  
                             }
                            %>
                  <tr>
                              <td align="center" width="250px">Id</td>
                              <td width="250px" align="center"><input type="textId" name="txtid" value="<%=i%>" /> </td>
                          </tr>
                          
                          <tr>
                              <td align="center" width="250px"> Candidate Name</td>
                              <td width="250px" align="center"><input type="text" name="cnm" value="" /></td>
                          </tr>
                      </thead>
                      <tbody>
                           
                          <tr>
                              <td align="center" width="250px">Address</td>
                              <td Width="250px" align="center"><input type="text" name="add" value=""  /></td>
                          </tr>
                          <tr>
                              <td align="center" width="250px">Email-id</td>
                              <td Width="250px" align="center"><input type="tel" name="eid" value=""/></td>
                          </tr>
                                
                          <tr>
                              <td align="center" width="250px">mobile no</td>
                              <td Width="250px" align="center"><input type="tel" name="mno" value=""  /></td>
                          </tr>
                                
                          <tr>
                              <td align="center" width="250px">Voter id</td>
                              <td Width="250px" align="center"><input type="tel" name="vid" value=""  /></td>
                          </tr>
                          
                                     <%
                          long age=0;                             
         String dob=null;
          String dob2=null;
           dob=request.getParameter("bdate");
           dob2=dob;
           
          if(dob!=null && dob!="")
          {
                 LocalDate dob1=LocalDate.parse(dob2);
                 
                  
                  LocalDate currdt=LocalDate.now();
                  
                 age=ChronoUnit.YEARS.between(dob1,currdt);
                 
                   
                    
          }
                          %>
                          
                               <tr>
                              <td align="center" width="250px">Date Of Birth
                         
                                  <td   align="center">  <input type="date" name="bdate" value="" />
                             <input type="submit" value="Agecalculate" name="Agecalculate" /></td>
                              </td>
                           </tr>
                           
                           <tr>
                              <td align="center" width="250px">Age</td>
                              <td width="250px" align="center"><input type="text" name="age" value="<%=age%>" /></td>
                          </tr>
                          <tr>
                              <td align="center" width="250px">Gender</td>
                              <td align="center" width="250px"><select name="drpgender">
                                      <option>select</option>
                                      <option>Male</option>
                                      <option>Female</option>
                                  </select></td>
                              
                      
                          </tr>
                          <tr>
                              <td align="center" width="250px">Marital Status</td>
                              <td align="center"width="250px">  <select name="mstatus">
                                      <option>select</option>
                                      <option>yes</option>
                                      <option>no</option>
                                  </select></td>
                          </tr>
                          <tr>
                              <td align="center" width="250px">Cast</td>
                              <td width="250px" align="center"><input type="text" name="cst" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center" width="250px">Adhar card no</td>
                              <td width="250px" align="center"><input type="tel" name="ano" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center" width="250px">Pan card no</td>
                              <td width="250px" align="center"><input type="text" name="pno" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center" width="250px">Consituancy</td>
                              <td align="center" width="250px"><select name="cons">
                                    
                                      <option>Grampanchyat</option>
                                     
                                  </select></td>
                            </tr>
                                
                               
                          
                                                    

                          <tr>
                              <td align="center" colspan="2"><input type="submit" value="submit" name="sumbit" /></td>
                               <td align="center" >  <a href="ApplyForElection.jsp">Next</a></td>
                          </tr>
                         
                      </tbody>
                  </table> 
                          
                                 <%
                                 //if(s.equals("no"))
                                     
                            Statement st1=con.createStatement();
                         
                       if(cnm!=null && cnm!="" && add!=null && add!="" && eid!=null && eid!=""   && vid!=null  && vid!="" && bdate!=null && bdate!="" && gender!=null && gender!="" && mstatus!=null && mstatus!="" && cst!=null && cst!=""&& ano!=null && ano!=""&& pno!=null && pno!="" && cons!=null && cons!="" &&  mno!=null && mno!="")
                           {   
                               
           String strl="insert into candidate_info(Candidate_name,Address,Email_id,Voting_id,Date_of_Birth, Age,Gender,Marital_status,cast,Adhar_Card_no,Pan_card_no,Consituancy,Id,mobile_no) values('"+cnm+"','"+add+"','"+eid+"','"+vid+"','"+bdate+"',"+age+",'"+gender+"','"+mstatus+"','"+cst+"',"+ano+",'"+pno+"','"+cons+"',"+i+",'"+mno+"')";
                            
                            int s=st1.executeUpdate(strl);
                            out.println("<script>alert('you are candidate_info success....')</script>");
                            
                               
                               
                            
                                }
                             
                               
                         
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

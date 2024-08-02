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

   String mob=null;
    String sp=null;
    String wr=null;
    String nc=null;
    String fc=null;
    String pro=null;
    
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
              <li><a href="ApplyForElection.jsp">ApplyForElection</a></li><br><br>
              <li><a href="CandidateSign.jsp">CandidateSign</a></li><br><br>
              <li><a href="ConfirmSign.jsp">ConfirmSign</a></li><br><br>
           
              
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/A5.jpg" alt="Hero image" />
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
                              <th height="50px" colspan="2">Apply For Election</th>
                          </tr>
                          
                      </thead>
                      <tbody>
                          
                           <tr>
                              <td align="center">Id</td>
                              <td width="250px" align="center"><input type="text" name="txtid" value="" /><input type="submit" value="Find" name="Find" /> </td>
                                     
                          </tr>
                          <%   
    
                 
                         
                          String cnm=null;
                             String id1=request.getParameter("txtid");
                           Statement st=con.createStatement();
                        
                           String str="select * from candidate_info where id="+id1+"";
                           
                          
                       
                       
                          ResultSet rs= st.executeQuery(str);
                          
                          if(rs.next())
                          {
                             cnm=rs.getString(1);
                             mob=rs.getString(14);
                             
                             
                          }
                  
                  
                          %>
                           <tr>
                              <td align="center"> Candidate Name</td>
                              <td width="250px" align="center"><%=cnm%></td>
                           </tr>
                             <tr>
                              <td align="center">mobile no</td>
                              <td Width="250px" align="center"><%=mob%></td>
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
                              <td align="center">No. of Children</td>
                              <td align="center"> <select name="drpchidran">
                                       
                                      <option>0</option>
                                      <option>1</option>
                                      <option>2</option>
                                      
                                  </select></td>
                                    
                          </tr>
                          <tr>
                              <td align="center">Property</td>
                              <td  align="center" Width="250px"><input type="text" name="pro" value="" /></td>
                          </tr>
                                
                          <tr>
                                 <td align="center">Any FIR Case</td>
                                 <td align="center">  <select name="drpfir">
                                        
                                         <option>Yes</option>
                                         <option>No</option>
                                     </select></td>
                          </tr>
                         
                          <tr>
                              <td colspan="2" align="center" ><input type="submit" value="submit" name="sumbit" /></td>
                               <td align="center" >  <a href="CandidateSign.jsp">Next</a></td>
                          </tr>
                          <tr>
                              <td></td>
                              <td></td>
                          </tr>
                      </tbody>
                  </table> 
                           <%
                         // int i=Integer.valueOf(id1);
                           
                          
                           sp=request.getParameter("drpparty");
                             wr=request.getParameter("drpwr");
                             nc=request.getParameter("drpchidran");
                             fc=request.getParameter("drpfir");
                             pro=request.getParameter("pro");
    
    
                           Statement st1=con.createStatement();
                          
                          if(sp!=null && sp!="" && wr!=null && wr!="" &&  nc!=null && nc!="" && fc!=null && fc!="" && pro!=null && pro!="")
                           {
                              if(fc.equals("No"))
                               { 
                           String str2= "insert into apply_for_election(Candidate_name,mobile_no,Select_party,ward_no,No_of_childrens,Any_fir_case,id,property) values('"+cnm+"',"+mob+",'"+sp+"',"+wr+","+nc+",'"+fc+"',"+id1+","+pro+")";
                         
                           
                            int s=st1.executeUpdate(str2);
                            out.println("<script>alert('you are apply_for_election success....')</script>");
                               }
                               else
                               {
                                   out.println("<script>alert('You are not eligible for standing in Election')</script>");
                               }
                               }
                           
                           %>
                  
              </form>
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

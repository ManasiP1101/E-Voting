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
    int a=0;
    int sno1=0;
    
    String vnm=null;
    String add=null;
    String vid=null;
    String mno=null;
    int age=0;
    String email=null;
    String gender=null;
   
      
        String unm=null;
        unm=(String)session.getAttribute("nm");
      
   
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
            <img src="images/v1.png" alt="Hero image" />
        </div>
        <div class="hero-content">
            <br> <h1>"Welcome  To Electronic Voting"</h1></br>
          <p> E-Voting You Should Set an example by Voting.</p>
         
        </div>
      </section>
      <!-- Destinations -->
      <br>
      <br>
       <marquee>Username=<%=unm%></marquee>
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
   
              <form>
                    <table class="center"  border="2" Width="400px" style="background-color:whitesmoke">
                      <thead>
                           <tr>
                              <th height="50px" colspan="2"> VOTER INFO</th>
                          </tr>
                      </thead>
                      <tbody>
                          <%
                            int i=0;
                              Statement st=con.createStatement();
                            String str="select count(*)from voter_info";
                            ResultSet rs=st.executeQuery(str);
                            if(rs.next())
                                
                            {
                                i=rs.getInt(1);
                                i++;
                            }
                        
                                      %>
                          <tr>
                              <td align="center">Serial no</td>
                              <td Width="250px" align="center"><input type="text" name="txtsno" value="<%=i%>"readonly="true" /></td>
                          </tr>
                         <%
                                  Statement st1=con.createStatement();
                                  String str1="select * from  registration where Username='"+unm+"'";
                                  
                                   ResultSet rs1=st1.executeQuery(str1);
                                   while(rs1.next())
                                   {
                                  sno1=rs1.getInt(8);
                                  
                                  vnm=rs1.getString(1);
                                  //vid=rs1.getString(3);
                                  add=rs1.getString(2);
                                
                                  mno=rs1.getString(4);
                                  age=rs1.getInt(5);
                                  email=rs1.getString(3);
                                  
                                   }
                                %>
                                        
                          <tr>
                              <td Width="100px"  align="center"> Voter Name</td>
                              <td Width="250px" align="center"><%=vnm%></td>
                          </tr>
                           <tr>
                               <td Width="100px"  align="center"> Voter id</td>
                               <td Width="100px"  align="center"> <input type="text"  name="vid" value="" /></td>
                          </tr>
                          <tr>
                              <td align="center"> Address</td>
                              <td Width="250px" align="center"><%=add%> </td>
                          </tr>
                          
                         
                          <tr>
                              <td align="center"> mobile no</td>
                              <td Width="250px" align="center"><%=mno%></td>
                          </tr>
                          <tr>
                              <td align="center"> Age </td>
                              <td Width="250px" align="center"><%=age%></td>
                          </tr>
                          <tr>
                              <td align="center">E_mail id</td>
                              <td width="250px" align="center"><%=email%></td>
                              
                          </tr>
                        
                         <tr>
                              <td align="center">Gender </td> 
                              <td align="center"> <select name="drpgender">
                                 <option></option>     
                                <option>Female</option>
                                <option>Male</option>
                      
                                  </select></td>
                              
                          </tr>
                          <tr>
                              <td align="center"> uname</td>
                              <td Width="250px" align="center"><%=unm%></td>
                          </tr>
                          
                         
                          <tr>
                                     
                     
                              <td>   <input type="submit" value="submit" name="submit" /></td>                                          
                       
                      
                          <td align="center" >  <a href="VOTING.jsp">Next</a></td>
                      </tr>
                        
                             
                          <%
                            int age1=0;
                       // age1=Integer.parseInt(age);
                      
                       //  sno1=request.getParameter("txtsno1");
                        // vnm=request.getParameter("txtvnm");
                        vid=request.getParameter("vid");
                        // add=request.getParameter("txtadd");
                        //  mno=request.getParameter("txtmob");
                            //age=request.getParameter("txtage");
                            // email=request.getParameter("txteid");
                             gender=request.getParameter("drpgender");
                            Statement st2=con.createStatement();
                         
                     if( vid!=null && vid!="" && gender!=null && gender!="" )
                           {   
                               if(age>18)
                               {
                            
                               
             String str2="insert into voter_info(Serial_no,Voter_name,Voter_id,address,mob,age,email_id,gender,uname)values("+i+",'"+vnm+"','"+vid+"','"+add+"',"+mno+","+age+",'"+email+"','"+gender+"','"+unm+"')";
                            
                            int s=st2.executeUpdate(str2);
                            out.println("<script>alert('you are voter_info success....')</script>");
                             
                                  /* out.println(i);
                           out.println(vnm);
                            out.println(vid);
                            out.println(add);
                            out.println(mno);
                            out.println(age);
                            
                            out.println(email);
                           out.println(gender);*/
                                }
                               else
                               {
                                   out.println("Your Age Is Not Eligible For Voting.");
                               }
                           }
                             
                           
                               
                            %> 
                      </tbody>
                                  </table>
                      
                  
              </form>
                      <%
                       session.setAttribute("vid1",vid);
                        
                      %>      
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

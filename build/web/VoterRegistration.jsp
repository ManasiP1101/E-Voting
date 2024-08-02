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
    <script type="text/javascript">
function validate()
{ 
if( document.mobilenumbervalidation.txtmno.value == "" ||
isNaN( document.mobilenumbervalidation.txtmno.value) ||
document.mobilenumbervalidation.txtmno.value.length != 10 )
{
alert( "Please provide a 10 digit no" );
document.mobilenumbervalidation.txtmno.focus() ;

return false;
}

var email = document.mobilenumbervalidation.txteid.value;
atpos = email.indexOf("@");
dotpos = email.lastIndexOf(".");
if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
{
alert("Please enter correct email ID");
document.mobilenumbervalidation.txteid.focus() ;
return false;
}

return( true );
}
</script> 

  </head>
  <body>
      <%
    int a=0;
    String nm=null;
    String add=null;
    String email=null;
    String mob=null;
    String unm=null;
    String pass=null;
    String age=null;
   int age1=0;
    nm=request.getParameter("txtrnm");
    add=request.getParameter("txtadd");
    email=request.getParameter("txteid");
    mob=request.getParameter("txtmno");
    age=request.getParameter("txtage");
 
    unm=request.getParameter("txtunm");
    pass=request.getParameter("txtPassword");
   
    %>
    <header>
      <header>
        <div class="logo">
            <a><img src="images/logo1.png" alt="logo" /></a>
        </div>
        <nav class="nav-menu">
          <ul>
              <li><a href="MainHomePage.jsp">Home</a></li><br><br>
              <li><a href="VoterRegistration.jsp">Registration</a></li><br><br>
              <li><a href="MainHomePage.jsp">Logout</a></li><br><br>
           
           
              
          </ul>
        </nav>
      </header>
    </header>
    <main>
      <section class="hero">
        <div class="hero-image">
            <img src="images/v5.jpeg" alt="Hero image" />
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
     
                  <form method="get" action="" name="mobilenumbervalidation" onsubmit="return(validate());"> 

          
                   <table class="center"  border="2" Width="500px" style="background-color:whitesmoke">
                      <thead>
                           <tr>
                              <th height="50px" colspan="2"> REGISTRATION</th>
                          </tr>
                          
                      </thead>
                      <tbody>
                          <%
                            int i=0;
                            Statement st=con.createStatement();
                            String str="select count(*)from registration";
                            ResultSet rs=st.executeQuery(str);
                            if(rs.next())
                            {
                                i=rs.getInt(1);
                                i++;
                            }
                          %>
                          <tr style="height:1px;">
                              <td align="center">Id</td>
                              <td width="250px" align="center"><input type="textId" name="txtid" value="<%=i%>" readonly="true" /> </td>
                          </tr>
                           <tr  style="height:1px;">
                              <td align="center"> Registrator Name</td>
                              <td width="250px" align="center"><input type="textid" name="txtrnm" value=""  /> </td>
                          </tr>
                          <tr  style="height:1px;">
                              <td align="center">Address</td>
                              <td Width="250px" align="center"><input type="text" name="txtadd" value=""  /> </td>
                          </tr>
                          <tr style="height:1px;" >
                              <td align="center">Email-id</td>
                              <td Width="250px" align="center"><input type="text" name="txteid" value=""  /> </td>
                          </tr>
                                
                          <tr style="height:1px;">
                              <td align="center">mobile no</td>
                              <td Width="250px" align="center"><input type="text" name="txtmno" value=""/> </td>
                          </tr>
                           <tr style="height:1px;">
                              <td align="center">Age</td>
                              <td Width="250px" align="center"><input type="text" name="txtage" value=""  /> </td>
                          </tr>
                          <tr style="height:1px;">
                              <td align="center">Username</td>
                              <td Width="250px" align="center"><input type="text" name="txtunm" value="" /> </td>
                          </tr>
                                
                          <tr style="height:1px;">
                              <td align="center">Password</td>
                         
                              <td Width="250px" align="center"><input type="password" name="txtPassword" value=""  /></td>      
                          </tr>
                          
                          <tr style="height:1px;">
                              <td align="center"><input type="submit" value="Registration" name="Registration" /></td>
                              <td align="center"> <input type="submit" value="login" name="login" /></td>
                              
                          </tr>
                          
                         
                      </tbody>
                  </table> 
                            <%
                            Statement st1=con.createStatement();
                         
                       if(nm!=null && nm!="" && add!=null && add!="" && email!=null && email!=""  && mob!=null && mob!="" && unm!=null  && unm!="" && pass!=null && pass!="")
                           {   
                               
            String strl="insert into registration(Registrator_name,Address,Email_id,mobile_no,age,Username,Password,id) values('"+nm+"','"+add+"','"+email+"',"+mob+","+age+",'"+unm+"','"+pass+"',"+i+")";
                            
                            int s=st1.executeUpdate(strl);
                            out.println("<script>alert('you are registration success....')</script>");
                            
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

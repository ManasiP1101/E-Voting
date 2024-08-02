<%-- 
    Document   : Feedback
    Created on : 1 Mar, 2024, 11:16:15 AM
    Author     : user
--%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html lang="en"> 

<head> 
	<meta charset="UTF-8"> 
	<meta name="viewport"
		content="width=device-width,initial-scale=1.0"> 
	 <link rel="stylesheet" href= 
"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"> 
        
	
</head> 
<style>
    /*style.css */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}


body { 
	margin: 0; 
	display: flex; 
	align-items: center; 
	justify-content: space-around; 
	flex-direction: column; 
	height: 90vh; 
        background-color: #ccccff; 
	font-family: 'Poppins', sans-serif; 

} 

.textup { 
	text-align: center; 
	color: rgb(11, 118, 11); 
	font-weight: 700; 
} 

i { 
	margin-right: 3px; 
} 

.form-box { 
	background-color: #fff; 
	box-shadow: 0 0 10px rgba(36, 67, 40, 0.8); 
	padding: 20px; 
	border-radius: 8px; 
	width: 500px; 
} 

form { 
	max-width: 400px; 
	margin: 0 auto; 
} 

.radio-group { 
	display: flex; 
	margin-bottom: 16px; 
} 

input[type="radio"] { 
	margin-right: 8px; 
} 

label { 
	display: block; 
	margin-bottom: 8px; 
	font-size: 17px; 
	color: green; 
	font-weight: 600; 
} 


input, 
textarea { 
	width: 100%; 
	padding: 8px; 
	margin-bottom: 12px; 
	box-sizing: border-box; 
	border-radius: 10px; 

} 

button { 
	background-color: #368b44; 
	color: #fff; 
	padding: 10px; 
	border: none; 
	border-radius: 25px; 
	cursor: pointer; 
	width: 100%; 
	font-size: 15px; 
	transition: .8s linear; 
} 

button:hover { 
	background-color: #0a6808; 
	border: none; 
	ransform: translateY(-10px); 
} 

h1 { 
	color: green; 
}

</style>
<body> 
      
      <%
      
    
       
     String nm=null;
     String emid=null;
    String yc=null;
   // String c=null;
    String mob=null;
    // nm=request.getParameter("txtanm"); 
     
   //  emid=request.getParameter("txtemail");     
    // yc=request.getParameter("dryc");
     
     
 
%>
	<h1>Feedback</h1> 
	
	<div class="form-box"> 
		<div class="textup"> 
			<i class="fa fa-solid fa-clock"></i> 
			It only takes two minutes!! 
		</div> 
		<form> 
               
			<label for="uname"> 
				<i class="fa fa-solid fa-user"></i> 
				Name 
			</label> 
			<input type="text" id="uname"
				name="txtanm" required> 

			<label for="email"> 
				<i class="fa fa-solid fa-envelope"></i> 
				Email Address 
			</label> 
			<input type="email" id="email"
				name="txtemail" required> 

			<label for="phone"> 
				<i class="fa-solid fa-phone"></i> 
				Phone No 
			</label> 
			<input type="tel" id="phone"
				name="txtephone" required> 


			<label for="msg"> 
				<i class="fa-solid fa-comments"
				style="margin-right: 3px;"></i> 
				Write your Suggestions: 
			</label> 
			<textarea id="msg" name="dryc"
					rows="4" cols="10" required> 
			</textarea> 
			
                        <button type="submit"> Submit</button>
            
                       
                        <%
     nm=request.getParameter("txtanm"); 
     emid=request.getParameter("txtemail");
     mob=request.getParameter("txtephone");
     yc=request.getParameter("dryc");   
                                     Statement st1=con.createStatement();
                                    
                                     if(nm!=null && nm!="" && emid!=null && emid!="" && mob!=null && mob!="" && yc!="" && yc!=null)
                                     {
                                         String strl="insert into feedback(name,email,Mob,you_com)values('"+nm+"','"+emid+"',"+mob+",'"+yc+"')";
                                         
                                         int b=st1.executeUpdate(strl);
                                         out.println("<script>alert(' information added Success....')</script>");
                                       
                                         
                                     }
                            
                                     %>
                
		</form> 
	</div> 
</body> 

</html>

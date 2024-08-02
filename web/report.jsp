<%-- 
    Document   : MainHomePage
    Created on : 23 Feb, 2024, 12:38:23 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Voting</title>
    <link rel="stylesheet" href="css/style1.css" />
    <style>
        .dropdown{
            display:inline-block;
        }
        .dropdown-content{
            display: none;
            position:absolute;
            background-color: white;
            min-width: 160px;
            z-index: 1;
            font-weight: normal; 
        }
        .dropdown-content a{
            color:black;
            padding:12px 16px;
            text-decoration: none;
            display: block;
            text-align: left;
            
        }
        .dropdown-content a:hover{
            font-weight: bold
            
        }
        .dropdwon:hover.dropdown-content{
            display: block;
        }
    </style>
  </head>
  <body>
    <header>
      <header>
        <div class="logo">
            <a><img src="images/logo1.png" alt="logo" /></a>
        </div>
        <nav class="nav-menu">
          <ul>
              <li><a href="AdHomepage.jsp">Home</a></li><br><br>
              
             
                 
                  
                      <li><a href="registrationreport.jsp">registration</a></li><br><br>
                     <li> <a href="candidateinforeport.jsp">candidateinfo</a></li><br><br>
                     <li> <a href="Confirmsignreport.jsp">confirm candidate sign</a></li><br><br>
                     <li> <a href="feedbackreport.jsp">feedback</a></li><br><br>
                      
                  </div>
                  
              <li><a href="MainHomePage.jsp"></a></li>
                  
              </li>
           
              
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
      <section id="destinations" class="destinations">
        <h2>E-Voting</h2>
        <div class="destination-grid">
          <div class="destination-item">
              <img src="images/A11.png" alt="" />
              <h3>"Voting Shapes the Future of Our Country."</h3>
              
          
          </div>
          <div class="destination-item">
            <img src="images/sp.jpg" alt="" />
            <h3> "Every Single Vote is significant."</h3>
            
          </div>
          <div class="destination-item">
              <img src="images/vote3.jpg" alt="" />
            <h3> "voting is an investment in the future."</h3>
           
          </div>
        </div>
      </section>
      <section id="hotels" class="destinations">
        <h2> Future of our Nation </h2>
        <div class="destination-grid">
          <div class="destination-item">
            <img src="images/A10.png"alt="" />
            <h3> "voting is an exercise in self-respect."</h3>
            
          </div>
          <div class="destination-item">
            <img src="images/on1.jpg" alt="" />
            <h3>"voting is a responsibility as a citizen."</h3>
           
          </div>
          <div class="destination-item">
            <img src="images/A4.png" alt="" />
            <h3>"voting is a symbol of freedom."</h3>
            
          </div>
        </div>
      </section>
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

      <section id="about" class="about">
          <h3>About Our E-Voting</h3><br>
        <p>
          An E-voting is a platform that allows organizational members to cast their votes electronically, which can be through a website, mobile app,
        or any internet-connected device.
        </p>
        <div class="team-members">
          
          <div class="team-member">
            <img src="images/pp10.jpg" width="1000px"/>
           
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

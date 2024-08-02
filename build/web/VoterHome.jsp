<%-- 
    Document   : AdHomepage
    Created on : 21 Feb, 2024, 12:12:24 PM
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
  </head>
  <body>
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
            <img src="images/pm32.jpg" alt="Hero image" />
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
        <h3>About Our E-Voting</h3>
        <p>
          An E-voting is a platform that allows organizational members to cast their votes electronically, which can be through a website, mobile app,
        or any internet-connected device.
        </p>
        <div class="team-members">
          
          <div class="team-member">
            <img src="images/pp10.jpg" alt=""  width="1000"/>
           
          </div>
          
        </div>
      </section>
      <section id="contact" class="contact">
        <h3>Contact Us</h3>
        <div class="contact-info">
          <p>
          <h2> If you have any queries or feedback regrading the e-voting Website you may mail or contact us  </h2>
          </p>
          <ul>
            <li>
              <i class="fas fa-map-marker-alt"></i>karad,Maharastra-415111
            </li>
            <li>
              <i class="fas fa-envelope"></i
              ><a href="mailto:info@travelcompany.com"
                >pp7730292@gmail.com</a
              >
            </li>
            <li>
              <i class="fas fa-phone-alt"></i
              ><a href="tel:555-123-4567">8010087291</a>
            </li>
          </ul>
           <ul>
            <li>
              <i class="fas fa-map-marker-alt"></i>karad,Maharastra-415111
            </li>
            <li>
              <i class="fas fa-envelope"></i
              ><a href="mailto:info@travelcompany.com"
                >mansipatil1101@gmail.com</a
              >
            </li>
            <li>
              <i class="fas fa-phone-alt"></i
              ><a href="tel:555-123-4567">7385471101</a>
            </li>
          </ul>
        </div>
        <form action="#" class="form">
          <div class="form-group">
            <input
              type="name"
              name="name"
              id="name"
              placeholder="Enter Your Name"
            />
          </div>
          <div class="form-group">
            <input
              type="email"
              name="email"
              id="email"
              placeholder="Enter Your Email"
            />
          </div>
          <div class="form-group">
            <textarea
              name="textarea"
              id="textarea"
              cols="30"
              rows="10"
              placeholder="Message"
            ></textarea>
          </div>
          <button type="submit">Send Message</button>
        </form>
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

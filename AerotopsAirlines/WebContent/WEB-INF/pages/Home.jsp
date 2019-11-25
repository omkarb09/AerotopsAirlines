<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <style>
       .footer 
    {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        height: 6%;
        background-color: black;
        color: white;
        text-align: center;
    }
  </style>
<title>Home Page</title>

</head>
<body>

 <jsp:include page="NavBar.jsp" /> 

<div class="container">
  <h2 style="text-align: center;font-family: Arial;">AeroTOPS Airlines</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="slide1.jpg" alt="1" style="width:100%;height: 400px;">
        <div class="carousel-caption">
          
        </div>
      </div>

      <div class="item">
        <img src="slide22.jpg" alt="2" style="width:100%; height: 400px;">
        <div class="carousel-caption">
         
        </div>
      </div>
    
      <div class="item">
        <img src="slide454.jpg" alt="3" style="width:100%; height: 400px">
        <div class="carousel-caption">
          
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

<div class="container">
        <h4 style="text-align: center;font-family:">Welcome to Online Flight Reservation System.
             This is a simple ticket booking system 
                ThiOur purpose is to 
                stimulate the basic concepts of airline reservation system. The system enables the customer 
                to do the things such as search for airline flights for two travel cities on a specified date,
                 choose a flight based on the details, reservation of flight and cancellation of reservation.
        </h4>

</div>
<jsp:include page="footer.jsp" />  
</body>
</html>
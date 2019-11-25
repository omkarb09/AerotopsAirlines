<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>SuccessfulUserlogin</title>
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
</head>
<body>
	<jsp:include page="NavBarWithUserLogout.jsp" /> 
	<h2>UserLogin successful</h2>
	<h2>Welcome ${sessionScope.email}</h2>
	
	<a href="bookingPage">Booking Page</a> | <a href="searchFlight">Search Flight</a>
	
	<jsp:include page="footer.jsp" />  
</body>
</html>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Error page</title>
</head>
<body>
<jsp:include page="NavBar.jsp" /> 
<h2>Oops! Something went wrong.</h2>
<h2>Sorry for the inconvenience, there has been a glitch. </h2><br>
<h3><a href="loginSignUpPage">Click here</a>to carry on your task </h3> 
  <jsp:include page="footer.jsp" /> 
</body>
</html>
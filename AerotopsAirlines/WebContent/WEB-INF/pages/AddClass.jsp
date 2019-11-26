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
<title>Welcome Admin !!</title>
<style type="text/css">
  <%@include file="/resources/css/AddFlight.css" %>
</style>
</head>
<body>
<jsp:include page="NavBar.jsp" /> 

  <div class="container">
                    <div style="text-align:center">
                        <h2>Add Class</h2>
                </div>
<h3>Enter Class Details For Flight No. ${sessionScope.flight.flightId} Here :</h3>
 <div class="column">
<form action="addClass.do" method="post">
		
				<label for="classType">Enter details for First Class :</label>
				<input type="hidden" name="classTypeFC" value="FC">
				<br><br>
			
			    <label for="BaseFareFirst">Base Fare For First Class:</label>
				<input type="number" name="baseFareFC">
			
			     <label for="MaxSeatsinFirst">Maximum Seats For First Class:</label>
				 <input type="number"  name="maxseatsFC" min="1" max="2">
				
			
			    <label for="AvlSeatsinFirst">Available Seats For First Class:</label>
				<input type="number" name="availseatsFC" min="1" max="2">
				
			
				<label for="classType">Enter details for Buisness Class :</label>
				<input type="hidden" name="classTypeBC" value="BC">
				<br><br>
			
			    <label for="BaseFareBusiness">Base Fare For Buisness Class:</label>
				<input type="number" name="baseFareBC">
				
			
			    <label for="MaxSeatsinBusiness">Maximum Seats For Buisness Class:</label>
				<input type="number"  name="maxseatsBC" min="1" max="5">
				
			
			    <label  for="AvlSeatsinBusiness">Available Seats For Buisness Class:</label>
				<input type="number" name="availseatsBC" min="1" max="5">
				
			
				 <label for="classType">Enter details for Economy Class :</label>
				<input type="hidden" name="classTypeEC" value="EC">
				<br>
				<br>
			
		
			    <label for="BaseFareEco"> Base Fare For Economy Class:</label>
				<input type="number" name="baseFareEC">
				
			
			    <label for="MaxSeatsinEconomy"> Maximum Seats For Economy Class:</label>
				 <input type="number"  name="maxseatsEC" min="1" max="5">
				
			
			    <label  for="AvlSeatsinEconomy">Available Seats For Economy Class:</label>
				<td><input type="number" name="availseatsEC" min="1" max="5"></td>
				
		<input type="submit" value="Add CLass">

	</form>
	</div>
	 <jsp:include page="footer.jsp" /> 
</body>
</html>


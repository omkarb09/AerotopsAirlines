<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin !!</title>
</head>
<body>
<h3>Enter Class Details For Flight No. ${sessionScope.flight.flightId} Here :</h3>
<form action="addClass.do" method="post">
	<table>
				<tr>
				<td> <label for="classType">Enter details for First Class :</td>
				<td><input type="hidden" name="classTypeFC" value="FC"></td><br>
			</tr>
	
	        
			
			<tr>
			    <td>Base Fare For First Class:
				<td><input type="number" name="baseFareFC"></td>
				
			</tr>
			
			<tr>
			    <td>Maximum Seats For First Class:
				<td> <input type="number"  name="maxseatsFC" min="1" max="2"></td>
				
			</tr>
			<tr>
			    <td>Available Seats For First Class:
				<td><input type="number" name="availseatsFC" min="1" max="2"></td>
				
			</tr>  
			
			
			<tr>
				<td> <label for="classType">Enter details for Buisness Class :</td>
				<td><input type="hidden" name="classTypeBC" value="BC"></td><br>
			</tr>
	
	        
			
			<tr>
			    <td>Base Fare For Buisness Class:
				<td><input type="number" name="baseFareBC"></td>
				
			</tr>
			
			<tr>
			    <td>Maximum Seats For Buisness Class:
				<td> <input type="number"  name="maxseatsBC" min="1" max="5"></td>
				
			</tr>
			<tr>
			    <td>Available Seats For Buisness Class:
				<td><input type="number" name="availseatsBC" min="1" max="5"></td>
				
			</tr>  
			
				
			<tr>
				<td> <label for="classType">Enter details for Economy Class :</td>
				<td><input type="hidden" name="classTypeEC" value="EC"></td><br>
			</tr>
	
	        
			
			<tr>
			    <td>Base Fare For Economy Class:
				<td><input type="number" name="baseFareEC"></td>
				
			</tr>
			
			<tr>
			    <td>Maximum Seats For Economy Class:
				<td> <input type="number"  name="maxseatsEC" min="1" max="5"></td>
				
			</tr>
			<tr>
			    <td>Available Seats For Economy Class:
				<td><input type="number" name="availseatsEC" min="1" max="5"></td>
				
			</tr>  
			<tr>
				<td><input type="submit" value="Add CLass"></td>
			</tr>
		</table>
	</form>
</body>
</html>


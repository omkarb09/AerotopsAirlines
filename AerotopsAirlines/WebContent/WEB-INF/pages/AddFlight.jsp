<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin !!</title>
</head>
<body>
<h3>Enter Add Flights Details Here</h3>
<form action="addFlight.do" method="post">
	<table>
			<tr>
				<td>From</td>
				<td>
				<select name="from">
   					 <option value="Mumbai">Mumbai</option>
    				<option value="Pune">Pune</option>
   					 <option value="Jaipur">Jaipur</option>
   					 <option value="Udaipur">Udaipur</option>
  				</select>
				</td>
			</tr>
			 <tr>
				<td>To</td>
				<td><select name="to">
   					 <option value="Mumbai">Mumbai</option>
    				<option value="Pune">Pune</option>
   					 <option value="Jaipur">Jaipur</option>
   					 <option value="Udaipur">Udaipur</option>
  				</select>
  				</td>
			</tr>
			
			<tr>
			<td>Departure Time</td>
			<td><input type="time" name="departureTime"></td>
			</tr>
			
			 <tr>
				<td>Arrival Time</td>
				<td><input type="time" name="arrivalTime"></td>
			</tr>
			<tr>
				
			<tr>
				<td>Date Of Departure</td>
				<td><input type="date" name="dateOfDeparture"></td>
			</tr>
			
			<tr>
				<td>Date Of Arrival</td>
				<td><input type="date" name="dateOfArrival"></td>
			</tr> 
			
			<tr>
				<td>Flight Status</td>
				<td><select name="flightStatus">
   					 <option value="Available">Available</option>
   					 <option value="Cancelled">Cancelled</option>
  				  </select>
  				</td><br>
			</tr>
		 
			<tr>
				<td><input type="submit" value="Add Flight"></td>
			</tr>
		</table>
	</form>
</body>
</html>


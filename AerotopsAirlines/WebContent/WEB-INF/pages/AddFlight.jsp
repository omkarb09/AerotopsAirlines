
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>HomePage</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <title>Add Flight</title>
    <style type="text/css">
  <%@include file="/resources/css/AddFlight.css" %>
</style>
 
 
</head>
<body>
        <jsp:include page="NavBar.jsp" /> 
              <div class="container">
                    <div style="text-align:center">
                        <h2>Add Flight</h2>
                </div>
                <div class="column">
                        <form action="addFlight.do" method="post">

                                <label for="flightId">Flight Id</label>
                                <input type="text" name="flightId" required>

                                <label for="source">From</label>
                                <select name="from">
                                        <option value="Mumbai">Mumbai</option>
                                        <option value="Pune">Pune</option>
                                        <option value="Jaipur">Jaipur</option>
                                        <option value="Udaipur">Udaipur</option>
                                  </select>
                                  <label for="destination">To</label>
                                  <select name="to">
                                        <option value="Mumbai">Mumbai</option>
                                    <option value="Pune">Pune</option>
                                        <option value="Jaipur">Jaipur</option>
                                        <option value="Udaipur">Udaipur</option>
                                  </select>
                                  <label for="departure_time">Departure Time</label>
                                  <input type="time" name="departureTime">

                                  <label for="Arrival Time">Arrival Time</label>
                                  <input type="time" name="arrivalTime">

                                  <label for="dept_date">Date Of Departure</label>
                                  <input type="date" name="dateOfDeparture">

                                  <label for="arrv_date">Date Of Arrival</label>
                                  <input type="date" name="dateOfArrival">

                                  <label for="flight_status">Flight Status</label>
                                  <select name="flightStatus">
                                        <option value="Available">Available</option>
                                        <option value="Cancelled">Cancelled</option>
                                    </select>
                                  
                                    <label for="classType">Enter details for First Class :</label>
                                    <input type="hidden" name="classType" value="FC">
                                    <br>
                                    <br>
                                   
                                    <label for="classId">Class Id :</label>
                                    <input type="text" name="classId">

                                    <label for="BaseFareforFirstclass">Base Fare For First Class:</label>
                                    <input type="number" name="baseFare">


                                    <label for="MaxSeatsforFirstclass">Maximum Seats For First Class:</label>
                                    <input type="number"  name="maxSeats" min="1" max="2">

                                    <label for="AvlSeatsforFirstclass">Available Seats For First Class::</label>
                                    <input type="number" name="availSeats" min="1" max="2">
                                    <br>
                                    <br>
                                    <input type="submit" value="Add Flight">

                                  </form>
                                  </div>
 <jsp:include page="footer.jsp" /> 


</body>
</html>

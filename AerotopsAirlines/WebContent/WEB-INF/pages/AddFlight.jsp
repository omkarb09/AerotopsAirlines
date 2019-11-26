<<<<<<< HEAD
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
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
    <style>
        body{
        font-family: Arial, Helvetica, sans-serif;
        background-image: linear-gradient(to bottom,rgba(191, 172, 78,0.4), rgba(0,0,0,1));
      }
      * {
        box-sizing: border-box;
        
      }
        .container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 10px; 
  
  margin-bottom: 100px;
  height:100%;
  width: 800px;
}
.column {
    width: 100%;
    height: 100%;
    margin-top: 6px;
    padding: 20px;
  }

input[type=text], select, textarea, input[type=number], input[type=time], input[type=date], input[type=hidden]{
  width: 100%;
  padding: 6px;
  border: 1px solid #ccc;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}
input[type=submit] {
    background-color: rgb(7, 8, 7);
    color: white;
    padding: 8px 20px;
    border: none;
    cursor: pointer;

}
     
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
        <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <a class="navbar-brand" href="#">Website name</a>
                    <a class="navbar-brand" href="#">Home</a>
                    <a class="navbar-brand" href="#">About us</a>
                    <a class="navbar-brand" href="#">Contact us</a>
                  </div>
                    <ul class="nav navbar-nav navbar-right">
                          <li><a href="#"><span class="glyphicon glyphicon-user"></span>Log In/Sign Up</a></li>
                         
                        </ul>
                  </div>
              </nav>

              <div class="container">
                    <div style="text-align:center">
                        <h2>Add Flight</h2>
                </div>
                <div class="column">
                        <form action="addFlight.do" method="post">

   

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
                                  
                                   
                                    <br>
                                    <input type="submit" value="Add Flight">

                                  </form>
                                  </div>

              <div class="footer">
                    <p>© Larsen And Toubro Limited</p>
                  </div>
>>>>>>> branch 'master' of https://github.com/omkarb09/AerotopsAirlines
</body>
</html>

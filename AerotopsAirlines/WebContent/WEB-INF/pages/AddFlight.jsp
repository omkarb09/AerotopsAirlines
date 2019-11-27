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
    <script type="text/javascript" src="resources/js/flightDetailsValidation.js"></script>
   <script type="text/javascript">
	var cities;

	$(document).ready(function getCities()
	{
		var xhr = new XMLHttpRequest();
		xhr.open('GET','data',true);
		xhr.responseType='text';
		xhr.send();
		xhr.onload=function()
		{
			if(xhr.status==200)
			{
				cities= JSON.parse(xhr.responseText);
				var output=[], len= cities.length, i;
				
				for(i=0;i<len;i++)
				{
					output.push(cities[i].city);	
				}
				console.log(output);
				
				var fromDropDown = document.getElementById("from");
				var toDropDown = document.getElementById("to");
				for(var j=0;j<output.length;j++)
				{
					var option = document.createElement("option");
					option.text=output[j];
					option.value=output[j];
					fromDropDown.add(option);
				}
				
				for(var j=0;j<output.length;j++)
				{
					var option = document.createElement("option");
					option.text=output[j];
					option.value=output[j];
					toDropDown.add(option);
				}
			}
		}
			
	});
	
	</script>
    <style type="text/css">
  <%@include file="/resources/css/AddFlight.css" %>
</style>

</head>
<body>
        <jsp:include page="AdminNavLogOut.jsp" /> 
              <div class="container">
                    <div style="text-align:center">
                        <h2>Add Flight</h2>
                </div>
                <div class="column">
                        <form action="addFlight.do" method="post">

                             

                                <label for="source">From</label>
                                <select class="form-control" id="from" name="from" required >
	                  					<option value="">-- Select --</option>
	       						</select>
                                  <label for="destination">To</label>
		                              <select class="form-control  " id="to" name="to" onclick="removeSame()" required>
		              						<option value="">-- Select --</option>
		                				</select>
                                  <label for="departure_time">Departure Time</label>
                                  <input type="time" name="departureTime" id="deptTime" required>

                                  <label for="Arrival Time">Arrival Time</label>
                                  <input type="time" name="arrivalTime" id="arrvTime" required>

                                  <label for="dept_date">Date Of Departure</label>
                                  <input type="date" id="deptd" name="dateOfDeparture" required>

                                  <label for="arrv_date">Date Of Arrival</label>
                                  <input type="date" name="dateOfArrival" id="arrvd" onblur="compare()" required>

                                  <label for="flight_status">Flight Status</label>
                                  <select name="flightStatus">
                                        <option value="Available">Available</option>
                                        <option value="Cancelled">Cancelled</option>
                                    </select>
                                  
                                <br>
                                <br>
                                    <input type="submit" value="Add Flight" onclick="removeSame()">

                                  </form>
                                  </div>
 <jsp:include page="footer.jsp" /> 


</body>
</html>

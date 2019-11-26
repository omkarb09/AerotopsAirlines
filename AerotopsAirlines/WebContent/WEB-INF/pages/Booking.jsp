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
   <title>Booking Ticket</title>
   <script> 
   	
   
		function calculateTickets() {
		   var adult=Number(document.getElementById('adult').value);
		   
		   var child=Number(document.getElementById('child').value);
		   var infant=Number(document.getElementById('infant').value);   
		   var total=Number(adult+child+infant);
		   
		  
		   
		   
		   document.getElementById('totalTickets').value=total;
		 }
		

		function removeSame()
		{
			if(document.getElementById('sel1').value==document.getElementById('sel2').value) 
			{
			    window.alert("source and destination canot be same");
			}
			
		}
		
	</script>
	
    <style type="text/css">
  <%@include file="/resources/css/Booking.css" %>
</style>

</head>
<body>
	<jsp:include page="NavBarWithUserLogout.jsp" /> 
    <div class="container">   



        <form class="form-horizontal" action="addBooking.do" method="post">
               
            <h1 align="center"><b>Booking Information</b></h1><br>
            
            <div class="form-group">
                    <label class="control-label col-sm-5" for="sel1 ">FROM:</label>
                    <div class="col-sm-6">
                    <select class="form-control" id="sel1" name="departureFrom">
                      <option value="Mumbai">Mumbai</option>
                      <option value="Delhi">Delhi</option>
                      <option value="Chennai">Chennai</option>
                      <option value="Banglore">Banglore</option>
                    </select>
                  </div>
                    </div>

                    <div class="form-group">
                            <label class="control-label col-sm-5" for="sel1 ">TO:</label>
                            <div class="col-sm-6">
                            <select class="form-control  " id="sel2" name="arrivalTo" onclick="removeSame()">
                              <option value="Mumbai">Mumbai</option>
                              <option value="Delhi">Delhi</option>
                              <option value="Chennai">Chennai</option>
                              <option value="Banglore">Banglore</option>
                            </select>
                          </div>
                            </div>
                          
                          
             <div class="form-group">
              <label class="control-label col-sm-5" >SELECT CLASS TYPE:</label>
              <div class="col-sm-4">
                <label class="radio-inline"><input type="radio" name="classType" value="EC" checked>Economy Class</label>
                <label class="radio-inline"><input type="radio" name="classType" value="BC">Business Class</label>
                <label class="radio-inline"><input type="radio" name="classType" value="FC" checked>First Class</label>
              </div>
            </div>
                    
            
            <div class="form-group">
              <label class="control-label col-sm-5" for="email">SELECT TRIP TYPE:</label>
              <div class="col-sm-6">
                <label class="radio-inline"><input type="radio" name="tripType" value="oneway" checked>One-Way</label>
                <label class="radio-inline"><input type="radio" name="tripType" value="round">Round-Trip</label>
              </div>
            </div>
            <br>
			
			<div class="form-group">
              <label class="control-label col-sm-5" for="email">REFUNDABLE TICKET:</label>
              <div class="col-sm-6">
                <label class="radio-inline"><input type="radio" name="refundable" value="true" checked>Yes</label>
                <label class="radio-inline"><input type="radio" name="refundable" value="false">No</label>
              </div>
            </div>
            <br>
            
            <div class="form-group">
              <label class="control-label col-sm-5" for="email">BAGGAGE ABOVE 5KG:</label>
              <div class="col-sm-6">
                <label class="radio-inline"><input type="radio" name="baggage" value="true" checked>Yes</label>
                <label class="radio-inline"><input type="radio" name="baggage" value="false">No</label>
              </div>
            </div>
            <br>

             
              
                    

                    <div class="form-group">
                    		<input type='hidden' id= "totalTickets" name="totalTickets" value="" />
                            <label class="control-label col-sm-5" for="email">NUMBER OF PASSENGERS</label>
                            <div class="col-sm-7">
                              <table><tr><td>Adult</td><td>
                              <select class="form-control" id="adult">
                                  <option value="1">1</option>
                                  <option value="2">2</option>
                                  <option value="3">3</option>
                                  <option value="4">4</option>
                                  <option value="5">5</option>
                                  <option value="6">6</option>
                                  <option value="7">7</option>
                                  <option value="8">8</option>
                                  <option value="9">9</option>
                              </select></td>
                              <td></td>
                            <td>Child</td>
                        <td>
                            <select class="form-control" id="child">
                                <option value="0">0</option>
                                <option value="1">1</option>
                                 <option value="2">2</option>
                                 <option value="3">3</option>
                                 <option value="4">4</option>
                                 <option value="5">5</option>
                                 <option value="6">6</option>
                                 <option value="7">7</option>
                                 <option value="8">8</option>
                                 <option value="9">9</option>
                            </select>
                        </td>
                        <td></td>
                        <td>Infants</td>
                        <td>
                            <select class="form-control" id="infant">
                                <option value="0">0</option>
                                <option value="1">1</option>
                                 <option value="2">2</option>
                                 <option value="3">3</option>
                                 <option value="4">4</option>
                                 <option value="5">5</option>
                                 <option value="6">6</option>
                                 <option value="7">7</option>
                                 <option value="8">8</option>
                                 <option value="9">9</option>
                            </select>
                        </td></tr></table>
                            </div>
                          </div>

                          <div class="form-group">
                                <div class="col-sm-offset-5 col-sm-3">
                                
                                      <input type="submit" class="btn btn-primary" value="Submit" onclick="calculateTickets()">
                                        
                                </div></div>
        </form>
        </div>
         <jsp:include page="footer.jsp" />    
</body>
</html>
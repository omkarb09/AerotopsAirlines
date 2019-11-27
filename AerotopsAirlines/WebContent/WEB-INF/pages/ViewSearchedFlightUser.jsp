<%@ page errorPage="Error.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Flight</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <style type="text/css">
  <%@include file="/resources/css/ViewFlight.css" %>
</style>
 </head>
<body>
<jsp:include page="AdminNavLogOut.jsp" />
  <div class="container">
                    <div style="text-align:center">
                        <h2>Select Flight</h2>
                </div>
 <div class="column"> 
	<table  class="table table-striped">
		<tr>
			<th>Flight Id </th>
			<th>From   </th>
			<th>To   </th>
			<th>  Departure Date   </th>
			<th> Departure Time    </th>
			<th>  Arrival Date   </th>
			<th> Arrival Time    </th>
			<th> Status </th>
			<th> Select </th>
	
		</tr>
		<c:forEach var="fli" items="${ requestScope.selflightlist }">
			<c:url var="selectedFlight" value="selectedFlight.do">
				<c:param name="flightId" value="${ fli.flightId }"/>
				<c:param name="from" value="${ fli.from }"/>
				<c:param name="to" value="${ fli.ro }"/>
			</c:url>
			<tr>
				<td><c:out value="${ fli.flightId}"/></td>
				<td><c:out value="${ fli.from}"/></td>
				<td><c:out value="${ fli.to}"/></td>
				<td><c:out value="${ fli.dateOfDeparture}"/></td>
				<td><c:out value="${ fli.departureTime}"/></td>
				<td><c:out value="${ fli.dateOfArrival}"/></td>	
				<td><c:out value="${ fli.arrivalTime}"/></td>	
				<td><c:out value="${ fli.flightStatus}"/></td>	
				<td><a href='<c:out value="${ selectedFlight }"/>'>Select</a></td>			
			</tr>
		</c:forEach> 
		
	</table>
	</div>
	
	 <jsp:include page="footer.jsp" /> 
</body> 
</html>








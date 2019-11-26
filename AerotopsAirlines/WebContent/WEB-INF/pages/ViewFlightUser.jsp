<%@ page errorPage="Error.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Flight</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 </head>
<body>

<jsp:include page="NavBar.jsp" /> 
	
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
	
		</tr>
		<c:forEach var="fli" items="${ requestScope.flightlist }">
			
			<tr>
				<td><c:out value="${ fli.flightId}"/></td>
				<td><c:out value="${ fli.from}"/></td>
				<td><c:out value="${ fli.to}"/></td>
				<td><c:out value="${ fli.dateOfDeparture}"/></td>
				<td><c:out value="${ fli.departureTime}"/></td>
				<td><c:out value="${ fli.dateOfArrival}"/></td>	
				<td><c:out value="${ fli.arrivalTime}"/></td>	
				<td><c:out value="${ fli.flightStatus}"/></td>				
			</tr>
		</c:forEach> 
		
	</table>
	 <jsp:include page="footer.jsp" /> 
</body> 

</html>



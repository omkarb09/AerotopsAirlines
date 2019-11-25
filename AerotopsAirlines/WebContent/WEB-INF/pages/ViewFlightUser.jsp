<%@ page errorPage="Error.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>


 </head>
<body>
	<table>
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
</body> 





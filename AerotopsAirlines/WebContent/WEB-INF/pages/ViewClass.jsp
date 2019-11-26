<%@ page errorPage="Error.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Display Page</title>
</head>
<body>
	<table>
		<tr>
			<th>Class Id </th>
			<th>Class Type   </th>
			<th>Base Fare   </th>
			<th> Max Seats   </th>
			<th>  Available Seats   </th>
			
	
		</tr>
		<c:forEach var="fliclass" items="${ requestScope.flightclasslist }">
			
			<tr>
				<td><c:out value="${ fliclass.classId}"/></td>
				<td><c:out value="${ fliclass.classType}"/></td>
				<td><c:out value="${ fliclass.baseFare}"/></td>
			    <td><c:out value="${ fliclass.maxseats}"/></td>
				<td><c:out value="${ fliclass.availseats}"/></td>
								
			</tr>
		</c:forEach>
	</table>
</body>
</html>



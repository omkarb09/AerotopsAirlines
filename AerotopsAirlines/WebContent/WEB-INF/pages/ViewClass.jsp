<%@ page errorPage="Error.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Display Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="NavBar.jsp" /> 
	<table class="table table-striped">
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
	 <jsp:include page="footer.jsp" /> 
</body>
</html>



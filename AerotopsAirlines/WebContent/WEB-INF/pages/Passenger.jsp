<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Passenger Information</title>
</head>
<body>
<jsp:include page="NavBarWithUserLogout.jsp" /> 
    <div class="container">   

        <form class="form-horizontal" action="addPassenger.do" method="get">

            <h1 align="left"><b>Passenger Details</b></h1>
            <%-- ${sessionScope.seat} --%>
            
   
            <div class="form-group">

                    <div class="col-sm-6">
                    <c:forEach var="j" begin="1" end="${sessionScope.noOfSeats}">  
						<br>
					   Passenger <c:out value="${j}"/> name :
					   <input type="text" class="form-control" id="${j}" name="${j}" required><br> 
					   
					</c:forEach> 
					
                  </div>
                    </div>

              <div class="form-group">
                    <div class=" col-sm-3">

                          <input type="submit" class="btn btn-primary" value="Submit" onclick="saveData(${sessionScope.noOfSeats})">

                    </div></div>
        </form>
        </div>
         <jsp:include page="footer.jsp" /> 
</body>
</html>
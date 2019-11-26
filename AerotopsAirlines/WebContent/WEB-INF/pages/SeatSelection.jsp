<%@ page errorPage="Error.jsp" %>
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
<title>Insert title here</title>
<script type="text/javascript">
	<%-- function saveData() {
		<%String []str = new String[(int)session.getAttribute("noOfSeats")]; %>
		for(int i=0;i<<%session.getAttribute("noOfSeats")%>;i++)
		{
			var x =document.getElementById();
		}
	} --%>
</script>
<title>Insert title here</title>
</head>
<body>

<jsp:include page="NavBarWithUserLogout.jsp" /> 
    <div class="container">   

        <form class="form-horizontal" action="" method="post">

            <h1 align="left"><b>Seat Selection</b></h1>
            <%-- ${sessionScope.seat} --%>
            <div class="form-group">

                    <div class="col-sm-6">
                    <c:forEach var="j" begin="1" end="${sessionScope.noOfSeats}">  
						<br>
					   Passenger <c:out value="${j}"/>
					   <select class="form-control" id="${j}" name="${j}">
							<c:forEach var="seats" items="${ sessionScope.seat }">
								<option value="${seats.seatName}">${seats.seatName}</option>
							</c:forEach> 
						</select>
					</c:forEach> 
                  </div>
                    </div>

              <div class="form-group">
                    <div class=" col-sm-3">

                          <input type="submit" class="btn btn-primary" value="Submit" onclick="saveData()">

                    </div></div>
        </form>
        </div>
         <jsp:include page="footer.jsp" /> 

</body>
</html>
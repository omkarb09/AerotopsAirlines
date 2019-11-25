<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="/resources/css/Home.css">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="NavBar.jsp" /> 
    <h2>Enough tickets available</h2>

	<h3>Total fare : ${sessionScope.fare}</h3>
      
    <div class="container">
        <form class="form-horizontal" id="login" action="getSeats.do" method="get">
               


            <div class="form-group">
                    <div class="col-sm-offset-5 col-sm-5">
                      <input type="submit" class="btn btn-primary" value="Seat Selection">
                      
                    </div>
            </div>



            </form>
            </div>

            <jsp:include page="footer.jsp" />  
</body>
</html>
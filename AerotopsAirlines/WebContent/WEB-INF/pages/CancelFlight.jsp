<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <title>Cancel FLight</title>
</head>
  <style type="text/css">
  <%@include file="/resources/css/CancelFlight.css" %>
</style>

<body>
       <jsp:include page="AdminNavLogOut.jsp" /> 
              <div class="container">
                    <div style="text-align:center">
                        <h3>Enter Flight Details To Cancel Flight Here : </h3>
                        </div>
                        <div class="column"></div>
                        <form action="cancelFlight.do" method="post">
                           
                                <label for="flightId">Flight Id</label>
                                    <input type="text" name="flightId">
                                
                                <input type="submit" value="Cancel Flight">
                                
                            
                        </form>
                        </div>
                        
                        </div>
                     
                                 <jsp:include page="footer.jsp" />    
                            
</body>
</html>
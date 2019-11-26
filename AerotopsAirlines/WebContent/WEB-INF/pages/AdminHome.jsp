
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>HomePage</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <title>Admin Home</title>
    
<style type="text/css">
  <%@include file="/resources/css/AdminHome.css" %>
</style>
 
</head>
<body>
        <jsp:include page="AdminNavLogOut.jsp" /> 
    
    <h2><b>Admin Page</b></h2>
    <div class="container">
              <div style="float: left">
    <button class="btn1"><a href="addFlightPage">Add Flight</a></button></div>
    
                <div style="float: right">
    <button class="btn1"><a href="cancelFlightPage">Cancel Flight</a> </button></div></div>

        <jsp:include page="footer.jsp" />  
</body>
</html>

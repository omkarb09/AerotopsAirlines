<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style type="text/css">
  <%@include file="/resources/css/ForgotPass.css" %>
</style>
<title>Forgot password</title>
</head>
<body>

<jsp:include page="NavBar.jsp" />  
<div class="container">
                <div style="text-align:center">
                    <h2>Forgot Password</h2>
                    
           
            </div>
 <div class="column">
 <form id="login" action="forgotPassword.do" method="post">
              <label class="control-label col-sm-3" for="uname">Enter your Email:</label>
              
                <input type="text" class="form-control" id="emailid" name="emailId" required placeholder="Enter user ID or email id">
              <br><br><br><br>
               <input type="submit" class="btn btn-primary" value="Submit">
              
              
 </form>
 </div>
 </div>
  <jsp:include page="footer.jsp" />    
 
</body>
</html>
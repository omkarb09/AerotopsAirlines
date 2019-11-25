<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot password</title>
</head>
<body>
 
 <form class="form-horizontal" id="login" action="forgotPassword.do" method="post">
               
               <h2 align="center">Forgot Password</h2><br>
            <div class="form-group">
              <label class="control-label col-sm-3" for="uname">Please enter your Email:</label>
              <div class="col-sm-7">
                <input type="text" class="form-control" id="emailid" name="emailId" required placeholder="Enter user ID or email id">
              </div>
                                    <input type="submit" class="btn btn-primary" value="Submit">
              
              </div>
 </form>
  <jsp:include page="footer.jsp" />    
 
</body>
</html>
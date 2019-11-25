<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <title>User LogIn</title>
     <style type="text/css">
  <%@include file="/resources/css/LogIn.css" %>
</style>
</head>
<body>

    <jsp:include page="NavBar.jsp" /> 
    
      
    <div class="container">
        <form class="form-horizontal" id="login" action="validateUserLogin.do" method="post">
               
               <h2 align="center">User Login</h2><br>
            <div class="form-group">
              <label class="control-label col-sm-3" for="uname">Email:</label>
              <div class="col-sm-7">
                <input type="text" class="form-control" id="emailid" name="emailId" required placeholder="Enter user ID or email id">
              </div>
            </div>

            <div class="form-group">
              <label class="control-label col-sm-3" for="pwd">Password:</label>
              <div class="col-sm-7">
                <input type="password" class="form-control" id="pwd" name="pwd" required placeholder="Enter password">
              </div>   
            </div><br>

            <div class="form-group">
                    <div class="col-sm-offset-5 col-sm-5">
                            <a href="#link" class="linkFP" role="button"> Forgot Password?</a>
                    </div>
            </div>
            <br>
            <br>


            <div class="form-group">
                    <div class="col-sm-offset-5 col-sm-5">
                      <input type="submit" class="btn btn-primary" value="Login">
                      <a href="addUserPage" class="btn btn-primary " role="button"> Sign up</a>
                    </div>
            </div>



            </form>
            </div>

            <jsp:include page="footer.jsp" />  
     </body>
</html>
           

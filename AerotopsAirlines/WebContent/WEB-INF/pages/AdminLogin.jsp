<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <title>Document</title>
   
      
      </script>
    <style type="text/css">
  <%@include file="/resources/css/AdminLogin.css" %>
</style>
</head>
<body>
 <jsp:include page="AdminNav.jsp" />
    
      
    <div class="container">
        <form class="form-horizontal" action="validateLogin"  >
               
            <h2 align="center">Admin Login</h2><br>
            <div class="form-group">
              <label class="control-label col-sm-3" for="uname">Username:</label>
              <div class="col-sm-7">
                <input type="text" class="form-control" id="uname" name="uname" placeholder="Enter Username" required>
                
              </div>
            </div>

            <div class="form-group">
              <label class="control-label col-sm-3" for="pwd">Password:</label>
              <div class="col-sm-7">
                <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter password" required>
              </div>   
            </div>

           
            <div class="form-group">
                    <div class="col-sm-offset-5 col-sm-5">
                            <a href="#link" class="linkFP" role="button"> Forgot Password?</a>
                    </div>
            </div><br>
           
            <div class="form-group">
              <div class="col-sm-offset-5 col-sm-5">
                <button type="submit" class="btn btn-primary">Login</button>
                <a href="#link" class="btn btn-primary " role="button"> Sign up</a>
                    </div></div>
               <!-- <a href="#link" class="linkFP" role="button"> Forgot Password?</a>
              </div>-->
            </div><br><br>
          </form>
          
    </div>
     <jsp:include page="footer.jsp" /> 
      
    
    </body>
    </html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <style>
    
  body{
    text-align: center;
  }
.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 10px; 
  margin-top: 80px;
  height: 500px;
  height:80%;
  width: 60%;
}
    .btn1{
        background-color: rgb(7, 8, 7);
        padding: 8px 20px;
        border: none;
        cursor: pointer;
        
     
    }
    a{
        text-decoration: none;
        color: aliceblue;
    }
    a:hover{
        text-decoration: none;
        color: aliceblue;

    }
    a:active{
        text-decoration: none;
        color: aliceblue;
    }
    a:visited{
        text-decoration: none;
        color: aliceblue;
    }
       .footer 
    {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        height: 6%;
        background-color: black;
        color: white;
        text-align: center;
    }
    </style>
</head>
<body>
        <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <a class="navbar-brand" href="#">Website name</a>
                    <a class="navbar-brand" href="#">Home</a>
                    <a class="navbar-brand" href="#">About us</a>
                    <a class="navbar-brand" href="#">Contact us</a>
                  </div>
                    <ul class="nav navbar-nav navbar-right">
                          <li><a href="#"><span class="glyphicon glyphicon-user"></span>Log In/Sign Up</a></li>
                         
                        </ul>
                  </div>
              </nav>
    <h2>Welcome ${sessionScope.uname}  To Aerotops Airlines !!</h2>
    <div class="container">
              <div style="float: left">
    <button class="btn1"><a href="addFlightPage">Add Flight</a></button></div>
    
                <div style="float: right">
    <button class="btn1"><a href="cancelFlightPage">Cancel Flight</a> </button></div></div>

        <div class="footer">
                <p>© Larsen And Toubro Limited</p>
              </div>
</body>
</html>



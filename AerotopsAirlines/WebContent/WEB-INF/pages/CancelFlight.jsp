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
<style>
  
    .container {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 10px; 
        margin-bottom: 100px;
        height:100%;
        width: 800px;
        }

        input[type=text]{
            width: 100%;
  padding: 6px;
  border: 1px solid #ccc;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;

        }
     input[type=submit] {
    background-color: rgb(7, 8, 7);
    color: white;
    padding: 8px 20px;
    border: none;
    cursor: pointer;
    margin-left: 300px;

}
.column {
    width: 100%;
    height: 100%;
    margin-top: 6px;
    padding: 20px;
 
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
</style>
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
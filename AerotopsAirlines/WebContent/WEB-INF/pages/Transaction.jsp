<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Transaction Page</title>
</head>
<body>


<jsp:include page="NavBarWithUserLogout.jsp" /> 
    <div class="container">   



        <form class="form-horizontal" action="addTransaction.do" method="post">
            
               
            <h1 align="center"><b>Transaction Page</b></h1><br>
             
            <div class="form-group">
              <label class="control-label col-sm-3" for="uname">Total Amount :</label>
              <div class="col-sm-7">
                <input type="number" class="form-control" id="uname" name="amount" value="${sessionScope.fare}"  readonly="readonly">        
              </div>
            </div>
            
            
            <div class="form-group">
              <label class="control-label col-sm-3" for="uname">Enter Account Number :</label>
              <div class="col-sm-7">
                <input type="number" class="form-control" id="uname" name="userAcc" placeholder="Account Number" required>        
              </div>
            </div>
          
         <div class="form-group">
               <div class="col-sm-offset-5 col-sm-3">
               
                     <input type="submit" class="btn btn-primary" value="Submit" >
                       
               </div></div>
        </form>
        </div>
         <jsp:include page="footer.jsp" />    


</body>
</html>
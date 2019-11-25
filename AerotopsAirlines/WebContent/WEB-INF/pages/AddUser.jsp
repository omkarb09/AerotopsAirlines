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
<title>User Registration</title>
<script type="text/javascript" src="resources/js/validation.js"></script>
 <style type="text/css">
  <%@include file="/resources/css/AddUser.css" %>
</style>
</head>
<body>
  <jsp:include page="NavBar.jsp" /> 
    
    <div class="container">   
            <form name="registration" class="form-horizontal" action="addUser.do"  method="post" >
                 <h3 align="center"><b>User Registration Page</b></h3><br>
			<div class="form-group">
			<label class="control-label col-sm-5" for="sel1 ">Title:</label>
				<div class="col-sm-6">
					<select class="form-control  " id="sel1" name="title">
						<option value="Mr">Mr.</option>
						<option value="Ms">Ms.</option>
						<option value="Mrs">Mrs.</option>
					</select>
				</div>
			</div><br>
			
			<div class="form-group">
			<label class="control-label col-sm-5" for="fname">First Name</label>
			<div class="col-sm-7">
			<input type="text" class="form-control" id="fname" name="firstName" required placeholder="Enter first name">
			</div>
			</div>
			
			<div class="form-group">
			<label class="control-label col-sm-5" for="lname">Last Name</label>
			<div class="col-sm-7">
			<input type="text" class="form-control" id="lname" name="lastName" required placeholder="Enter last name">
			</div>   
			</div>
			
			<div class="form-group">
			<label class="control-label col-sm-5" for="email">Email Id</label>
			<div class="col-sm-7">
			    <input type="email" class="form-control" id="email" name="email" required placeholder="e.g., abc@xyz.com">
			</div>   
			</div>

			<div class="form-group">
		    <label class="control-label col-sm-5" for="pwd">Password</label>
		    <div class="col-sm-7">
		        <input type="password" class="form-control" id="pwd" name="password" pattern="(?=.*\d)(?=.*[@,#,*,&])(?=.*[a-z])(?=.*[A-Z]).{8,16}" required 
						placeholder="Password" title="Must contain at least one number and one uppercase and lowercase letter and 1 special character and 1 number, and 8 to 16 characters" />
		    </div>   
		    </div>
		
		    <div class="form-group">
		        <label class="control-label col-sm-5" for="pwd">Confirm Password</label>
		        <div class="col-sm-7">
		             <input type="password" class="form-control" id="cpwd" required name="cpwd" onchange="validatePassword()"> 
		        </div> 
		        <label id="valid"></label>  
		        </div>
		
		        <div class="form-group">
		            <label class="control-label col-sm-5" for="sel1">Date Of Birth:</label>
		            <div class="col-sm-7">
		            <input type="date" name="dateOfBirth" required>
		        </div>
		    </div>
		
		    <div class="form-group">
		            <label class="control-label col-sm-5" for="pwd">Phone Number</label>
		            <div class="col-sm-7">
		                <input type="text" class="form-control" id="phone" name="phoneNumber" pattern="[0-9]{10}" required placeholder="Enter Phone Number">
		            </div>   
		            </div>

            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-3">
                        
                        <input type="submit" class="btn btn-info" role="button" value="Submit">
                </div></div>
                
                <jsp:include page="footer.jsp" /> 
            </form></div>
</body>
</html>
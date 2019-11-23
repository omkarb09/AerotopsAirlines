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
<style>
    .btn-info,
    .btn-info:hover,
    .btn-info:active,
    .btn-info:visited,
    .btn-info:focus 
    {
        background-color: rgb(0, 0, 0);
        border-color: rgb(0, 0, 0);
    }
    .linkFP,
    .linkFP:hover,
    .linkFP:active,
    .linkFP:visited,
    .linkFP:focus 
    {
        text-decoration: none;
        color: rgb(41, 6, 138);
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
    .col-sm-6{
        width:100px;
    }
    .col-sm-7{
       
        width:200px;
        text-align: center;
   
    }
    
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
			<input type="text" class="form-control" id="fname" name="firstName" placeholder="Enter first name">
			</div>
			</div>
			
			<div class="form-group">
			<label class="control-label col-sm-5" for="lname">Last Name</label>
			<div class="col-sm-7">
			<input type="text" class="form-control" id="lname" name="lastName" placeholder="Enter last name">
			</div>   
			</div>
			
			<div class="form-group">
			<label class="control-label col-sm-5" for="email">Email Id</label>
			<div class="col-sm-7">
			    <input type="email" class="form-control" id="email" name="email" placeholder="e.g., abc@xyz.com">
			</div>   
			</div>

			<div class="form-group">
		    <label class="control-label col-sm-5" for="pwd">Password</label>
		    <div class="col-sm-7">
		        <input type="password" class="form-control" id="pwd" name="password" required
					maxlength="8" size="15" placeholder="Password" />
		    </div>   
		    </div>
		
		    <div class="form-group">
		        <label class="control-label col-sm-5" for="pwd">Confirm Password</label>
		        <div class="col-sm-7">
		            <input type="password" class="form-control" id="cpwd" name="cpwd" >
		        </div>   
		        </div>
		
		        <div class="form-group">
		            <label class="control-label col-sm-5" for="sel1 ">Date Of Birth:</label>
		            <div class="col-sm-7">
		            <input type="date" name="dateOfBirth">
		        </div>
		    </div>
		
		    <div class="form-group">
		            <label class="control-label col-sm-5" for="pwd">Phone Number</label>
		            <div class="col-sm-7">
		                <input type="text" class="form-control" id="phone" name="phoneNumber" placeholder="Enter Phone Number">
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
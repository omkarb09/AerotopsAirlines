<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
    body {
  font-family: Arial, Helvetica, sans-serif;
  background-image: linear-gradient(to bottom,rgbA(191, 172, 78,1), rgba(0,0,0,1));
}
* {
  box-sizing: border-box;
  
}


input[type=text], select, textarea {
  width: 100%;
  padding: 6px;
  border: 1px solid #ccc;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}
input[type=email]{
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
}
.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 10px; 
  
  margin-bottom: 100px;
  height:650px;
  width: 800px;
}
.column {
    width: 100%;
    height: 50%;
    margin-top: 6px;
    padding: 20px;
  }
.row:after {
  content: "";
  display: table;
  clear: both;
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
<title>Contact Us</title>
</head>
<body>
	 <jsp:include page="NavBar.jsp" /> 

            <div class="container">
                <div style="text-align:center">
                    <h2>About Us</h2>
                    <p>We are always here for you</p>
           
            </div>
         
            <div class="column">
                    <form action="/action_page.php" class="form1">
                      <label for="fname">First Name</label>
                      <input type="text" id="fname" name="firstname" placeholder="Your name.." required>
                      <label for="lname">Last Name</label>
                      <input type="text" id="lname" name="lastname" placeholder="Your last name..">
                      <labe>Email</label>
                        <input type="email" id="email" name="email" placeholder="email" required>
                        <labe>Phone Number</label>
                            <input type="text" id="phno" name="phno" placeholder="phno" required>
                      <label for="subject">Subject</label>
                      <textarea id="subject" name="subject" placeholder="Write something.." style="height:80px"></textarea>
                      <input type="submit" value="Submit">
                    </form>
                  </div>
                </div>
           <jsp:include page="footer.jsp" />  

</body>
</html>
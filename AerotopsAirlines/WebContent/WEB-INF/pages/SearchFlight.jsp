<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="searchFlight.do" method="POST">
<table>
<tr><td>Source<td>

	<td>				
  <select class="form-control  " id="from" name="from">
                 <option value="Mumbai">Mumbai</option>
                 <option value="Delhi">Delhi</option>
                 <option value="Chennai">Chennai</option>
                 <option value="Banglore">Banglore</option>
                </select>
    </td>
    
 </tr>
 
 <tr><td>destination<td>

	<td>				
  <select class="form-control  " id="to" name="to">
                <option value="Mumbai">Mumbai</option>
                 <option value="Delhi">Delhi</option>
                 <option value="Chennai">Chennai</option>
                 <option value="Banglore">Banglore</option>
                 <option value="Goa">Goa</option>
                </select>
    </td>
    
 </tr>
 
 <tr><td><input type="submit" value="SEARCH"></td></tr>
</table>
</form>

</body>
</html>
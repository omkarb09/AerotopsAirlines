<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
<script type="text/javascript">
	var cities;

	$(document).ready(function getCities()
	{
		var xhr = new XMLHttpRequest();
		xhr.open('GET','http://localhost:9000/AerotopsAirlines/data',true);
		xhr.responseType='text';
		xhr.send();
		xhr.onload=function()
		{
			if(xhr.status==200)
			{
				cities= JSON.parse(xhr.responseText);
				var output=[], len= cities.length, i;
				
				for(i=0;i<len;i++)
				{
					output.push(cities[i].city);	
				}
				console.log(output);
				
				var fromDropDown = document.getElementById("from");
				var toDropDown = document.getElementById("to");
				for(var j=0;j<output.length;j++)
				{
					var option = document.createElement("option");
					option.text=output[j];
					option.value=output[j];
					fromDropDown.add(option);
				}
				
				for(var j=0;j<output.length;j++)
				{
					var option = document.createElement("option");
					option.text=output[j];
					option.value=output[j];
					toDropDown.add(option);
				}
			}
		}
			
	});
	
	
	function removeSame()
	{
		if(document.getElementById('from').value==document.getElementById('to').value) 
		{
		    window.alert("source and destination canot be same");
		}
		
	}
</script>

</head>
<body>
	<form action="searchFlight.do" method="POST">
	<table>
	<tr><td>Source<td>
	
		<td>				
	  <select class="form-control" id="from" name="from" >
	                  <option value="">-- Select --</option>
	       
	                </select>
	    </td>
	    
	 </tr>
 
 <tr><td>destination<td>

	<td>				
  <select class="form-control  " id="to" name="to" onclick="removeSame()">
                <option value="">-- Select --</option>
                </select>
    </td>
    
 </tr>
 
 <tr><td><input type="submit" value="SEARCH"></td></tr>
</table>
</form>

</body>
</html>
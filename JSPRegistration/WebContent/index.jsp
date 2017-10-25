<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterServlet" method="post">

		Enter RollNumber:<input type="text" name="id"><br/>
		Enter UserName:<input type="text" name="username"> <br/>
		Enter Password:<input type="password" name="password"> <br/>
		Enter City:<input type="text" name="city"><br/>
		Enter Zip:<input type="text"name="zip"> 
		
		<input type="submit" value="Submit">

	</form>
</body>
</html>
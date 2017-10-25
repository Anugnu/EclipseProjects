<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
You have been successfully Logged Out.
<%session.invalidate(); %>

<a href="/Struts1_Reg_Log">Click Here</a> to go back to Home Page.

Thank You for your Support.

</body>
</html>
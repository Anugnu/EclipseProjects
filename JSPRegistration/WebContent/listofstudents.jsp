<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>City</th>
			<th>Zip</th>
		</tr>

		<%
			ArrayList studentsList = ArrayList session.getAttribute("STUDENTS_LIST");
			Iterator iterator = studentsList.iterator();

			while (iterator.hasNext()) {
				Student student = (Student) iterator.next();
		%>

		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getCity()%></td>
			<td><%=student.getZip()%></td>
		</tr>
		<%
			}
%>

	</table>

</body>
</html>
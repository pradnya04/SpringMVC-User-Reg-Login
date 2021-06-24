<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${user.getFirstname()}</td>
			<td>${user.getLastname()}</td>
		</tr>
		<tr>
			<td>Address:- ${user.getAddress()}</td>
		</tr>
		<tr>
			<td>Department:- ${user.getDepartment()}</td>
		</tr>
		<tr>
			<td>Skills:- ${user.getSkills().toString()}</td>
		</tr>
		<tr>
			<td>City:- ${user.getCity()}</td>
		</tr>
		<tr>
			<td>Employee type:- ${user.getEmployeeType()}</td>
		</tr>
		<tr>
		
		<tr>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>
		<tr>
		<td></td>
		
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
</head>
<body>
<table>
<tr><th>FirstName</th><th>LastName</th><th>Address</th><th>Department</th><th>Skills</th><th>Employee Type</th>
<th>City</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${users}" var="user">  
  <tr> 
    <td>${user.getFirstname()}</td> 
    <td>${user.getLastname()}</td>  
    <td>${user.getAddress()}</td> 
    <td>${user.getDepartment()}</td> 
    <td>${user.getSkills()}</td> 
    <td>${user.getEmployeeType()}</td> 
    <td>${user.getCity()}</td> 
    <td><a href="edit/${user.getUsername()}">Edit</a></td>
    <td><a href="delete/${user.getUsername()}">Delete</a></td>
    
  </tr> 
</c:forEach>
		</table>
</body>
</html>
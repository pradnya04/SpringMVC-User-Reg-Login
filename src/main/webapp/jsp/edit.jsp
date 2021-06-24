<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<form:form id="editForm" modelAttribute="user" action="edit/edit-user"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username" readonly="true" /></td>
			</tr>
			<tr>
				<td><form:label path="firstname">FirstName</form:label></td>
				<td><form:input path="firstname" name="firstname"
						id="firstname" /></td>
			</tr>
			<tr>
				<td><form:label path="lastname">LastName</form:label></td>
				<td><form:input path="lastname" name="lastname" id="lastname" /></td>
			</tr>
			<tr>
				<td><form:label path="department">Department</form:label></td>
				<td><form:input path="department" name="department" id="department" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><form:label path="skills">Skills</form:label></td>
				<td><input type="checkbox" name="skills" value="Java">Java<BR></td>
				<td><input type="checkbox" name="skills" value="Microsoft">Microsoft<BR></td>
				<td><input type="checkbox" name="skills" value="Oracle">Oracle<BR></td>
			</tr>
			 <tr>
               <td><form:label path = "city">City</form:label></td>
               <td>
                  <form:select path = "city">
                     <form:option value = "NONE" label = "Select"/>
                     <option value="pune">Pune</option>
    				 <option value="mumbai">Mumbai</option>
  				     <option value="nashik">Nashik</option> 					 
                     
                  </form:select>     	
               </td>
            </tr>  
            <tr>
				<td><form:label path="employeeType">Employee type:</form:label></td>
				<td><input type="radio" name="employeeType" value="Permanent">Permanent<BR></td>
				<td><input type="radio" name="employeeType" value="Temporary">Temporary<BR></td>
			</tr> 
			

			<tr>
				<td></td>
				<td><form:button id="save" name="save">Save</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="/springmvc-user-reg-login/home.jsp">Home</a></td>			
				<td></td>
				<td><a href="/springmvc-user-reg-login/admin">Admin</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
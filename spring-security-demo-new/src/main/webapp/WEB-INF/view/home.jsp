<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

<h2> Welcome to  the Home Page</h2>

	<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
				
	<input type="submit" value="Logout" />
	
	</form:form>
</body>
</html>
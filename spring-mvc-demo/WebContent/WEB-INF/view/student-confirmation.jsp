<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation</title>
</head>

	<body>
		<br><br>
		The student is confirmed : ${student.firstName} ${student.lastName}
		<br><br>
		Country : ${student.country}
		<br><br>
		Postal Code : ${student.postalCode}
		<br><br>
		Favorite Language : ${student.favoriteLanguage}
		<br><br>
		
		Operating Systems :
		<ul>
		
		<c:forEach var="temp" items="${student.operatingSystems}" >
			<li> ${temp}</li>
			</c:forEach>
		</ul>
		<br><br>
		Free Pass Requirement : ${student.freePass}
		<br><br>
		
	</body>

</html>
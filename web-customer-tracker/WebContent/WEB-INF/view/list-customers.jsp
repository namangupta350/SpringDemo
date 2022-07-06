<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>

	<h2> List Customers    </h2>
	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		
		<div id="content">
		
			<!--  add out html table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Name</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customer}" >
				
				<tr>
					<td>${tempCustomer.firstname}</td>
					<td>${tempCustomer.lastname}</td>
					<td>${tempCustomer.email}</td>
				</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
		
	</div>
	
</body>
</html>
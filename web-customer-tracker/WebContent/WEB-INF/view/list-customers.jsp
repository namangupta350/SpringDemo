<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>

<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

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
		
		<!-- Adding home Button -->
		
		<input value="Home" type="button" 
			onclick="window.location.href='list'; return false;"
			class="add-button"
			/>
		
		<!-- adding button -->
		<input value="Add New" type="button" 
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"
			/>
		
			
			 <!--  add a search box -->
            <form:form action="search" method="GET">
                Search customer: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>
		
			<!--  add out html table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Name</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}" >
				
				<!-- Update link -->
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId"  value="${tempCustomer.id}" />
 				</c:url>
 				
 				<!-- delete link -->
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId"  value="${tempCustomer.id}" />
 				</c:url>
				
				<tr>
					<td>${tempCustomer.firstName}</td>
					<td>${tempCustomer.lastName}</td>
					<td>${tempCustomer.email}</td>
					<td>
						<a href="${updateLink}" >Update</a>
						|
						<a href="${deleteLink}" 
						onclick="if(!(confirm('Are you sure want to delete this customer?'))) return false">Delete</a>
					</td>
				</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
		
	</div>
	
</body>
</html>
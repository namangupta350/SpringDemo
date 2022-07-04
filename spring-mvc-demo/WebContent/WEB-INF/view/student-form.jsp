<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style >
	.error{color:red}
</style>
</head>
<body>
<i> Asterisk (*) is mandatory to fill</i>
		<form:form   action="processForm" modelAttribute="student" >
		
		<br><br>
		First Name : <form:input path="firstName"/> 
		<br><br>
		Last Name(*) : <form:input path="lastName"/> 
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		Country :                                                                                                                                                                                           
		<form:select  path="country">
		<br><br>
		
			<form:option value="France" label="France" /> 
			<form:option value="Germany" label="Germany" />
			<form:option value="Brazil" label="Brazil" />
			<form:option value="India" label="India" /> 
			
			<form:options items="${theCountryOptions}" />
			
		</form:select>
		<br><br>
		Pin Code : <form:input path="postalCode"/> 
		<form:errors path="postalCode" cssClass="error"/>
		
		<br><br>
		
		Favorite language :
		
		Java : <form:radiobutton path="favoriteLanguage" value="Java" />
		C#  :<form:radiobutton path="favoriteLanguage" value="C#" />
		PHP  :<form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby  :<form:radiobutton path="favoriteLanguage" value="Ruby" />
		
		<br><br>
		Operating systems : 
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		
		<br><br>
		
		Free Pass(*) : <form:input path="freePass"/> 
		<form:errors path="freePass" cssClass="error"/>
		
		<br><br>
		<input type="submit" value="Submit" />
		<br><br>
		</form:form>  

</body>
</html>
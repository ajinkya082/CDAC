<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
	 	<%--Loading the bean of type Person with ID:pers from session scope --%>
		<jsp:useBean id="pers" class="example.beans.Person" scope="session"/>
		<h2>Person Details:</h2>
		<h2>Name: <jsp:getProperty property="name" name="pers"/></h2>
		<h2>Height (cm): <jsp:getProperty property="height" name="pers"/></h2>
		<h2>Weight (kg): <jsp:getProperty property="weight" name="pers"/></h2>
		
	</body>
</html>
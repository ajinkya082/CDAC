<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<%--Demonstrating some implicit objects --%>
		<%--Obtaining session ID --%>
		<%
			String sessionId=session.getId();
		%>
		<%--Obtaining our slogan from application specific object --%>
		<%
			Object slogan=application.getAttribute("ourSlogan");
		%>
		<%--Displaying session ID and slogan --%>
		<%
			out.println("<h2>Session Id : "+sessionId+" </h2>");
			out.println("<h2>Slogan Is : "+slogan+" </h2>");
		%>
	</body>
</html>
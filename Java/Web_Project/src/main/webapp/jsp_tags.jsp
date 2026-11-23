<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate,java.time.LocalTime" %>
<!DOCTYPE html>
<html>
	<body>
		<%--Including the resources : demo.html --%>
		<%@ include file="demo.html" %>
		<h2>Welcome to JSP tags demonstration...</h2>
		
		<%--Declaring a variable and defining an variable  --%>
		<%!
			int num=7;
			public String sayWelcome(String name){
				return "Welcome " + name; 
			}
		%>
		<h2>Num = <%=num %></h2>
		<h2>Square of <%=num %> is <%=(num*num) %> </h2>
		<h2>Is <%=num %> &lt; 9 ?<%=(num<9) %></h2>
		<h2>The method is saying <%=sayWelcome("Jack") %></h2>
		
		<%--Printing hello 5 times H1 element --%>
		<%
			for(int i=1;i<=5;i++){
			
		%> 
		<h1>Hello</h1>
		<%
			}
		%>
		
		<%--Displaying today's date and local time using two classes local date and local time --%>
		<%
			LocalDate today=LocalDate.now();
			LocalTime now=LocalTime.now();
		%>
		<h2>Todays date is <%=today %></h2>
		<h2>Current Time is <%=now %></h2>
		
		
		
		
		
		
		
		
		
		
		
		
		
	</body>
</html>
<%@page contentType= "text/html; charset=UTF-8" %>

<%
String message = request.getParameter("message");
%>

<html>
	<head>
		<title>practice0904</title>
	</head>
	<body>
		<%= message %>
	</body>
</html>
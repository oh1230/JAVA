<%@page contentType= "text/html; charset=UTF-8" %>

<%
String message = request.getParameter("message");
%>

<html>
	<head>
		<title>転送先を動的に変化させるプログラム</title>
	</head>
	<body>
		エラーです。<br>
	<%= message %>
	</body>
</html>
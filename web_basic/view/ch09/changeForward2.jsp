<%@page contentType= "text/html; charset=UTF-8" %>

<%
String strNum = request.getParameter("strNum");
%>

<html>
	<head>
		<title>転送先を動的に変化させるプログラム</title>
	</head>
	<body>
		入力された数字は「<%= strNum %>」です。
	</body>
</html>
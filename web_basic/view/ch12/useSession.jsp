<%@page contentType = "text/html; charset=UTF-8" %>

<%
String title = (String)session.getAttribute("bookTitle");
%>

<html>
	<head>
		<title>セッションを利用したプログラム</title>
	</head>
	<body>
		<%= title %>
	</body>
</html>
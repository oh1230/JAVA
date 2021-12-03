<%@page contentType= "text/html; charset=UTF-8" %>

<%
String bookTitle = (String)request.getAttribute("bookTitle");
%>

<html>
	<head>
		<title>リクエストスコープを利用したプログラム</title>
	</head>
	<body>
		本の名前：<%= bookTitle %>
	</body>
</html>
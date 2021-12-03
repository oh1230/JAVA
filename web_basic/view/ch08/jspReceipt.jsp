<%@page contentType= "text/html; charset=UTF-8" %>

<%
	String name = request.getParameter("onamae");
%>

<html>
	<head>
		<title>送信データを扱うJSP</title>
	</head>
	<body>
		お名前は<%= name %>さんですね。
	</body>
</html>

<%@page contentType= "text/html; charset=UTF-8" %>

<%
String job = request.getParameter("job");
%>

<html>
	<head>
		<title>practice0902</title>
	</head>
	<body>
		職業は「<%= job %>」なのですね。
	</body>
</html>
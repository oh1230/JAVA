<%@page contentType = "text/html; charset=UTF-8" %>
<%@page import = "java.util.ArrayList" %>

<%
request.setCharacterEncoding("UTF-8");
String msg = (String)request.getAttribute("msg");
%>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<%= msg %>
	</body>
</html>
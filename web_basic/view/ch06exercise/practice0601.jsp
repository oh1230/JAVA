<%@page contentType = "text/html; charset=UTF-8" %>
<%@page import = "java.util.Date, java.text.SimpleDateFormat" %>

<%
	Date objDate = new Date();
	SimpleDateFormat objFormat = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
	String nowDate = objFormat.format(objDate);
%>

<html>
	<head>
		<title>practice0601</title>
	</head>
	<body>
		今日は<%= nowDate %>です。
	</body>
</html>
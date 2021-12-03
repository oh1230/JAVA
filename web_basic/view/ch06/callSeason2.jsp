<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="ch03.Season"%>

<%
Season objSea = new Season();
String seasonName = objSea.getSeason();
%>

<html>
	<head>
		<title>インポートを行うJSP</title>
	</head>
	<body>
		季節は<%= seasonName %>です。
	</body>
</html>
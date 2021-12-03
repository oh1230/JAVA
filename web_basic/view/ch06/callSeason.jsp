<%@page contentType= "text/html; charset=UTF-8" %>
<%@page import = "ch03.Season" %>

<html>
	<head>
		<title>インポートを行うJSP</title>
	</head>
	<body>
		<%
		Season objSea = new Season();
		String seasonName = objSea.getSeason();
		out.println("季節は" + seasonName + "です。");
		%>
	</body>
</html>
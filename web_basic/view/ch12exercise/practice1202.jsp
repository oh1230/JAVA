<%@page contentType = "text/html; charset=UTF-8" %>

<%
String job = (String)session.getAttribute("job");
%>

<html>
	<head>
		<title>practice1202</title>
	</head>
	<body>
		職業は「<%= job %>」なのですね。<br>
		<form action="<%= request.getContextPath() %>/view/ch12exercise/practice1201.jsp" method="get">
			<input type="submit" value="戻る">
		</form>
	</body>
</html>
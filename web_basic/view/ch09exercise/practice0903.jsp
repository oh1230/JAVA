<%@page contentType= "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>practice0903</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/Practice0902Servlet" method="get">
			あなたの職業はなんですか？<br>
			<input type="text" name="job">
			<input type="submit" value="送信">
		</form>
	</body>
</html>
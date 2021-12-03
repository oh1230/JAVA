<%@page contentType= "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>practice0802</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/Practice0802Servlet" method="post">
			あなたの職業はなんですか？<br>
			<input type="text" name="job">
			<input type="submit" value="送信">
		</form>
	</body>
</html>
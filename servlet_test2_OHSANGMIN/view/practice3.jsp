<%@page contentType = "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>フォームからのGET送信</h2>
		<form action="<%= request.getContextPath() %>/practice3" method="get">
			<input type="hidden" name="cmd" value="get">
			<input type="submit" value="送信">
		</form>
		<h2>フォームからのPOST送信</h2>
		<form action="<%= request.getContextPath() %>/practice3" method="post">
			<input type="hidden" name="cmd" value="post">
			<input type="submit" value="送信">
		</form>
		<h2>リンクからの送信</h2>
		<a href="<%= request.getContextPath() %>/practice3?cmd=link">送信</a>
	</body>
</html>
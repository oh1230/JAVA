<%@page contentType = "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>GET送信データを扱うサーブレット</title>
	</head>
	<body>
		<h2>GET送信フォーム</h2>
		<form action="<%= request.getContextPath() %>/GetReceiptServlet" method="get">
			お名前：<input type="text" name="onamae">
				<input type="submit" name="送信">
		</form>
	</body>
</html>
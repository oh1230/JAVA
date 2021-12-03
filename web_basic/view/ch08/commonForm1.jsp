<%@page contentType = "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>送信データを扱うサーブレット</title>
	</head>
	<body>
		<h2>POST送信フォーム</h2>
		<form action="<%= request.getContextPath() %>/CommonReceiptServlet1" method="post">
			お名前：<input type="text" name="onamae">
				<input type="submit" value="送信">
		</form>
		<h2>GET送信フォーム</h2>
		<form action="<%= request.getContextPath() %>/CommonReceiptServlet1" method="get">
			お名前：<input type="text" name="onamae">
				<input type="submit" value="送信">
		</form>
		<a href="<%= request.getContextPath() %>/CommonReceiptServlet1?onamae=kanda">リンクで送信</a>
	</body>
</html>
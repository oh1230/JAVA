<%@page contentType = "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>POST送信データを扱うサーブレット</title>
	</head>
	<body>
		<h2>POST送信フォーム</h2>
		<form action="<%= request.getContextPath() %>/PostReceiptServlet" method="post">
			お名前：<input type="text" name="onamae">
				<input type="submit" value="送信">
		</form>
	</body>
</html>
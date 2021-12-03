<%@page contentType= "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>送信データを扱うJSP</title>
	</head>
	<body>
		<h2>POST送信フォーム</h2>
		<form action="jspReceipt.jsp" method="post">
			お名前：<input type="text" name="onamae">
				<input type="submit" value="送信">
		</form>
		<h2>GET送信フォーム</h2>
		<form action="jspReceipt.jsp" method="get">
			お名前：<input type="text" name="onamae">
				<input type="submit" value="送信">
		</form>
	</body>
</html>
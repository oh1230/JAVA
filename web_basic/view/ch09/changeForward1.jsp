<%@page contentType= "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>転送先を動的に変化させるプログラム</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/ChangeForwardServlet">
			数字を入力してください<br>
			<input type="text" name="num"><br>
			<input type="submit" value="送信">
		</form>
	</body>
</html>
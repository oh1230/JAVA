<%@page contentType= "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>入力チェックを行わないプログラム</title>
	</head>
	<body>
		<h2>POST送信フォーム</h2>
		<form action="<%= request.getContextPath() %>/AdditionReceiptServlet1" method="get">
			1つ目の数字：<input type="text" name="num1"><br>
			2つ目の数字：<input type="text" name="num2"><br>
					<input type="submit" value="計算">
		</form>
	</body>
</html>
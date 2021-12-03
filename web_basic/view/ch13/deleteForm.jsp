<%@page contentType = "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>データを削除する</title>
	</head>
	<body>
		<div style="text-align:center">
			<h2 style="text-align:center">削除ID入力画面</h2>
			<hr style="height:3; background-color:#0000FF" />
			<br>
			削除するIDを入力してください。
			<form action="<%=request.getContextPath() %>/DeleteServlet">
				<input type="text" name="id">
				<input type="submit" value="削除">
			</form>
			<br>
		</div>
	</body>
</html>
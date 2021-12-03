<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>従業員の削除</h2>
		<form action="<%=request.getContextPath() %>/delete">
			削除対象ID: <input type="text" name="id"><br>
			<input type="submit" value="削除">
		</form>
	</body>
</html>
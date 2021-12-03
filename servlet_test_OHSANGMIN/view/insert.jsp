<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>従業員の登録</h2>
		<form action="<%=request.getContextPath() %>/insert">
			ID: <input type="text" name="id"><br>
			名前： <input type="text" name="name"><br>
			年齢： <input type="text" name="age"><br>
			店舗：
			<input type="radio" name="store" value="神田店">神田店
			<input type="radio" name="store" value="東京店">東京店<br>
			<input type="submit" value="登録">
		</form>
	</body>
</html>
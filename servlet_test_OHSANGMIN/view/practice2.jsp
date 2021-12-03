<%@page contentType = "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>色々なフォームからの送信</h2>
		<form action="./result2.jsp" method="POST">
			<p>
				回答者<input type="text" name="respondent"><br>
			</p>
			<p>
				性別
				<select name="gender">
				<option value="男">男性</option>
				<option value="女">女性</option>
				<option value="その他">その他</option>
				</select><br>
			</p>
			<p>
				好物
				<input type="checkbox" name="favorite" value="野菜">野菜
				<input type="checkbox" name="favorite" value="魚">魚
				<input type="checkbox" name="favorite" value="肉">肉
			</p>
			<p>
				その他コメント
				<textarea name="memo" rows="5" cols="40"></textarea>
			</p>
			<input type="submit" value="送信">
		</form>
	</body>
</html>
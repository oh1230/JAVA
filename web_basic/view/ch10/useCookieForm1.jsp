<%@page contentType = "text/html; charset=UTF-8" %>

<%
String user = "";
String pass = "";

Cookie[] userCookie = request.getCookies();
String error = (String)request.getAttribute("error");

if (userCookie != null) {
	for (int i = 0; i < userCookie.length; i++) {
		if (userCookie[i].getName().equals("user")) {
			user = userCookie[i].getValue();
		}
		if (userCookie[i].getName().equals("pass")) {
			pass = userCookie[i].getValue();
		}
	}
}

if (error == null) {
	error = "";
}
%>

<html>
	<head>
		<title>クッキーを利用したプログラム</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/UseCookieFormServlet" method="post">
			<table>
				<tr>
					<th>ユーザー</th>
					<td><input type="text" name="user" value=<%= user %>></td>
				</tr>
				<tr>
					<th>パスワード</th>
					<td><input type="password" name="password" value=<%= pass %>></td>
				</tr>
			</table>
			<table>
				<tr>
					<td><input type="submit" value="ログイン"></td>
				</tr>
			</table>
		</form>
		<%= error %>
	</body>
</html>
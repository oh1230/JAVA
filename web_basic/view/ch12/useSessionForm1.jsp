<%@page contentType = "text/html; charset=UTF-8" %>

<%
String name = (String)session.getAttribute("name");
String age = (String)session.getAttribute("age");
String sex = (String)session.getAttribute("sex");

if (name == null) {
	name = "";
}
if (age == null) {
	age = "";
}
%>

<html>
	<head>
		<title>セッションを破棄するプログラム</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/UseSessionFormServlet1" method="get">
			お名前：
			<input type="text" name="name" value=<%= name %>><br>
			年齢：
			<input type="text" name="age" value=<%= age %>><br>
			性別：
			<% if (sex == null || sex.equals("男性")) {%>
				<input type="radio" name="sex" value="男性" checked>男性
				<input type="radio" name="sex" value="女性">女性<br>
			<% } else { %>
				<input type="radio" name="sex" value="男性">男性
				<input type="radio" name="sex" value="女性" checked>女性<br>
			<% } %>
			<input type="submit" value="送信">
		</form>
	</body>
</html>
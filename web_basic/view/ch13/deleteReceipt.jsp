<%@page contentType = "text/html; charset=UTF-8" %>

<%
Integer count = (Integer)request.getAttribute("count");
String error = (String)request.getAttribute("error");
%>


<html>
	<head>
		<title>データを削除する</title>
	</head>
	<body>
		<div style="text-align:center">
			<h2 style="text-align:center">削除結果画面</h2>
			<hr style="height:3; background-color:#0000FF" />
			<br>
			<%= error %>
			<% if (count != null) { %>
				<%= count %>件のデータを削除しました。
			<% } %>
			<br>
		</div>
	</body>
</html>
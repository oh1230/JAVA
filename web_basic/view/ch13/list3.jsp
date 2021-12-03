<%@page contentType = "text/html; charset=UTF-8" %>
<%@page import="ch13.AccountInfo"%>


<%
AccountInfo account = (AccountInfo)request.getAttribute("account");
String error = (String)request.getAttribute("error");
%>

<html>
	<head>
		<title>1件のデータを表示する</title>
	</head>
	<body>
		<div style="text-align:center">
			<h2 style="text-align:center">1件のデータを表示するプログラム</h2>
			<hr style="height:3; background-color:#0000FF" />
			<br>
			<%= error %>
			<table style="margin:0 auto">
				<tr>
					<th style="background-color:#6666FF; width:100">ID</th>
					<th style="background-color:#6666FF; width:100">名前</th>
					<th style="background-color:#6666FF; width:250">アドレス</th>
					<th style="background-color:#6666FF; width:100">権限</th>
				</tr>
				<%
				if(account != null){
				%>
				<tr>
					<td style="text-align:center; width:100"><%= account.getId() %></td>
					<td style="text-align:center; width:100"><%= account.getName() %></td>
					<td style="text-align:center; width:250"><%= account.getEmail() %></td>
					<td style="text-align:center; width:100"><%= account.getAuthority() %></td>
				</tr>
				<%
				}
				%>
			</table>
			<br>
		</div>
	</body>
</html>
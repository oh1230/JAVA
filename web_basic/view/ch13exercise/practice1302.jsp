<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="ch13exercise.PracticeInfo"%>

<%
PracticeInfo info = (PracticeInfo)request.getAttribute("info");
String error = (String)request.getAttribute("error");
%>

<html>
	<head>
		<title>practice1302</title>
	</head>
	<body>
		<div style="text-align:center">
			<h2 style="text-align:center">詳細画面</h2>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<%= error %>
			<br>
			<table style="border:1px solid; margin:0 auto">
			<%
			if (info != null) {
			%>
				<tr>
					<th style="background-color:#6666FF; width:100">ID</th>
					<td style="align:center; width:200"><%= info.getId() %></td>
				</tr>
				<tr>
					<th style="background-color:#6666FF; width:100">名前</th>
					<td style="align:center; width:200"><%= info.getName() %></td>
				</tr>
				<tr>
					<th style="background-color:#6666FF; width:100">価格</th>
					<td style="align:center; width:200"><%= info.getPrice() %></td>
				</tr>
				<tr>
					<th style="background-color:#6666FF; width:100">著者</th>
					<td style="align:center; width:200"><%= info.getAuthor() %></td>
				</tr>
				<tr>
					<th style="background-color:#6666FF; width:100; height:50">コメント</th>
					<td style="align:center; width:200; height:50"><%= info.getComment() %></td>
				</tr>
			<%
			}
			%>
			</table>
			<br>
		</div>
	</body>
</html>
<%@page contentType = "text/html; charset=UTF-8" %>
<%@page import = "java.util.ArrayList, ch13.AccountInfo" %>

<%
ArrayList<AccountInfo> list = (ArrayList<AccountInfo>)request.getAttribute("list");
String error = (String)request.getAttribute("error");
%>

<html>
	<head>
		<title>絞込みデータを表示する</title>
	</head>
	<body>
		<div style="text-align:center">
			<h2 style="text-align:center">絞込みデータを表示する</h2>
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
				if (list != null) {
					for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td style="text-align:center; width:100">
						<A href="<%= request.getContextPath() %>/SelectServlet3?id=<%= list.get(i).getId() %>">
						<%= list.get(i).getId() %></A>
					</td>
					<td style="text-align:center; width:100"><%= list.get(i).getName() %></td>
					<td style="text-align:center; width:250"><%= list.get(i).getEmail() %></td>
					<td style="text-align:center; width:100"><%= list.get(i).getAuthority() %></td>
				</tr>
				<%
					}
				}
				%>
			</table>
			<br>
		</div>
	</body>
</html>
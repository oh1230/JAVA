<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,ch13exercise.PracticeInfo"%>

<%
ArrayList<PracticeInfo> list = (ArrayList<PracticeInfo>)request.getAttribute("list");
String error = (String)request.getAttribute("error");
%>

<html>
	<head>
		<title>practice1301</title>
	</head>
	<body>
		<div style="text-align:center">
			<h2 style="text-align:center">一覧画面</h2>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<%= error %>
			<br>
			<table style="border:1px solid; margin:0 auto">
				<tr>
					<th style="border:1px solid; background-color:#6666FF; width:100">ID</th>
					<th style="border:1px solid; background-color:#6666FF; width:200">名前</th>
				</tr>
				<%
				if (list != null) {
					for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td style="border:1px solid; text-align:center; width:100">
						<A href="<%=request.getContextPath() %>/Practice1302Servlet?id=<%=list.get(i).getId()%>">
						<%= list.get(i).getId() %></A>
					</td>
					<td style="border:1px solid; text-align:center; width:100"><%= list.get(i).getName() %></td>
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
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="dto.Employee"%>

<%
Employee employee = (Employee)request.getAttribute("employee");
%>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>従業員の検索</h2>
		<form action="<%=request.getContextPath() %>/search">
			検索対象ID: <input type="text" name="id"><br>
			<input type="submit" value="検索">
		</form>


		<%
		if (employee != null) {
		%>
		<table>
			<tr>
				<th align="center">ID</th>
				<th align="center">名前</th>
				<th align="center">年齢</th>
				<th align="center">店舗</th>
			</tr>
			<tr>
				<td><%= employee.getId() %></td>
				<td><%= employee.getName() %></td>
				<td><%= employee.getAge() %></td>
				<td><%= employee.getStore() %></td>
			</tr>
		</table>
		<%
		}
		%>

	</body>
</html>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList,dto.Employee" %>
<%
// リクエストスコープ内の従業員リストを取得
ArrayList<Employee> empArray  = (ArrayList<Employee>)request.getAttribute("empArray");
%>
<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>従業員一覧</h2>
		<table>
			<tr>
				<th align="center">ID</th>
				<th align="center">名前</th>
				<th align="center">年齢</th>
				<th align="center">店舗</th>
			</tr>
			<%
			if(empArray != null){
				for(int i = 0; i < empArray.size(); i++){
			%>
			<tr>
				<td><%= empArray.get(i).getId() %></td>
				<td><%= empArray.get(i).getName() %></td>
				<td><%= empArray.get(i).getAge() %></td>
				<td><%= empArray.get(i).getStore() %></td>
			<%
				}
			}
			%>
		</table>
	</body>
</html>
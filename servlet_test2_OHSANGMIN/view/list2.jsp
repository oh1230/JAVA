<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList,dto.Student" %>
<%
// リクエストスコープ内の従業員リストを取得
ArrayList<Student> stuArray  = (ArrayList<Student>)request.getAttribute("stuArray");
%>
<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>学生情報一覧</h2>
		<table>
			<tr>
				<th align="center">ID</th>
				<th align="center">名前</th>
				<th align="center">年齢</th>
				<th align="center">専攻</th>
			</tr>
			<%
			if(stuArray != null){
				for(int i = 0; i < stuArray.size(); i++){
			%>
			<tr>
				<td><%= stuArray.get(i).getId() %></td>
				<td><%= stuArray.get(i).getName() %></td>
				<td><%= stuArray.get(i).getAge() %></td>
				<td><%= stuArray.get(i).getMajor() %></td>
			<%
				}
			}
			%>
		</table>
	</body>
</html>
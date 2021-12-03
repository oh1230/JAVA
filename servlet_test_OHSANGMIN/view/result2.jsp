<%@page contentType = "text/html; charset=UTF-8" %>
<%@page import = "java.util.ArrayList" %>

<%
request.setCharacterEncoding("UTF-8");
String respondent = request.getParameter("respondent");
String gender = request.getParameter("gender");
String[] favorite = request.getParameterValues("favorite");
String memo = request.getParameter("memo");
%>

<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>フォーム入力内容</h2>
		<table>
			<tr style="text-align:center">
				<th style="width:150">項目</th>
				<th style="width:150">入力内容</th>
			</tr>
			<tr>
				<td>氏名</td>
				<td><%= respondent %><td>
			</tr>
			<tr>
				<td>性別</td>
				<td><%= gender %><td>
			</tr>
			<tr>
				<td>好物</td>
				<td>
					<%
					for (int i = 0; i < favorite.length; i++) {
						out.print(favorite[i]);
						if (i != favorite.length-1) {
							out.print(" / ");
						}
					}
					%>
				<td>
			</tr>
			<tr>
				<td>その他コメント</td>
				<td><%= memo %><td>
			</tr>
		</table>
	</body>
</html>
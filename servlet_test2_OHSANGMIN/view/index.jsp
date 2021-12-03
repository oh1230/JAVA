<%@page contentType="text/html; charset=UTF-8" %>
<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>JSP理解度テスト</h2>
		<ul>
			<li>
				<a href="<%= request.getContextPath() %>/list2">
					問1 学生情報の一覧表示
				</a>
			</li>
			<li>
				<a href="./practice3.jsp">
					問2 送信方法に関する問題
				</a>
			</li>
			<li>
				<a href="./practice4.jsp">
					問3 フォームに関する問題
				</a>
			</li>
		</ul>
	</body>
</html>
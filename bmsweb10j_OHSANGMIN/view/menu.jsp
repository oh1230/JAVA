<%@page contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>書籍管理システムWeb版Ver.1.0</title>
	</head>
	<body>
		<jsp:include page="/common/header.jsp"></jsp:include>
		<div style="text-align:center">
			<h2>MENU</h2>
			<hr style="height:2; background-color:black" />
		</div>

		<div style="text-align:center">
			<a href="<%= request.getContextPath() %>/list">
				【書籍一覧】
			</a>
			<br>
			<a href="/bmsweb10j_OHSANGMIN/view/insert.jsp">
				【書籍登録】
			</a>
		</div>

		<jsp:include page="/common/footer.jsp"></jsp:include>
	</body>
</html>
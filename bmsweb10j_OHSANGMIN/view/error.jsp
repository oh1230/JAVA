<%@page contentType="text/html; charset=UTF-8"%>

<%
String error = (String)request.getAttribute("error");
%>

<html>
	<head>
		<title>書籍管理システムWeb版Ver.1.0</title>
	</head>
	<body>
		<jsp:include page="/common/header.jsp"></jsp:include>
		<div style="text-align:center">
			<h2>●●エラー●●</h2>
				<%= error %>
			<br>
			<a href="<%= request.getContextPath() %>/list">[一覧表示に戻る]</a>
		</div>
		<jsp:include page="/common/footer.jsp"></jsp:include>
	</body>
</html>
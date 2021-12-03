<%@page contentType = "text/html; charset=UTF-8" %>

<%
Integer sessionCount = (Integer)session.getAttribute("SessionCount");
Integer requestCount = (Integer)request.getAttribute("RequestCount");
%>

<html>
	<head>
		<title>有効範囲の違いを確認するプログラム</title>
	</head>
	<body>
		アクセス回数（セッション）：
		<%= sessionCount %><br>
		アクセス回数（リクエスト）：
		<%= requestCount %><br>
		<form action <%= request.getContextPath() %>/UsefulRangeServlet" method="get">
			<input type="submit" value="リロード">
		</form>
	</body>
</html>
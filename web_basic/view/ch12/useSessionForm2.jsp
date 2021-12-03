<%@page contentType = "text/html; charset=UTF-8" %>

<%
String name = (String)session.getAttribute("name");
String age = (String)session.getAttribute("age");
String sex = (String)session.getAttribute("sex");
%>

<html>
	<head>
		<title>セッションを破棄するプログラム</title>
	</head>
	<body>
		お名前：<%= name %><br>
		年齢：<%= age %><br>
		性別：<%= sex %><br>

		<form action="<%= request.getContextPath() %>/UseSessionFormServlet2" method="get">
			<input type="submit" value="セッションを破棄して戻る">
		</form>
		<form action="<%= request.getContextPath() %>/view/ch12/useSessionForm1.jsp" method="get">
			<input type="submit" value="セッションを破棄せず戻る">
		</form>
	</body>
</html>
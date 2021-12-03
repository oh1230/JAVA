<%@page contentType = "text/html; charset=UTF-8" %>
<html>
	<head>
		<title>Webアプリのパスを取得するJSP</title>
	</head>
	<body>
		<p><a href="/">サーバルート(/)によるリンク</a></p>
		<p><a href="<%= request.getContextPath() %>">コンテキストパスによるリンク</a></p>
		<p><a href="../../">相対パスによるリンク</a></p>
	</body>
</html>
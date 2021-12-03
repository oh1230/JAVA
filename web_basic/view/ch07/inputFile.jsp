<%@page contentType= "text/html; charset=UTF-8" %>
<%@page import= "java.util.*, java.io.*" %>

<%
String path = application.getRealPath("/file/data.csv");
Scanner sin = new Scanner(new File(path));
%>

<html>
	<head>
		<title>ファイルからデータを取得するJSP</title>
	</head>
	<body>
		<%
		out.print(path + "<br>");
		while ((sin.hasNextLine())) {
			out.print(sin.nextLine() + "<br>");
		}
		%>
	</body>
</html>
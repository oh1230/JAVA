<%@page contentType = "text/html; charset=UTF-8" %>
<%@page import = "java.net.*" %>
<%
String job = "";

Cookie[] jobCookie = request.getCookies();
if (jobCookie != null) {
	for (int i = 0; i < jobCookie.length; i++) {
		if (jobCookie[i].getName().equals("job")) {
			job = URLDecoder.decode(jobCookie[i].getValue(), "UTF-8");
		}
	}
} else {
	job = (String)session.getAttribute("job");
	if (job == null) {
		job = "";
	}
}

String message = (String)request.getAttribute("message");
if (message == null) {
	message = "";
}
%>

<html>
	<head>
		<title>practice1201</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/Practice1201Servlet" method="get">
		あなたの職業はなんですか？<br>
		<input type="text" name="job" value=<%= job %>>
		<input type="submit" value="送信"><br>
		<%= message %>
		</form>
	</body>
</html>
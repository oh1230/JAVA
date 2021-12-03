<%@page contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>書籍管理システムWeb版Ver1.0</title>
	</head>
	<body>
		<jsp:include page="/common/header.jsp"></jsp:include>
		<div style="text-align:center">
			<table style="margin-left:5%; margin-right:5%; width:90%;">
				<tr>
					<td style="text-align:left; width:34%">
						<a href="/bmsweb10j_OHSANGMIN/view/menu.jsp">[メニュー]</a>
					</td>
					<td style="font-size:25; text-align:center; width:33%">
						<strong>書籍登録</strong>
					</td>
					<td style="width:33%"></td>
				</tr>
			</table>
			<hr style="height:2; background-color:black" />
		</div>

		<br><br>

		<form style="text-align:center" action="<%=request.getContextPath() %>/insert">
			<table style="margin:0 auto">
				<tr>
					<td style="background-color:orange; text-align:center; width:200">ISBN</td>
					<td><input type=text name="isbn"></input></td>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">TITLE</td>
					<td><input type=text name="title"></input></td>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">価格</td>
					<td><input type=text name="price"></input></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="登録">
		</form>

		<jsp:include page="/common/footer.jsp"></jsp:include>
	</body>
</html>
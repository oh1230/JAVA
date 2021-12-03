<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bms.Book, util.MyFormat"%>

<%
Book book = (Book)request.getAttribute("book");
MyFormat yen = new MyFormat();
%>

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
						<a href="/bmsweb10j_OHSANGMIN/view/insert.jsp">[書籍登録]</a>
						<a href="<%= request.getContextPath() %>/list">[書籍一覧]</a>
					</td>
					<td style="font-size:25; text-align:center; width:33%">
						<strong>書籍詳細画面</strong>
					</td>
					<td style="width:33%"></td>
				</tr>
			</table>
			<hr style="height:2; background-color:black" />
		</div>

		<table style="margin:0 auto">
			<tr>
				<td style="text-align:center; width:100">
					<form action="/bmsweb10j_OHSANGMIN/view/update.jsp">
						<input type="hidden" name="isbn" value="<%=book.getIsbn()%>">
						<input type="submit" value="変更"></input>
					</form>
				</td>
				<td style="text-align:center; width:100">
					<form action="<%=request.getContextPath() %>/delete">
						<input type="hidden" name="isbn" value="<%= book.getIsbn() %>">
						<input type="submit" value="削除">
					</form>
				</td>
			</tr>
		</table>

		<div>
			<table style="margin:0 auto">
				<tr>
					<td style="background-color:orange; text-align:center; width:200">ISBN</td>
					<td style="background-color:silver; text-align:center; width:200"><%= book.getIsbn() %></td>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">TITLE</td>
					<td style="background-color:silver; text-align:center; width:200"><%= book.getTitle() %></td>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">価格</td>
					<td style="background-color:silver; text-align:center; width:200"><%= yen.moneyFormat(book.getPrice()) %></td>
				</tr>
			</table>
		</div>

		<jsp:include page="/common/footer.jsp"></jsp:include>
	</body>
</html>
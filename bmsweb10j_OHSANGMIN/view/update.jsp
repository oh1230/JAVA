<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bms.Book, bms.BookDAO, util.MyFormat"%>

<%
String isbn = request.getParameter("isbn");
BookDAO objbook = new BookDAO();
Book book = objbook.selectByIsbn(isbn);
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
						<strong>書籍変更</strong>
					</td>
					<td style="width:33%"></td>
				</tr>
			</table>
			<hr style="height:2; background-color:black" />
		</div>

		<br>

		<form style="text-align:center" action="<%=request.getContextPath() %>/update">
			<table style="margin:0 auto">
				<tr>
					<th></th>
					<th style="text-align:center">＜更新前情報＞</th>
					<th style="text-align:center">＜更新後情報＞</th>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">ISBN</td>
					<td style="background-color:silver; text-align:center; width:200"><%= book.getIsbn() %></td>
					<td style="text-align:center; width:200"><%= book.getIsbn() %></td>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">TITLE</td>
					<td style="background-color:silver; text-align:center; width:200"><%= book.getTitle() %></td>
					<td><input type=text name="title" style="width:200"></input></td>
				</tr>
				<tr>
					<td style="background-color:orange; text-align:center; width:200">価格</td>
					<td style="background-color:silver; text-align:center; width:200"><%= yen.moneyFormat(book.getPrice()) %></td>
					<td><input type=text name="price" style="width:200"></input></td>
				</tr>
			</table>
			<br>
			<input type="hidden" name="isbn" value="<%= book.getIsbn() %>">
			<input type="submit" value="変更完了">
		</form>
		<jsp:include page="/common/footer.jsp"></jsp:include>
	</body>
</html>
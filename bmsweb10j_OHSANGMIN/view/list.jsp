<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList, bms.Book, util.MyFormat"%>

<%
ArrayList<Book> list = (ArrayList<Book>)request.getAttribute("list");
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
					</td>
					<td style="font-size:25; text-align:center; width:33%">
						<strong>書籍一覧</strong>
					</td>
					<td style="width:33%"></td>
				</tr>
			</table>
			<hr style="height:2; background-color:black" />
		</div>

		<table style="margin-left:5%; margin-right:5%; width:90%;">
			<tr>
				<td style="text-align:right; width:75%">
					<form action="<%= request.getContextPath() %>/search">
						ISBN:<input style="width:15%" type=text name="isbn">&emsp;
						TITLE:<input style="width:15%" type=text name="title">&emsp;
						価格:<input style="width:15%" type=text name="price">&emsp;
						<input type="submit" value="検索">&emsp;
					</form>
				</td>
				<td style="text-align:left; width:15%">
					<form action="<%= request.getContextPath() %>/list">
						<input type="submit" value="全件表示">
					</form>
				</td>
			</tr>
		</table>

		<table style="margin-left:5%; margin-right:5%; width:90%">
		<tr style="background-color:orange;">
			<th>ISBN</th>
			<th>TITLE</th>
			<th>価格</th>
			<th>変更/削除</th>
		</tr>
		<%
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td style="text-align:center; width:25%">
				<a href="<%= request.getContextPath() %>/detail?isbn=<%= list.get(i).getIsbn() %>">
				<%= list.get(i).getIsbn() %></a>
			</td>
			<td style="text-align:center; width:25%"><%= list.get(i).getTitle() %></td>
			<td style="text-align:center; width:25%"><%= yen.moneyFormat(list.get(i).getPrice()) %></td>
			<td style="text-align:center; width:25%">
				<a href="/bmsweb10j_OHSANGMIN/view/update.jsp?isbn=<%=list.get(i).getIsbn()%>">変更</a>&emsp;
				<a href="<%= request.getContextPath() %>/delete?isbn=<%= list.get(i).getIsbn() %>">削除</a>
			</td>
		</tr>
		<%
			}
		}
		%>
		</table>
		<jsp:include page="/common/footer.jsp"></jsp:include>
	</body>
</html>
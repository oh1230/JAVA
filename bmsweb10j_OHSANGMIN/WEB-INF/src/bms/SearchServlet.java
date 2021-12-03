package bms;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		try {
			request.setCharacterEncoding("UTF-8");
			ArrayList<Book> list = new ArrayList<Book>();
			BookDAO objDAO = new BookDAO();

			String isbn = request.getParameter("isbn");
			String title = request.getParameter("title");
			String price = request.getParameter("price");

			list = objDAO.search(isbn,title,price);
			request.setAttribute("list", list);

		} catch (IllegalStateException e) {
			System.out.print("DB接続エラーの為、一覧表示はできませんでした。");
		} catch (Exception e) {
			System.out.print("予期せぬエラーが発生しました。<br>" + e);
		} finally {
			request.getRequestDispatcher("/view/list.jsp").forward(request, response);
		}

	}

}

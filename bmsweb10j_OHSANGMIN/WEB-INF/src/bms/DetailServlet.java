package bms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		try {
			String isbn = request.getParameter("isbn");

			BookDAO objDAO = new BookDAO();
			Book book = new Book();

			book = objDAO.selectByIsbn(isbn);

			request.setAttribute("book", book);

		} catch (IllegalStateException e) {
			System.out.print("DB接続エラーの為、一覧表示はできませんでした。");
		} catch (Exception e) {
			System.out.print("予期せぬエラーが発生しました。<br>" + e);
		} finally {
			request.getRequestDispatcher("/view/detail.jsp").forward(request, response);
		}
	}

}

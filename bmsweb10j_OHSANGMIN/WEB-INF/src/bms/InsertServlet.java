package bms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = null;

		try {
			request.setCharacterEncoding("UTF-8");

			BookDAO objDao = new BookDAO();
			Book book = new Book();

			book = objDao.selectByIsbn(request.getParameter("isbn"));

			if (request.getParameter("isbn").equals("")) {
				error = "ISBNが未入力の為、書籍登録処理は行えませんでした。";
			} else if (request.getParameter("title").equals("")) {
				error = "TITLEが未入力の為、書籍登録処理は行えませんでした。";
			} else if (request.getParameter("price").equals("")) {
				error = "価格が未入力の為、書籍登録処理は行えませんでした。";
			} else if (book.getIsbn() != null) {
				error = "入力ISBNは既に登録済みの為、書籍登録処理は行えませんでした。";
			} else {
			book.setIsbn(request.getParameter("isbn"));
			book.setTitle(request.getParameter("title"));
			book.setPrice(Integer.parseInt(request.getParameter("price")));
			objDao.insert(book);
			}

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。";
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
		} finally {
			request.setAttribute("error", error);
			if (error != null) {
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
			request.getRequestDispatcher("/list").forward(request, response);
		}

	}

}

package bms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = null;

		try {
			request.setCharacterEncoding("UTF-8");

			BookDAO objDao = new BookDAO();
			Book book = new Book();

			if (request.getParameter("title").equals("")) {
				error = "TITLEが未入力の為、書籍登録処理は行えませんでした。";
			} else if (request.getParameter("price").equals("")) {
				error = "価格が未入力の為、書籍登録処理は行えませんでした。";
			} else {
			book.setIsbn(request.getParameter("isbn"));
			book.setTitle(request.getParameter("title"));
			book.setPrice(Integer.parseInt(request.getParameter("price")));
			objDao.update(book);
			}

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。";
		} catch (NumberFormatException e) {
			error = "価格の値が不正の為、書籍更新処理は行えませんでした。";
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

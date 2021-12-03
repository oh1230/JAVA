package bms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = null;

		try {
			request.setCharacterEncoding("UTF-8");

			BookDAO objDao = new BookDAO();

			String isbn = request.getParameter("isbn");

			if (objDao.selectByIsbn(isbn).getIsbn() == null) {
				error = "削除対象の書籍が存在しない為、書籍削除処理は行えませんでした。";
			} else {
				objDao.delete(isbn);
			}

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。";
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
		} finally {
			if (error != null) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
			request.getRequestDispatcher("/list").forward(request, response);
		}

	}

}

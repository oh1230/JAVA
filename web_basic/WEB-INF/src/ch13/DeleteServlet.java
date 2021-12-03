package ch13;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = "";

		try {
			request.setCharacterEncoding("UTF-8");

			String id = request.getParameter("id");

			AccountDao6 objDao6 = new AccountDao6();

			int count = objDao6.delete(id);

			request.setAttribute("count", count);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。"+e;
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch13/deleteReceipt.jsp").forward(request, response);
		}
	}
}

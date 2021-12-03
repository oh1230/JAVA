package ch13;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = "";

		try {
			String id = request.getParameter("id");

			AccountInfo account = new AccountInfo();

			 AccountDao3 objDao3 = new AccountDao3();

			 account = objDao3.selectById(id);

			 request.setAttribute("account", account);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。"+e;
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch13/list3.jsp").forward(request, response);
		}
	}
}

package ch13;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = "";

		try {
			ArrayList<AccountInfo> list = new ArrayList<AccountInfo>();

			AccountDao1 objDao = new AccountDao1();

			list = objDao.selectAll();

			request.setAttribute("list", list);
		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。"+e;
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch13/list1.jsp").forward(request, response);
		}
	}
}

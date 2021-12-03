package ch13exercise;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice1302Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request ,HttpServletResponse response)
	throws ServletException ,IOException{

		String error = "";

		try {

			String id = request.getParameter("id");

			PracticeInfo info = new PracticeInfo();

			PracticeDao objDao = new PracticeDao();

			info = objDao.selectById(id);

			request.setAttribute("info", info);

		} catch (IllegalStateException e) {
			error ="DB接続エラーの為、一覧表示はできませんでした。";
		} catch (Exception e) {
			error ="予期せぬエラーが発生しました。<br>"+e;
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch13exercise/practice1302.jsp").forward(request, response);
		}
	}
}

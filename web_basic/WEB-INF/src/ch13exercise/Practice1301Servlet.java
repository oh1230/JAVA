package ch13exercise;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice1301Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request ,HttpServletResponse response)
	throws ServletException ,IOException{

		String error = "";

		try {
			ArrayList<PracticeInfo> list = new ArrayList<PracticeInfo>();

			PracticeDao objDao = new PracticeDao();

			list = objDao.selectAll();

			request.setAttribute("list", list);

		} catch (IllegalStateException e) {
			error ="DB接続エラーの為、一覧表示はできませんでした。";
		} catch (Exception e) {
			error ="予期せぬエラーが発生しました。<br>"+e;
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch13exercise/practice1301.jsp").forward(request, response);
		}

	}


}

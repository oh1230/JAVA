package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice3Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		commonProcess(request, response);
	}

	private void commonProcess(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		String msg = null;

		if (cmd.equals("get")) {
			msg = "フォームからGET送信されました！";
		} else if (cmd.equals("post")) {
			msg = "フォームからPOST送信されました！";
		} else if (cmd.equals("link")){
			msg = "リンクから送信されました！";
		}

		request.setAttribute("msg", msg);
		request.getRequestDispatcher("/view/result3.jsp").forward(request, response);
	}
}

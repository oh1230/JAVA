package ch09;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangeForwardServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String strNum = request.getParameter("num");
		String message = null;

		if (strNum == null) {
			message = "フォーム画面から入力してね。";
		} else if (strNum.equals("")) {
			message = "何も入力されていませんよ。";
		} else {
			try {
				Integer.parseInt(strNum);
			} catch (NumberFormatException e) {
				message = "数字を入力してね。";
			}
		}

		if (message == null) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/view/ch09/changeForward2.jsp?strNum="+ strNum);
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/view/ch09/changeForward3.jsp?message="+ message);
			dispatcher.forward(request, response);
		}

	}
}

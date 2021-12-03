package ch09exercise;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice0902Servlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String job =request.getParameter("job");
		String message = null;

		if (job == null) {
			message = "フォーム画面から入力してください。";
		} else if (job.equals("")) {
			message = "何も入力されていません。";
		}

		if (message == null) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/view/ch09exercise/practice0902.jsp?job="+job);
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/view/ch09exercise/practice0904.jsp?message="+message);
			dispatcher.forward(request, response);
		}
	}
}

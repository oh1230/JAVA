package ch08exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice0802Servlet extends HttpServlet {

	public void doPost (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String job = request.getParameter("job");
		String message = null;

		if (job == null) {
			message = "フォームからアクセスしてください";
		} else if (job.equals("")) {
			message = "何も入力されていません";
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		if (message == null) {
			out.println("職業は" + job + "なのですね");
		} else {
			out.println(message);
		}

	}

}

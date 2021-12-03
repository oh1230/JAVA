package ch12exercise;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Practice1201Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String job = request.getParameter("job");
		String message = null;

		if (job == null) {
			message = "フォーム画面から入力してください。";
		} else if ( job.equals("")) {
			message = "何も入力されていません。";
		}

		if (message == null) {
			String value = URLEncoder.encode(job, "UTF-8");
			Cookie jobCookie = new Cookie("job", value);
			jobCookie.setMaxAge(60 * 60 * 12);
			response.addCookie(jobCookie);

			HttpSession session = request.getSession();
			session.setAttribute("job", job);
			request.getRequestDispatcher("/view/ch12exercise/practice1202.jsp").forward(request, response);
		} else {
			request.setAttribute("message", message);
			request.getRequestDispatcher("/view/ch12exercise/practice1201.jsp").forward(request, response);
		}
	}
}

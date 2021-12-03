package ch12;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UsefulRangeServlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse reponse)
	throws ServletException, IOException {

		HttpSession session = request.getSession();

		Integer sessionCount = (Integer)session.getAttribute("SessionCount");

		if (sessionCount == null) {
			sessionCount = 0;
		}

		session.setAttribute("SessionCount", ++sessionCount);

		Integer requestCount = (Integer)request.getAttribute("RequestCount");

		if (requestCount == null) {
			requestCount = 0;
		}

		request.setAttribute("RequestCount", ++requestCount);
		request.getRequestDispatcher("/view/ch12/usefulRange.jsp").forward(request, reponse);

	}


}

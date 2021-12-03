package ch12;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UseSessionFormServlet2 extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse reponse)
	throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (session != null) {
			session.invalidate();
		}

		request.getRequestDispatcher("/view/ch12/useSessionForm1.jsp").forward(request, reponse);

	}
}

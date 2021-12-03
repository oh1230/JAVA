package ch12;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UseSessionServlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse reponse)
	throws ServletException, IOException {

		HttpSession session = request.getSession();

		session.setAttribute("bookTitle", "JSPサーブレットの本");
		request.getRequestDispatcher("/view/ch12/useSession.jsp").forward(request, reponse);

	}

}

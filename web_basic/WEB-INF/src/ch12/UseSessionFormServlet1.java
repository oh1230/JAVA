package ch12;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UseSessionFormServlet1 extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse reponse)
	throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");

		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		session.setAttribute("sex", sex);

		request.getRequestDispatcher("/view/ch12/useSessionForm2.jsp").forward(request, reponse);

	}
}

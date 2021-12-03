package ch11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseRequestServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		User objUser = new User();
		objUser.setName("神田タロー");
		objUser.setAge(25);

		request.setAttribute("RequestUser", objUser);
		request.getRequestDispatcher("/view/ch11/useRequest2.jsp").forward(request, response);

	}
}

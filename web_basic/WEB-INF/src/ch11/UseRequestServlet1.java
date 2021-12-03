package ch11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseRequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		request.setAttribute("bookTitle", "JSP/サーブレットの本");
		request.getRequestDispatcher("/view/ch11/useRequest1.jsp").forward(request, response);

	}
}

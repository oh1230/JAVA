package ch09;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseForwardServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/UseForwardServlet1");

		dispatcher.forward(request, response);
	}
}

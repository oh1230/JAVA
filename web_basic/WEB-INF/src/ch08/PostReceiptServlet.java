package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostReceiptServlet extends HttpServlet {

	public void doPost (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String name = request.getParameter("onamae");

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("お名前は" + name + "さんですね。");

	}

}

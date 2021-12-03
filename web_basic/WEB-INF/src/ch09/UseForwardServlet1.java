package ch09;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseForwardServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		System.out.println("サーブレットの実行");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/ch09/useForward.jsp");

		dispatcher.forward(request, response);

		System.out.println("サーブレットの終了");
	}
}

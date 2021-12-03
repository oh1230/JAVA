package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice1Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		commonProcess(request, response);
	}

	private void commonProcess(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		if (cmd.equals("get")) {
			out.println("フォームからGET送信されました！");
		} else if (cmd.equals("post")) {
			out.println("フォームからPOST送信されました！");
		} else if (cmd.equals("link")){
			out.println("リンクから送信されました！");
		}
	}
}

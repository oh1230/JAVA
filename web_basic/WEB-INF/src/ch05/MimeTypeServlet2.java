package ch05;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MimeTypeServlet2 extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		response.setContentType("text/html; charset = UTF-8");

		PrintWriter out = response.getWriter();
		out.println("MIMEタイプによる");
		out.println("出力の違いを");
		out.println("確認しましょう");

	}

}

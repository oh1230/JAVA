package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionReceiptServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		String message = null;
		int answer = 0;

		if (strNum1 == null || strNum2 == null) {
			message = "フォーム画面から入力してね。";
		} else if (strNum1.equals("") || strNum2.equals("")) {
			message = "何も入力されていませんよ。";
		} else {
			try {
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				answer = num1 + num2;
			} catch (NumberFormatException e) {
				message = "数字を入力してね。";
			}
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (message == null) {
			out.println(strNum1 + "+" + strNum2 + "の答えは" + answer + "です。");
		} else {
			out.println(message);
		}
	}

}

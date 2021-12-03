package ch10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseCookieFormServlet extends HttpServlet {

	public void doPost (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = "";
		String user = "kanda";
		String pass = "kanda";
		String inputUser = request.getParameter("user");
		String inputPass = request.getParameter("password");

		if (!inputUser.equals(user) || !inputPass.equals(pass)) {
			error = "ログイン失敗！";
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch10/useCookieForm1.jsp").forward(request, response);
		} else {
			Cookie userCookie = new Cookie ("user", user);
			userCookie.setMaxAge(60 * 60 * 24 * 1);
			response.addCookie(userCookie);

			Cookie passwordCookie = new Cookie ("pass", pass);
			userCookie.setMaxAge(60 * 60 * 24 * 1);
			response.addCookie(passwordCookie);

			request.getRequestDispatcher("/view/ch10/useCookieForm2.jsp").forward(request, response);
		}
	}
}

package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class SearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		Employee employee = new Employee();
		EmployeeDao objDao = new EmployeeDao();

		employee = objDao.search(request.getParameter("id"));

		request.setAttribute("employee", employee);

		request.getRequestDispatcher("/view/search.jsp").forward(request, response);

	}

}

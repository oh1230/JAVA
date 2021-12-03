package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		Employee employee = new Employee();

		employee.setId(request.getParameter("id"));

		EmployeeDao objDao = new EmployeeDao();
		objDao.delete(employee.getId());

		request.getRequestDispatcher("/list").forward(request, response);

	}

}

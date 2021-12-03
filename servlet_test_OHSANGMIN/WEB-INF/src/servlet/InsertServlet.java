package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class InsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		Employee employee = new Employee();

		employee.setId(request.getParameter("id"));
		employee.setName(request.getParameter("name"));
		employee.setAge(Integer.parseInt(request.getParameter("age")));
		employee.setStore(request.getParameter("store"));

		EmployeeDao objDao = new EmployeeDao();
		objDao.insert(employee);

		request.getRequestDispatcher("/list").forward(request, response);

	}

}

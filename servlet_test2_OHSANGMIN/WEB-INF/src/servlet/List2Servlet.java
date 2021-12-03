package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;

public class List2Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//DAOのオブジェクト作成
		StudentDao stuDao = new StudentDao();

		// 従業員リストの全件取得
		ArrayList<Student> stuArray =  stuDao.selectAll();

		// 取得したリストをリクエストスコープに登録
		request.setAttribute("stuArray", stuArray);

		// 従業員一覧表示JSPにフォワード
		request.getRequestDispatcher("/view/list2.jsp").forward(request, response);
	}

}

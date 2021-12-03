package jp.co.f1.jdbc.test;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		StudentDAO objDao = new StudentDAO();

		studentList = objDao.selectAll();

		for (int i = 0; i < studentList.size(); i++) {
			Student objStudent = studentList.get(i);
			System.out.println("学生" + objStudent.getName() + "のidは" + objStudent.getId() + "、成績は" + objStudent.getScore() + "点");
		}



	}

}

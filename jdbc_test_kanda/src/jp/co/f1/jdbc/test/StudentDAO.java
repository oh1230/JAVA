package jp.co.f1.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/testdb";
	private static String USER = "root";
	private static String PASS = "root123";

	private static Connection getConnection() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASS);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public ArrayList<Student> selectAll() {

		Connection con = null;
		Statement smt = null;
		ArrayList<Student> studentList = new ArrayList<>();
		String sql = "SELECT sid,id,name,score FROM students ORDER BY id";

		try {
			con = StudentDAO.getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				Student objStudent = new Student();
				objStudent.setSid(rs.getInt("sid"));
				objStudent.setName(rs.getString("name"));
				objStudent.setId(rs.getInt("id"));
				objStudent.setScore(rs.getInt("score"));
				studentList.add(objStudent);
			}

			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return studentList;
	}

	public int insert (Student objStu) {
		Connection con = null;
		Statement smt = null;

		int count = 0;

		String sql = "INSERT INTO students VALUES(" + objStu.getSid() + ",'" + objStu.getName() + "'," + objStu.getId() + "," + objStu.getScore() + ")";

		try {
			Class.forName(RDB_DRIVE);
			con = StudentDAO.getConnection();
			smt = con.createStatement();
			count = smt.executeUpdate(sql);

			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return count;
	}

	public int delete (int id) {
		Connection con = null;
		Statement smt = null;

		int count = 0;

		String sql = "DELETE FROM students WHERE id = " + id;

		try {
			Class.forName(RDB_DRIVE);
			con = StudentDAO.getConnection();
			smt = con.createStatement();
			count = smt.executeUpdate(sql);

			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return count;
	}

}

package jp.co.f1.jdbc.ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SampleDAO1 {

	private static final String RDB_DRIVE="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost/mybookdb";
	private static final String USER="bms";
	private static final String PASSWD="bms123";

	private static Connection getConnection () {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException (e);
		}
	}

	public ArrayList<String> selectIsbnAll () {

		Connection con = null;
		Statement smt = null;

		ArrayList<String> list = new ArrayList<String>();

		String sql = "SELECT isbn FROM bookinfo ORDER BY isbn";

		try {
			con = SampleDAO1.getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while(rs.next()) {
				list.add(rs.getString("isbn"));
			}

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e);
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return list;
	}

	public ArrayList<String> selectTitleAll () {

		Connection con = null;
		Statement smt = null;

		ArrayList<String> list = new ArrayList<String> ();

		String sql = "SELECT title FROM bookinfo ORDER BY isbn";

		try {
			con = SampleDAO1.getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				list.add(rs.getString("title"));
			}

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e);
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return list;
	}

	public ArrayList<Integer> selectPriceAll () {

		Connection con = null;
		Statement smt = null;

		ArrayList<Integer> list = new ArrayList<Integer> ();

		String sql = "SELECT price FROM bookinfo ORDER BY isbn";

		try {
			con = SampleDAO1.getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				list.add(rs.getInt("price"));
			}

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n"+e);
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return list;
	}

	public int insertBook (String isbn, String title, int price) {

		Connection con = null;
		Statement smt = null;

		int rowsCount = 0;

		String sql = "INSERT INTO bookinfo(isbn, title, price) VALUES( '" + isbn + "', '" + title + "', " + price + ")";

		try {
			// DBに接続
			con = SampleDAO1.getConnection();
			smt = con.createStatement();

			// SQL文発行
			rowsCount = smt.executeUpdate(sql);

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n"+ e +"\n");
		} finally {
			if (smt != null) {
				try {smt.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
		return rowsCount;
	}

}

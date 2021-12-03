package ch13exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PracticeDao {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/mysql";
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

	public ArrayList<PracticeInfo> selectAll(){
		Connection con = null;
		Statement  smt = null;

		ArrayList<PracticeInfo> list = new ArrayList<PracticeInfo>();

		String sql = "SELECT * FROM practice_table";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				PracticeInfo info = new PracticeInfo();
				info.setId(rs.getString("id"));
				info.setName(rs.getString("name"));
				info.setPrice(rs.getInt("price"));
				info.setAuthor(rs.getString("author"));
				info.setComment(rs.getString("comment"));
				list.add(info);
			}

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
		return list;
	}

	public PracticeInfo selectById (String id) {
		Connection con = null;
		Statement  smt = null;

		PracticeInfo info =new PracticeInfo();

		String sql = "SELECT * FROM practice_table WHERE id = '" + id + "'";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			if(rs.next()) {
				info.setId(rs.getString("id"));
				info.setName(rs.getString("name"));
				info.setPrice(rs.getInt("price"));
				info.setAuthor(rs.getString("author"));
				info.setComment(rs.getString("comment"));
			}
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
		return info;
	}
}

package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao4 {

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

	public int insert(AccountInfo accountinfo) {
		Connection con = null;
		Statement  smt = null;

		int count = 0;

		String sql = "INSERT INTO account VALUES('"
				+ accountinfo.getId() + "','"
				+ accountinfo.getName() + "','"
				+ accountinfo.getEmail() + "','"
				+ accountinfo.getAuthority() + "')";

		try {
			con = getConnection();
			smt = con.createStatement();

			count = smt.executeUpdate(sql);

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

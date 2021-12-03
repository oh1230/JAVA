package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao3 {

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

	public AccountInfo selectById(String id) {
		Connection con = null;
		Statement  smt = null;

		AccountInfo accountinfo =new AccountInfo();

		String sql = "SELECT * FROM account WHERE id = '" + id + "'";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				accountinfo.setId(rs.getString("id"));
				accountinfo.setName(rs.getString("name"));
				accountinfo.setEmail(rs.getString("email"));
				accountinfo.setAuthority(rs.getString("authority"));
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
		return accountinfo;
	}
}

package jp.co.f1.jdbc.ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SamplePrepared {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/mybookdb";
	private static String USER = "bms";
	private static String PASSWD = "bms123";

	public static void main(String[] args) {

		String sql = null;
		int num = 0;

		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASSWD);

			sql = "UPDATE bookinfo SET price = ? WHERE isbn = ?";

			System.out.println("■変更前の書籍一覧表示");
			selectAll();

			ps = con.prepareStatement(sql);
			ps.setInt(1, 3000);
			ps.setString(2, "00001");
			num = ps.executeUpdate();
			System.out.println("\n" + num + "件データを更新しました。\n");

			 System.out.println("■更新後の書籍一覧を表示");
			 selectAll();
		} catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー");
		} finally {
			if (ps != null) {
				try {ps.close();} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {con.close();} catch (SQLException ignore) {}
			}
		}
	}

	private static void selectAll() {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASSWD);

			String sql = "SELECT * FROM bookinfo WHERE isbn LIKE ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, "000%");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("isbn -> " + rs.getString("isbn") + "\t title -> "
						+ rs.getString("title") + "\t price -> " + rs.getString("price"));
			}

		} catch (Exception e) {
			System.out.println("\nJDBCデータベース接続エラー" + e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}
}

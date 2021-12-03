package jp.co.f1.jdbc.ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleSelect2 {

	private static String RDB_DRIVE="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost/mybookdb";
	private static String USER="bms";
	private static String PASSWD="bms123";


	public static void main(String[] args) {

		Connection con = null;
		Statement smt = null;

		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL,USER,PASSWD);
			smt = con.createStatement();
			String sql = "SELECT * FROM bookinfo";
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("isbn -> " + rs.getString("isbn") + "title -> " + rs.getString("title") + "price -> " + rs.getString("price"));
			}

		} catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー" + e);
		} finally {
			try {
				if (smt != null) {
					System.out.println("SQLステートメントをクローズしました。");
					smt.close();
				}
				if (con != null) {
					System.out.println("DB接続をクローズしました。");
					con.close();
				}
			} catch (SQLException ignore) {

			}
		}

	}

}

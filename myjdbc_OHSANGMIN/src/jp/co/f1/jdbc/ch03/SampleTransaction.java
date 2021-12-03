package jp.co.f1.jdbc.ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleTransaction {

	private static String RDB_DRIVE="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost/mybookdb";
	private static String USER = "bms";
	private static String PASSWD = "bms123";

	public static void main(String[] args) {

		String sql = null;
		int num = 0;

		Connection con = null;
		Statement smt = null;

		try {
			Class.forName(RDB_DRIVE);

			con = DriverManager.getConnection(URL, USER, PASSWD);

			con.setAutoCommit(false);

			smt = con.createStatement();

			System.out.println("■登録SQL発行前の書籍一覧表示");
			selectAll();

			sql = "INSERT INTO bookinfo (isbn, title, price) VALUES ('00006', 'Object-C入門テキスト', 3500)";
			num = smt.executeUpdate(sql);
			System.out.println("\nSQL発行1回目：" + num + "件の新規レコードを登録しました。");

			sql = "INSERT INTO bookinfo (isbn, title, price) VALUES ('00007', 'C++入門テキスト', 3000)";
			num = smt.executeUpdate(sql);
			System.out.println("\nSQL発行2回目：" + num + "件の新規レコードを登録しました。");

			System.out.println("\n■登録SQL発行後の書籍一覧表示");
			selectAll();

			System.out.println("\nコミット処理を実施しました。");
			con.commit();

			System.out.println("\n●コミット後の書籍一覧表示");
			selectAll();

		} catch (Exception e) {
			System.out.println("\nJDBCデータベース接続エラー" + e);
			if (con != null) {
				try {
					System.out.println("\nロールバック処理を実施しました。");
					con.rollback();
					System.out.println("\n★ロールバック後の書籍一覧表示");
					selectAll();

				} catch (SQLException ignore) {

				}
			}

		} finally {
			try {
				if (smt != null) {
					smt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException ignore) {

			}
		}


	}

	private static void selectAll () {
		Connection con = null;
		Statement smt = null;

		try {
			Class.forName(RDB_DRIVE);

			con = DriverManager.getConnection(URL, USER, PASSWD);

			smt = con.createStatement();

			String sql = "SELECT * FROM bookinfo";

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("isbn -> " + rs.getString("isbn") +
						"\t title -> " + rs.getString("title") +
						"\t price -> " + rs.getString("price"));
			}

		} catch (Exception e) {
			System.out.println("\nJDBCデータベース接続エラー" + e);
		} finally {
			try {
				if (smt != null) {
					smt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException ignore) {

			}
		}
	}

}

package jp.co.f1.jdbc.ch01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTester {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "bms";
	public static String PASSWD = "bms123";

	public static void main(String[] args) {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);

			System.out.println("JDBCデータベース接続成功");
			System.out.println("con = " + con);

			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー:" + e);
		}

	}

}

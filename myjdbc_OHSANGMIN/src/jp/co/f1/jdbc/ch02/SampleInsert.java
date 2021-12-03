package jp.co.f1.jdbc.ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SampleInsert {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/mybookdb";
	private static String USER = "bms";
	private static String PASSWD = "bms123";

	public static void main(String[] args) {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL,USER,PASSWD);
			Statement smt = con.createStatement();
			String sql = "INSERT INTO bookinfo(isbn,title,price) VALUES('00006','Strutsテキスト',2000)";
			int rowsCount = smt.executeUpdate(sql);

			System.out.print(rowsCount + "レコード登録しました。");

			smt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー");
		}
	}
}

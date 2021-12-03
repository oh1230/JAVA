package jp.co.f1.jdbc.ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SampleUpdate {

	private static String RDB_DRIVE="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost/mybookdb";
	private static String USER="bms";
	private static String PASSWD="bms123";


	public static void main(String[] args) {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL,USER,PASSWD);
			Statement smt = con.createStatement();
			String sql = "UPDATE bookinfo SET title = 'Object-Cテキスト' WHERE isbn = '00006'";
			int rowsCount = smt.executeUpdate(sql);
			System.out.print(rowsCount + "レコード変更しました。");

			smt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー");
		}

	}

}

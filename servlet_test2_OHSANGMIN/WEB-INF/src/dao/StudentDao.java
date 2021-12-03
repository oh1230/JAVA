package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Student;

/**
 * DAOクラス
 */
public class StudentDao {

	private static final String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/testdb";
	private static final String USER = "root";
	private static final String PASSWD = "root123";

	/**
	 * コネクションを取得する
	 *
	 * @return connection
	 */
	private Connection getConnection() {
		Connection con = null; // コネクション
		try {
			Class.forName(RDB_DRIVE);
			// DBに接続
			con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public ArrayList<Student> selectAll() {

		ArrayList<Student> stuArray = new ArrayList<Student>(); // テーブル内の全情報を格納する配列
		Connection con = null; // コネクション
		Statement smt = null; // ステートメント
		String sql = "SELECT * FROM studentinfo"; // 全情報取得SQL

		try {
			// DBに接続しSQL実行準備
			con = getConnection();
			smt = con.createStatement();

			// SQL実行
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				// 1レコードを格納する為のオブジェクトを生成
				Student stu = new Student();

				// SQLの実行結果を変数に格納
				stu.setId(rs.getString("id"));
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				stu.setMajor(rs.getString("major"));

				// 配列に変数を格納
				stuArray.add(stu);
			}

			//呼び出し元にArrayListを返却
			return stuArray;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			try {
				// コネクションとステートメントのクローズ
				if (smt != null) {
					smt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}
	}

}

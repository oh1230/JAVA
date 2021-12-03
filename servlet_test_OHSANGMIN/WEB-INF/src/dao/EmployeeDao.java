package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Employee;

/**
 * DAOクラス
 */
public class EmployeeDao {

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

	/**
	 * employeeinfoテーブル内の全情報取得し返却する
	 *
	 * @return employeeinfoテーブルの全情報
	 */
	public ArrayList<Employee> selectAll() {

		ArrayList<Employee> empArray = new ArrayList<Employee>(); // テーブル内の全情報を格納する配列
		Connection con = null; // コネクション
		Statement smt = null; // ステートメント
		String sql = "SELECT * FROM employeeinfo"; // 全情報取得SQL

		try {
			// DBに接続しSQL実行準備
			con = getConnection();
			smt = con.createStatement();

			// SQL実行
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				// 1レコードを格納する為のオブジェクトを生成
				Employee emp = new Employee();

				// SQLの実行結果を変数に格納
				emp.setId(rs.getString("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setStore(rs.getString("store"));

				// 配列に変数を格納
				empArray.add(emp);
			}

			//呼び出し元にArrayListを返却
			return empArray;

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

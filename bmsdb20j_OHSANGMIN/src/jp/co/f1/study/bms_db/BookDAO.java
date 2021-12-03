package jp.co.f1.study.bms_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {

	// データベース接続情報
	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/mybookdb";
	private static String USER = "root";
	private static String PASS = "root123";

	//上に書いたデータベースに接続
	private static Connection getConnection() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASS);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public ArrayList<Book> selectAll() {

		Connection con = null;
		Statement smt = null;

		//検索した書籍情報を格納するArrayListオブジェクトを生成します。
		ArrayList<Book> bookList = new ArrayList<>();

		//SQL文を文字列として定義します
		String sql = "SELECT isbn,title,price FROM bookinfo ORDER BY isbn";

		try {
			//BookDAOクラスに定義した、getConnection()メソッドを利用してConnectionオブジェクトを生成します
			con = BookDAO.getConnection();
			//ConnectionオブジェクトのcreateStatement（）メソッドを利用してStatementオブジェクトを生成します
			smt = con.createStatement();
			//Statementオブジェクトの、executeQuery（）メソッドを利用して、②のSQL文を発行し結果セットを取得します
			ResultSet rs = smt.executeQuery(sql);
			//結果セットから書籍データを検索件数分全て取り出し、ArrayListオブジェクトにBookオブジェクトとして格納します
			while (rs.next()) {
				Book objBook = new Book();
				objBook.setIsbn(rs.getString("isbn"));
				objBook.setTitle(rs.getString("title"));
				objBook.setPrice(rs.getInt("price"));
				bookList.add(objBook);
			}
			//Statement,Connectionクローズ
			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try { smt.close(); } catch (SQLException ignore) { }
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) { }
			}
		}
		return bookList;
	}

	public Book selectByIsbn (String isbn) {
		Connection con = null;
		Statement smt = null;

		Book book = new Book();
		String sql = "SELECT isbn,title,price FROM bookinfo WHERE isbn = '" + isbn + "'";

		try {
			Class.forName(RDB_DRIVE);
			con = BookDAO.getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				book.setIsbn(isbn);
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
			}
			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try { smt.close(); } catch (SQLException ignore) { }
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) { }
			}
		}
		return book;
	}

	//データベースに情報入力
	public void insert (Book book) {
		Connection con = null;
		Statement smt = null;

		String sql = "INSERT INTO bookinfo VALUES('" + book.getIsbn() + "','" + book.getTitle() + "'," + book.getPrice() + ")";

		try {
			Class.forName(RDB_DRIVE);
			con = BookDAO.getConnection();
			smt = con.createStatement();
			smt.executeUpdate(sql);

			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try { smt.close(); } catch (SQLException ignore) { }
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) { }
			}
		}
	}

	public void update (Book book, String oldIsbn) {
		Connection con = null;
		Statement smt = null;

		String sql = "UPDATE bookinfo SET isbn='" + book.getIsbn() + "',title='" + book.getTitle() + "',price=" + book.getPrice()
		+ " WHERE isbn='" + oldIsbn + "'";

		try {
			Class.forName(RDB_DRIVE);
			con = BookDAO.getConnection();
			smt = con.createStatement();
			smt.executeUpdate(sql);

			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try { smt.close(); } catch (SQLException ignore) { }
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) { }
			}
		}
	}

	public void delete (Book book) {
		Connection con = null;
		Statement smt = null;

		String sql = "DELETE FROM bookinfo WHERE isbn = '" + book.getIsbn() + "'";

		try {
			Class.forName(RDB_DRIVE);
			con = BookDAO.getConnection();
			smt = con.createStatement();
			smt.executeUpdate(sql);

			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try { smt.close(); } catch (SQLException ignore) { }
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) { }
			}
		}
	}

	public ArrayList<String> selectIsbn() {

		Connection con = null;
		Statement smt = null;

		//検索した書籍情報を格納するArrayListオブジェクトを生成します。
		ArrayList<String> isbnList = new ArrayList<>();

		//SQL文を文字列として定義します
		String sql = "SELECT isbn FROM bookinfo ORDER BY isbn";

		try {
			//BookDAOクラスに定義した、getConnection()メソッドを利用してConnectionオブジェクトを生成します
			con = BookDAO.getConnection();
			//ConnectionオブジェクトのcreateStatement（）メソッドを利用してStatementオブジェクトを生成します
			smt = con.createStatement();
			//Statementオブジェクトの、executeQuery（）メソッドを利用して、②のSQL文を発行し結果セットを取得します
			ResultSet rs = smt.executeQuery(sql);
			//結果セットから書籍データを検索件数分全て取り出し、ArrayListオブジェクトにBookオブジェクトとして格納します
			while (rs.next()) {
				Book objBook = new Book();
				objBook.setIsbn(rs.getString("isbn"));
				isbnList.add(new String(objBook.getIsbn()));
			}
			//Statement,Connectionクローズ
			smt.close();
			con.close();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try { smt.close(); } catch (SQLException ignore) { }
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) { }
			}
		}
		return isbnList;
	}

}

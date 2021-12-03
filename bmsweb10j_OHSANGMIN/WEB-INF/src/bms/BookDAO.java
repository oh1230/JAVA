package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/mybookdb";
	private static String USER = "root";
	private static String PASS = "root123";

	private static Connection getConnection () {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASS);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public ArrayList<Book> selectAll () {
		Connection con = null;
		Statement smt = null;

		ArrayList<Book> bookList = new ArrayList<Book>();

		String sql = "SELECT * FROM bookinfo";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				Book book = new Book();
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
				bookList.add(book);
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
		return bookList;
	}

	public void insert(Book book) {

		Connection con = null;
		Statement smt = null;

		String sql = "INSERT INTO bookinfo VALUES('"
				+ book.getIsbn() + "','"
				+ book.getTitle() + "','"
				+ book.getPrice() + "')";

		try {
			con = getConnection();
			smt = con.createStatement();
			smt.executeUpdate(sql);

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
	}

	public Book selectByIsbn (String isbn) {

		Connection con = null;
		Statement smt = null;
		Book book = new Book();

		String sql = "SELECT * FROM bookinfo WHERE isbn = '" + isbn + "'";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
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
		return book;
	}

	public void delete (String isbn) {

		Connection con = null;
		Statement smt = null;

		String sql = "DELETE FROM bookinfo WHERE isbn = '" + isbn + "'";

		try {

			con = getConnection();
			smt = con.createStatement();

			smt.executeUpdate(sql);

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
	}

	public void update (Book book) {

		Connection con = null;
		Statement  smt = null;

		String sql = "UPDATE bookinfo SET "
				+ "title = '" + book.getTitle() + "', "
				+ "price = '" + book.getPrice() + "' "
				+ "WHERE isbn = '" + book.getIsbn() + "'";

		try {
			con = getConnection();
			smt = con.createStatement();

			smt.executeUpdate(sql);

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
	}

	public ArrayList<Book> search (String isbn, String title, String price) {
		Connection con = null;
		Statement smt = null;
		ArrayList<Book> bookList = new ArrayList<Book>();

		String sql = "SELECT isbn,title,price FROM bookinfo " +
				"WHERE isbn LIKE '%" + isbn + "%' AND title LIKE '%" + title + "%' AND price LIKE '%" + price + "%'";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				Book book = new Book();
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
				bookList.add(book);
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
		return bookList;
	}

}

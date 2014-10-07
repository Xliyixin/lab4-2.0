import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BOOKDATA {
	private static final BOOKDATA instance;
	static {
		instance = new BOOKDATA();
	}

	private BOOKDATA() {
	}


	public static BOOKDATA getInstance() {
		return instance;
	}

	public ArrayList<BOOK> getBooks(String id) {
		ArrayList<BOOK> ret = new ArrayList<BOOK>();
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_liyixin",
					"mx34k32o50", "hwz50ijmlzzk13k12jzl442w14j5jmjw0k5x32wk");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection mycon = con;
		Statement st;
		try {
			st = mycon.createStatement();
			ResultSet set = st
					.executeQuery("SELECT * FROM book where authorid='" + id
							+ "'");
			while (set.next()) {
				BOOK book = new BOOK();
				book.setId(set.getString("authorid"));
				book.setIsbn(set.getString("isbn"));
				book.setPrice(set.getDouble("price"));
				book.setDate(set.getString("publishdate"));
				book.setPub(set.getString("publisher"));
				book.setTitle(set.getString("title"));
				ret.add(book);
			}
		} catch (SQLException e) {
		}
		try {
			mycon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	public BOOK getBook(String isbn) {
		BOOK book = new BOOK();
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_liyixin",
					"mx34k32o50", "hwz50ijmlzzk13k12jzl442w14j5jmjw0k5x32wk");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection mycon = con;
		Statement st;
		try {
			st = mycon.createStatement();
			ResultSet set = st.executeQuery("SELECT * FROM book where isbn='"
					+ isbn + "'");
			while (set.next()) {
				book.setId(set.getString("authorid"));
				book.setIsbn(set.getString("isbn"));
				book.setPrice(set.getDouble("price"));
				book.setDate(set.getString("publishdate"));
				book.setPub(set.getString("publisher"));
				book.setTitle(set.getString("title"));
			}
		} catch (SQLException e) {
		}
		try {
			mycon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	public void removeBook(String isbn) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_liyixin",
					"mx34k32o50", "hwz50ijmlzzk13k12jzl442w14j5jmjw0k5x32wk");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection mycon = con;
		Statement st;
		try {
			st = mycon.createStatement();
			st.executeUpdate("DELETE FROM book WHERE isbn='" + isbn + "'");
		} catch (SQLException e) {
		}
		try {
			mycon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addBook(BOOK book) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_liyixin",
					"mx34k32o50", "hwz50ijmlzzk13k12jzl442w14j5jmjw0k5x32wk");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection mycon = con;
		Statement st;
		try {
			st = mycon.createStatement();
			st.executeUpdate("INSERT INTO book VALUES('" + book.getIsbn()
					+ "','" + book.getTitle() + "','" + book.getId() + "','"
					+ book.getPub() + "','" + book.getDate() + "',"
					+ book.getPrice() + ")");
		} catch (SQLException e) {
		}
		try {
			mycon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AUTHORDATA {
	/*
	third mod
	*/
	private static final AUTHORDATA instance;
	static {
		instance = new AUTHORDATA();
	}

	private AUTHORDATA() {
	}

	public static AUTHORDATA getInstance() {
		return instance;
	}

	public ArrayList<AUTHOR> getAuthors() {
		ArrayList<AUTHOR> ret = new ArrayList<AUTHOR>();
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
			ResultSet set = st.executeQuery("SELECT * FROM author");
			while (set.next()) {
				AUTHOR author = new AUTHOR();
				author.setId(set.getString("authorid"));
				author.setAge(set.getInt("age"));
				author.setCountry(set.getString("country"));
				author.setName(set.getString("name"));
				ret.add(author);
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

	public AUTHOR getAuthor(String id) {
		AUTHOR ret = new AUTHOR();
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
					.executeQuery("SELECT * FROM author where authorid='" + id
							+ "'");
			while (set.next()) {
				ret.setId(set.getString("authorid"));
				ret.setAge(set.getInt("age"));
				ret.setCountry(set.getString("country"));
				ret.setName(set.getString("name"));
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

	public String getAuthorid(String name) {
		AUTHOR ret = new AUTHOR();
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
			ResultSet set = st.executeQuery("SELECT * FROM author where name='"
					+ name + "'");
			while (set.next())
				ret.setId(set.getString("authorid"));
		} catch (SQLException e) {
		}
		try {
			mycon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret.getId();
	}
}

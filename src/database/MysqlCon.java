package database;

import java.sql.*;

public class MysqlCon {
	public static void main(String args[]) {
		try {
			System.out.println("Hello mysql");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kkw", "root", "root");
//here kkw is database name, root is username and password

			/*
			 * PreparedStatement ps = null; String sql =
			 * "insert into emp value(4,'ajit',24)"; ps = con.prepareStatement(sql);
			 * ps.execute();
			 */

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp ");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
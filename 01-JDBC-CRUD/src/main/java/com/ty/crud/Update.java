package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/pranavdb";
		String username = "postgres";
		String password = "root";

		Connection con = null;
		try {
			// 1
			Class.forName("org.postgresql.Driver");
			// 2
			con = DriverManager.getConnection(url, username, password);
			// 3
			Statement stm = con.createStatement();
			// 4
			String query = "update student set name='bhosale' where sid=108";

			int res = stm.executeUpdate(query);
			System.out.println("record updated and connection closed");

			System.out.println("rows affected:-" + res);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("connection is closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/pranavdb";
		String username = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";

		try {
			// 1
			Class.forName(driver);

			// 2
			Connection con = DriverManager.getConnection(url, username, password);

			// 3
			Statement stm = con.createStatement();

			// 4
			String query = "DELETE FROM student WHERE sid=111 ";
			stm.execute(query);

			// 5
			con.close();
			System.out.println("data deleted and connection close....");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

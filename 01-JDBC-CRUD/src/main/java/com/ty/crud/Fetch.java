package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/pranavdb?user=postgres&password=root";
		String driver = "org.postgresql.Driver";

		try {
			// 1
			Class.forName(driver);

			// 2
			Connection con = DriverManager.getConnection(url);

			// 3
			Statement stm = con.createStatement();

			// 4
			String sql = "select * from student";

			ResultSet rs = stm.executeQuery(sql);
			System.out.println("---------student-----------");

			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getLong(3));
				System.out.println(rs.getString(4));
				System.out.println("---------------");
			}

			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

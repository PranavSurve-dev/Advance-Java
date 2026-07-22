package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResource {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/pranavdb";
		String useranme = "postgres";
		String password = "root";

		try {

			// 1
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// 2
			Connection con = DriverManager.getConnection(url, useranme, password);
			System.out.println("Connection Created");

			// 3
			Statement stm = con.createStatement();
			System.out.println("statement created");

			String query = "update student set phone='99999' where sid=109";

			// 4
			int res = stm.executeUpdate(query);
			System.out.println("record updated and ");

			System.out.println("rows affected : " + res);
			System.out.println("connection closed automatically");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

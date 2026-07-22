package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Save {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/pranavdb";
		String username = "postgres";
		String password = "root";

		try {
			// step 1 : Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded ");

			// step 2 : Establish the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created");

			String query = "insert into student values(?,?,?,?)";

			// step 3 : Create a Statement
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, 104);
			pstm.setString(2, "Chinga");
			pstm.setLong(3, 45687465);
			pstm.setString(4, "chinga@gmail.com");

			System.out.println("statement is created");

			// step 4 : Execute the query
			pstm.execute();
			System.out.println("Record saved");

			// step 5 : Close the connection
			con.close();
			System.out.println("Connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
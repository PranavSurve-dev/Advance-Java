package com.ty.crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProc {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/pranavdb?user=postgres&password=root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection connection = DriverManager.getConnection(url);

			String sql = "call proc_save(?,?,?,?)";

			CallableStatement cstm = connection.prepareCall(sql);
			cstm.setInt(1, 110);
			cstm.setString(2, "PANU");
			cstm.setLong(3, 8452084);
			cstm.setString(4, "ganga@gmail.com");

			cstm.execute();

			connection.close();
			System.out.println("procedure executed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
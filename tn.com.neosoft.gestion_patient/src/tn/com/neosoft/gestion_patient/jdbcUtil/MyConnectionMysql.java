package tn.com.neosoft.gestion_patient.jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionMysql {
	private static Connection connection;
	private static String url = "jdbc:mysql://localhost:3306/docdb";
	private static String user = "root";
	private static String password = "";

	public static Connection configureConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

}

package org.marialucia.software.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		final String URL = "jdbc:mysql://localhost:3306/mymemo"+"?serverTimezone=CET&useSSL=false";
		final String USERNAME = "root";
		final String PASSWORD = "abcde123";
		
		DriverManager.registerDriver(new Driver());
				
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
	}
}

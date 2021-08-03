package com.crud.olympics.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDAO {
	
	public void connectDB() {
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:OlympicCRUD.sqlite");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("DB와 성공적으로 연결되었습니다!");
	}
	
}

package com.crud.olympics.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDAO {

	public void insertCategoryDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:OlympicCRUD.sqlite");
			c.setAutoCommit(false);
			System.out.println("DB와 성공적으로 연결되었습니다!");

			stmt = c.createStatement();
			String sql = "INSERT INTO category (category) "
					+ "VALUES (('양궁'));";
			stmt.executeUpdate(sql);
			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("성공적으로 기록하였습니다! ");
	}

}

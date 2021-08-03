package com.crud.olympics.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDAO {

	public void createCategoryDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:OlympicCRUD.sqlite");
			System.out.println("Category DB를 성공적으로 생성하였습니다!");

			stmt = c.createStatement();

			String sql = "CREATE TABLE `Category`" + " (`id` INTEGER PRIMARY KEY autoincrement, "
					+ "`category` CHAR(100) NOT NULL) ";

			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("테이블을 성공적으로 생성하였습니다!");
	}
	
	public void createSportDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:OlympicCRUD.sqlite");
			System.out.println("Sport DB를 성공적으로 생성하였습니다!");

			stmt = c.createStatement();

			String sql = "CREATE TABLE `Category`" + " (`id` INTEGER PRIMARY KEY autoincrement, "
					+ "`category` CHAR(100) NOT NULL) ";

			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("테이블을 성공적으로 생성하였습니다!");
	}

}

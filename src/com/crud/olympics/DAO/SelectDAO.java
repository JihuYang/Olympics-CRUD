package com.crud.olympics.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crud.olympics.DTO.CategoryDTO;


public class SelectDAO {

	public void selectCategoryDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:OlympicCRUD.sqlite");
			c.setAutoCommit(false);
			System.out.println("DB와 성공적으로 연결되었습니다!");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Category;");
					
			
			while (rs.next()) {
				CategoryDTO categoryList = new CategoryDTO();
				categoryList.setId(rs.getInt("id"));
				categoryList.setCategory(rs.getString("category"));
				
				System.out.println(categoryList.getId());
				System.out.println(categoryList.getCategory());
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("성공적을 정보를 읽어왔습니다!");
	}

}

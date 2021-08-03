package com.crud.olympics;

import java.io.File;

import com.crud.olympics.DAO.ConnectDAO;
import com.crud.olympics.DAO.CreateDAO;
import com.crud.olympics.DAO.InsertDAO;
import com.crud.olympics.DAO.SelectDAO;


public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();

		view.printHelloMessage();
		view.printMenu();

		ConnectDAO connectDAO = new ConnectDAO();
		CreateDAO createDAO = new CreateDAO();
		InsertDAO insertDAO = new InsertDAO();
		SelectDAO selectDAO = new SelectDAO();


		//connectDAO.connectDB();
		// createDAO.createCategoryDB();
		//insertDAO.insertCategoryDB();

		while (true) {
			try {
				char input = view.inputCommand();

				if (input == '0') {
					break;
				}
				else if (input == '1') {
					selectDAO.selectCategoryDB();
				}
				
			} catch (Exception e) {
				view.printMessage(e.getMessage());
			}

		}

	}

}

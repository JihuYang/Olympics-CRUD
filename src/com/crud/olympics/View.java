package com.crud.olympics;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class View {

	private Scanner scanner = new Scanner(System.in);

	public void printHelloMessage() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("                              ð°ð·ð°ð· OLYMPICS CRUD PROJECT ð°ð·ð°ð·");
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	/** menuíì ì¶ë ¥ */
	public void printMenu() {
		System.out.println("                                      ð¤¸ð»ââï¸ MENU â¹ï¸ââï¸");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(String.format("%-30s%-30s", " ", "  0ï¸â£: ìì¤í ì¢ë£"));
		System.out.println(String.format("%-30s%-30s", " ", " ï¸1ï¸â£: ê²½ê¸° ì¼ì  ë³´ê¸°"));
		System.out.println(String.format("%-30s%-30s", " ", " ï¸2ï¸â£: ê²½ê¸° ì¼ì  ìë ¥íê¸°"));
		System.out.println(String.format("%-30s%-30s", " ", " ï¸3ï¸â£ï¸: ê²½ê¸° ì¼ì  ìì íê¸°"));
		System.out.println(String.format("%-30s%-30s", " ", " ï¸ï¸4ï¸â£: ê²½ê¸° ì¼ì  ì­ì íê¸°"));
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	/** ì¬ì©ìê° ìë ¥í ê°ì scan */
	public char inputCommand() {
		System.out.print("\n  â³ï¸ ìíë ë©ë´ë¥¼ ìë ¥íì¸ì: ");
		InputStream is = System.in;
		char inputChar;
		try {
			inputChar = (char) is.read();
			return inputChar;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return '0';
		}
	}

	/** ë©ìì§ë¥¼ ì¶ë ¥ */
	public void printMessage(String message) {
		System.out.println(message);
	}

}

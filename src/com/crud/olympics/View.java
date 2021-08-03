package com.crud.olympics;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class View {

	private Scanner scanner = new Scanner(System.in);

	public void printHelloMessage() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("                              🇰🇷🇰🇷 OLYMPICS CRUD PROJECT 🇰🇷🇰🇷");
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	/** menu판을 출력 */
	public void printMenu() {
		System.out.println("                                      🤸🏻‍♀️ MENU ⛹️‍♀️");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(String.format("%-30s%-30s", " ", "  0️⃣: 시스템 종료"));
		System.out.println(String.format("%-30s%-30s", " ", " ️1️⃣: 경기 일정 보기"));
		System.out.println(String.format("%-30s%-30s", " ", " ️2️⃣: 경기 일정 입력하기"));
		System.out.println(String.format("%-30s%-30s", " ", " ️3️⃣️: 경기 일정 수정하기"));
		System.out.println(String.format("%-30s%-30s", " ", " ️️4️⃣: 경기 일정 삭제하기"));
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	/** 사용자가 입력한 값을 scan */
	public char inputCommand() {
		System.out.print("\n  ⛳️ 원하는 메뉴를 입력하세요: ");
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

	/** 메시지를 출력 */
	public void printMessage(String message) {
		System.out.println(message);
	}

}

package com.crud.olympics;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class View {

	private Scanner scanner = new Scanner(System.in);

	public void printHelloMessage() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("          > OLYMPICS CRUD PROJECT <");
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	/** menu판을 출력 */
	public void printMenu() {
		System.out.println("                      > MENU & EXAMPLE <");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(String.format("%-30s%-20s", "  1: show Match list", "| 1<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  2: create Match", "| 2 {content} [dependencies]<Enter>"));
		System.out
				.println(String.format("%-30s%-20s", "  3: update Match", "| 3 {id} {content} [dependencies]<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  4: remove Match", "| 4 {id}<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  5: finish Match", "| 5 {id}<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  6: search Match", "| 6 {content}<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  7: check unfinished Match", "| 7<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  8: read file Match", "| 8<Enter>"));
		System.out.println(String.format("%-30s%-20s", "  9: write file Match", "| 9<Enter>"));
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	/** 사용자가 입력한 값을 scan */
	public char inputCommand() {
		System.out.print("\n원하는 메뉴를 입력하세요: ");
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

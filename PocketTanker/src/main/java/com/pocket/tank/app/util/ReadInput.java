package com.pocket.tank.app.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadInput {
	private static final Pattern NUMBERS = Pattern.compile("\\d+");
	private static final Pattern LETTERS = Pattern.compile("\\p{Alpha}+");

	public static Scanner getscanner() {
		return new Scanner(System.in);
	}

	public static String readString() {
		return InputReader.getInstance().readString();
	}

	public static String readInt() {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter letters:"); while (!sc.hasNext("[A-Za-z]+"))
		 * { System.out.println("Nope, that's not it!"); sc.next(); } String word =
		 * sc.next(); System.out.println("Thank you! Got " + word); return
		 * getscanner().nextInt();
		 */
		return isNumeric(getscanner().next());
	}

	public static final String isNumeric(String text) {
		if (!NUMBERS.matcher(text).matches()) {
			System.out.println("Invalid values!!!");
			/*IMenu items=new WelcomeMenu();
	    	items.getMenuItems();*/
		}
		return text;
	}

	public static final boolean isAlpha(String text) {
		return LETTERS.matcher(text).matches();
	}
}

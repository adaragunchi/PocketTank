package com.pocket.tank.app.util;

import java.util.Scanner;

public class InputReader {

	private final Scanner sc;
	private static volatile InputReader instance;

	private InputReader() {
		sc = new Scanner(System.in, "UTF-8");
	}

	public static InputReader getInstance() {
		if (instance == null) {
			synchronized (InputReader.class) {
				if (instance == null) {
					instance = new InputReader();
				}
			}
		}
		return instance;
	}

	public String readString() {
		return sc.nextLine();
	}
}

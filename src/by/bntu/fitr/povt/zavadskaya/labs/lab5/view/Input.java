package by.bntu.fitr.povt.zavadskaya.labs.lab5.view;

import java.util.Scanner;

public class Input {
	private static Scanner scanner = new Scanner(System.in);

	public static int input(String message) {
		System.out.println(message);
		return scanner.nextInt();
	}

}

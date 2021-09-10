package net.mellbourn.problem3;
import java.util.Scanner;

public final class App {

	private App() {
	}
	
	private static void tryThis1() {
		for(var i = 0; i < 10; i++) {
			System.out.println(randomDigit(9));
		}
	}

	private static void tryThis2() {
		System.out.print("n? ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(randomDigit(n));
	}

	private static int randomDigit(final int max) {
		return (int) (Math.random() * (max + 1));
	}

	private static void problem3() {
		final int numberOfRows = 5;
		final int numberOfDigits = 6;
		for (var row = 0; row < numberOfRows; row++) {
			for (var digit = 0; digit < numberOfDigits; digit++) {
				System.out.print(randomDigit(9));
			}
			System.out.println();
		}
	}

	/**
	 * Main program.
	 */
	public static void main(String[] args) {
		problem3();
	}
}

package net.mellbourn.problem3;
import java.util.Scanner;

public final class App {

	private App() {
	}
	
	private static void tryThis1() {
		for(var i = 0; i < 10; i++) {
			System.out.println(randomDigit(0, 9));
		}
	}

	private static void tryThis2() {
		System.out.print("n? ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(randomDigit(0, n));
	}

	private static void tryThis3() {
		Scanner in = new Scanner(System.in);
		System.out.print("a? ");
		int a = in.nextInt();
		System.out.print("b? ");
		int b = in.nextInt();
		in.close();
		System.out.println(randomDigit(a, b));
	}

	private static void tryThis4() {
		Scanner in = new Scanner(System.in);
		System.out.print("a? ");
		int a = in.nextInt();
		System.out.print("b? ");
		int b = in.nextInt();
		in.close();
		for (var i = 0; i < 10; i++) {
			System.out.println(randomDigit(a, b));
		}
	}

	private static int randomDigit(final int min, final int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

	private static void problem3() {
		final int numberOfRows = 5;
		final int numberOfDigits = 6;
		for (var row = 0; row < numberOfRows; row++) {
			for (var digit = 0; digit < numberOfDigits; digit++) {
				System.out.print(randomDigit(0, 9));
			}
			System.out.println();
		}
	}

	/**
	 * Main program.
	 */
	public static void main(String[] args) {
		tryThis4();
	}
}

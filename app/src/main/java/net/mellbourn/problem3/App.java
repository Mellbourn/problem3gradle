package net.mellbourn.problem3;

public final class App {

	private App() {
	}
	
	private static void tryThis1() {
		for(var i = 0; i < 10; i++) {
			System.out.println(randomDigit());
		}
	}

	private static int randomDigit() {
		final var maxSingleDigit = 10;
		return (int) (Math.random() * maxSingleDigit);
	}

	private static void problem3() {
		final int numberOfRows = 5;
		final int numberOfDigits = 6;
		for (var row = 0; row < numberOfRows; row++) {
			for (var digit = 0; digit < numberOfDigits; digit++) {
				System.out.print(randomDigit());
			}
			System.out.println();
		}
	}

	/**
	 * Main program.
	 */
	public static void main(String[] args) {
		tryThis1();
	}
}

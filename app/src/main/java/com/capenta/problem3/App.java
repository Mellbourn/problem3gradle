package com.capenta.problem3;

public final class App {

  private App() {
  }

  private static int randomDigit() {
    final var maxSingleDigit = 10;
    return (int) (Math.random() * maxSingleDigit);
  }

  /**
   * Main program.
   */
  public static void main(String[] args) {
    final int numberOfRows = 5;
    final int numberOfDigits = 6;
    for (var row = 0; row < numberOfRows; row++) {
      for (var digit = 0; digit < numberOfDigits; digit++) {
        System.out.print(randomDigit());
      }
      System.out.println();
    }
  }
}

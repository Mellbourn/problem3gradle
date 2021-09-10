package net.mellbourn.problem3;

import java.util.Scanner;

public final class App {

  private App() {
  }

  private static void tryThis1() {
    for (var i = 0; i < 10; i++) {
      System.out.println(randomDigit(0, 9));
    }
  }

  private static void tryThis2() {
    System.out.print("n? ");
    Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    in.close();
    System.out.println(randomDigit(0, n));
  }

  private static void tryThis3() {
    Scanner in = new Scanner(System.in);
    System.out.print("a? ");
    final int a = in.nextInt();
    System.out.print("b? ");
    final int b = in.nextInt();
    in.close();
    System.out.println(randomDigit(a, b));
  }

  private static void tryThis4() {
    Scanner in = new Scanner(System.in);
    System.out.print("a? ");
    final int a = in.nextInt();
    System.out.print("b? ");
    final int b = in.nextInt();
    in.close();
    for (var i = 0; i < 10; i++) {
      System.out.println(randomDigit(a, b));
    }
  }

  private static void tryThis5() {
    Scanner in = new Scanner(System.in);
    System.out.print("value? ");
    final int value = in.nextInt();
    in.close();
    int times = 0;
    int random;
    do {
      random = randomDigit(0, 9);
      System.out.println(random);
      times++;
    } while (random != value);
    System.out.println("It took " + times + " times");
  }

  private static void tryThis1LoopEvenNumbers() {
    for (var i = 2; i < 20; i = i + 2) {
      System.out.println(i);
    }
  }

  private static void tryThis2randomNumbersEqual() {
    int random1;
    int random2;
    do {
      random1 = randomDigit(1, 10);
      random2 = randomDigit(1, 10);
      System.out.println(random1 + " " + random2);
    } while (random1 != random2);
  }

  private static int randomNumbersEqualAfter() {
    int random1;
    int random2;
    int iterations = 0;
    do {
      random1 = randomDigit(1, 10);
      random2 = randomDigit(1, 10);
      iterations++;
    } while (random1 != random2);
    return iterations;
  }

  private static void tryThis3randomNumbersEqualWithAverage() {
    int sum = 0;
    final int iterations = 10000;
    for (var i = 0; i < iterations; i++) {
      sum += randomNumbersEqualAfter();
    }
    System.out.println("Average: " + (float) sum / iterations);
  }

  private static void tryThis3randomNumbersEqualWithStatistics() {
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = 0;
    final int iterations = 10000;
    for (var i = 0; i < iterations; i++) {
      final int number = randomNumbersEqualAfter();
      sum += number;
      if (number > max) {
        max = number;
      }
      if (number < min) {
        min = number;
      }
    }
    System.out.println();
    System.out.println("Average: " + (float) sum / iterations);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
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
    tryThis3randomNumbersEqualWithStatistics();
  }
}

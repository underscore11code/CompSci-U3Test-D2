package io.github.underscore11code.compsci;

import java.text.NumberFormat;
import java.util.Scanner;

public class DeductionCalculator {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount of your purchases: ");
    final double originalCost = scanner.nextDouble();
    scanner.close();
    double deduction = 0;
    if (originalCost >= 1000)
      deduction = 0.25;
    else if (inRange(originalCost, 500, 999.99))
      deduction = 0.15;
    else if (inRange(originalCost, 100, 499.99))
      deduction = 0.10;
    else if (inRange(originalCost, 0, 99.99))
      deduction = 0.05;

    System.out.println("Your deduction is " + NumberFormat.getPercentInstance().format(deduction));
  }

  private static boolean inRange(final double original, final double lower, final double upper) {
    return original >= lower && original <= upper;
  }
}

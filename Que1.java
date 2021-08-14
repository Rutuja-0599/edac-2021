/*
 * Question 1:
 * Accept 2 double values from User (using Scanner). Check data type. 
 * If arguments are not doubles, supply suitable error message & terminate.
 * If numbers are double values, print its average.
 */

import java.util.Scanner;

class Que1 {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    double d1 = 0, d2 = 0;

    System.out.print("Enter 2 double values : ");

    if (cin.hasNextDouble()) {
      d1 = cin.nextDouble();
    }
    else {
      System.out.println("Error : First one is not double.");
    }
    if (cin.hasNextDouble()) {
      d2 = cin.nextDouble();
    }
    else {
      System.out.println("Error : Second one is not double.");
    }
    System.out.println("Average = " + (d1+d2)/2);
  }
}
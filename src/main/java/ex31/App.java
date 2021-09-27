/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex31;

import java.util.Scanner;

class HeartRate {
  public static void heartRate(){
    Scanner s = new Scanner(System.in);
    float rate;
    try {
      System.out.print("Enter age: ");
      int age = s.nextInt();
      System.out.print("Enter resting heart rate: ");
      int heart_rate = s.nextInt();
      System.out.println("Resting Pulse: " + heart_rate + "      Age: " + age);
      System.out.println("Intensity    | Rate");
      System.out.println("-------------|---------");
      for (int i = 55; i <= 95; i += 5) {
        rate = (((220 - age) - heart_rate) * i/100) + heart_rate;
        System.out.println(i + "%" + "          | " + Math.round(rate) + " bpm");
      }
    } 
    catch(Exception e) {
      System.out.println("Enter only numbers...");
    }
  }

  public static void main(String[] args) {
    heartRate();
  }
}

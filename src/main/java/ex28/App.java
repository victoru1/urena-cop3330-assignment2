/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex28;

import java.util.Scanner;

class AddingNumbers {

  public static int loop(){
    Scanner in = new Scanner(System.in);
    int total = 0;
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter a number: ");
      total += in.nextInt();
    }
    return total;
  }

  public static void main(String[] args){
    
    int total = loop();
    System.out.println("The total is " + total + ".");
  }


}
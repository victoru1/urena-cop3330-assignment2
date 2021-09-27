/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex29;

import java.util.*;

class BadInput {
  public static void main(String args[]) {
    rateOfReturn();
  }

  public static void rateOfReturn(){
    Scanner sc=new Scanner(System.in);
    boolean flag=false;
    while(true) {
      try {
        System.out.print("What is the rate of return? ");
        int r=Integer.parseInt(sc.next());
        System.out.println("It will take "+(72/r)+" years to double your initial investment.");
        flag=true;
      }
      catch(NumberFormatException e) {
        System.out.println("Sorry. That's not a valid input"); 
      }
      catch(ArithmeticException e) {
        System.out.println("Sorry. That's not a valid input");   
      }
      if(flag) {
        break;
      }
           
    }
  }
}
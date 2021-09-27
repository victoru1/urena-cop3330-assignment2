/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex30;

class MultiplicationTable {
  public static void main(String[] args) {
    table();
  }

  public static void table(){
    for(int i=1;i<=12;i++) {
      for(int j=1;j<=12;j++) {
        if(i*j>=1 && i*j<=9)
          System.out.print(i*j + "   ");
        else if(i*j>=10 && i*j<=99)
          System.out.print(i*j + "  ");
        else{
          System.out.print(i*j + " ");
        }
      }
      System.out.println();
    }
  }
}
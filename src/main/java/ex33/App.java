/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex33;

import java.util.Random;
import java.util.Scanner;

class Magic8Ball {

  public static void magicBall(){
    String[] responses = {"Yes","No","Maybe","Ask again later"};
       
       Random random = new Random();
      
       int randomResponseIndex = random.nextInt(responses.length);
       
       String response = responses[randomResponseIndex];
      
       System.out.println();
       System.out.println(response);
       System.out.println();
  }

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
          
     System.out.println("What's your question?");
     String question = sc.nextLine();

     magicBall();
   }
}
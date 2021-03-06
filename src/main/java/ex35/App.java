/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class PickingWinner {

  public static void pickWinner(ArrayList nameList){
    Random random = new Random();
    int randomIndex = random.nextInt(nameList.size());
      
    System.out.println("The winner is... "+nameList.get(randomIndex));
  }

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String name = null;
       ArrayList<String> nameList = new ArrayList<String>();
       do {
           System.out.println("Enter a name:");
           name= input.nextLine();
           if(!name.isBlank() && !name.isEmpty())
               nameList.add(name);
       }while(!name.isBlank() && !name.isEmpty());

       pickWinner(nameList);
   }
}
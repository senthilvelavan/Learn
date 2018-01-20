package com.learn.Day1.Array;

import java.util.Scanner;

public class FindSmallNumber{
 
  static Scanner keyboard = new Scanner(System.in);
  static int[] numberArray = new int[15];
  
  static int counter = 0;
  static int value = 0;
  static int smallestNum = 0;
  
  public static void main(String args[]){
  
      System.out.println("Enter as many as 5 numbers. Type -1 to stop");
      
      while (counter < 5 && value != -1){
        value = keyboard.nextInt();
        keyboard.nextLine();
        
        
        
        if(value != -1){
        numberArray[counter] = value;
       
        
        counter++;
        }
      }
      
      if(counter==0){
        System.out.println("you have not entered any numbers");
      }else{
    	  
      	smallestNum = numberArray[0];
        for(int i = 1;i< counter;i++){
          if(numberArray[i] < smallestNum){
            smallestNum = numberArray[i];
          }
        }
        System.out.println("The smallest number in array is "+smallestNum);
      }
      
      
  }
  
  
}

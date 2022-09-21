//1. Read a single Digit Number and write in word
package com.bridgelabs.problemday2;

import java.util.Scanner;

public class Day2_1 {
	 public static void main(String[] args) {
		 int number;
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" Enter the single digit number 0 -9 : ");
		 number = scan.nextInt();
		 
		 if (number <= 9) {
			 if (number == 1 )
				 System.out.println(number + " in word = one ");
			 else if(number == 2)
			 System.out.println(number + " in word = Two ");
			 else if(number == 3)
				 System.out.println(number + " in word = Three ");
			 else if(number == 4)
				 System.out.println(number + " in word = Four ");
			 else if(number == 5)
				 System.out.println(number + " in word = Five ");
			 else if(number == 6)
				 System.out.println(number + " in word = Six ");
			 else if(number == 7)
				 System.out.println(number + " in word = Seven ");
			 else if(number == 8)
				 System.out.println(number + " in word = Eight ");
			 else if(number == 9)
				 System.out.println(number + " in word = Nine ");
			 else if(number == 0)
				 System.out.println(number + " in word = Zero ");
	}else {
		System.out.println("Invalid number");
		System.out.println(" enter single digit number");
	}
 
 	

}
 
}

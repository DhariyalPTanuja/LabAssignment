//3. Write a Program to find Palindrome Number
package com.bridgelabs.problemday2;

import java.util.Scanner;

public class Day2_7 {
	public static void main(String[] args) {
		try (Scanner scanobj = new Scanner(System.in)) {
			System.out.println("Enter the  number = ");
			  
			  int number = scanobj.nextInt();
			  int plandromNum = number;
			   int reverseNum =0;
			   for (; number!=0; number/=10) {
				   int r = number%10;
					  reverseNum = reverseNum*10 + r;
					
			   }
			  
			   if (reverseNum == plandromNum) {
				   System.out.println(plandromNum + " is plandrom");
			   }
			   else
				   System.out.println(plandromNum + " is not plandrom" );
}
}
}
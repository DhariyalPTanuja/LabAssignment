//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package com.bridgelabs.problemday2;

import java.util.Scanner;

public class Day2_6 {
	public static void main(String[] args) {
		try (Scanner scanobj = new Scanner(System.in)) {
			System.out.println("Enter the  number = ");
			  
			  int number = scanobj.nextInt();
			   int reverseNum =0;
			   for (; number!=0; number/=10) {
				   int r = number%10;
					  reverseNum = reverseNum*10 + r;
					
			   }
			  
			   System.out.println(" the reverse number = " + reverseNum);
		}
	}
}

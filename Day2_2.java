//2. Read a Number 1,10,100,1000 and display unit, ten hundred

package com.bridgelabs.problemday2;
import java.util.Scanner;

public class Day2_2 {
public static void main(String[] args) {
	int number;
	Scanner readObj = new Scanner(System.in);
	
	System.out.println("Enter the number =");
	number = readObj.nextInt();
	int length = String.valueOf(number).length();
	
	if (length != 0) {
		int unit = number % 10^1;
		int ten = number % 10^2;
		System.out.println( number + " is single digit number ");
		System.out.println("unit place of the number is : " + unit);
	}

	
	
}
}

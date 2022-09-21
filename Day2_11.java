//2. Write a program SpringSeason.java that takes two int values m and d from the user input and
//prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
package com.bridgelabs.problemday2;

import java.util.Scanner;

public class Day2_11 {
	
public static void main(String[] args) {
	Scanner scanobj =new Scanner(System.in);
	System.out.println("Enter the month (1 - 12) " );
	int m = scanobj.nextInt();
	System.out.println("Enter the day(1 - 31) " );
	int d = scanobj.nextInt();
	boolean season = false;
	
	if(d <= 31 && m <=12) {
		if ((m == 3 && d >=20 && d<=31)||(m == 4 && d >=1 && d<=30)||(m == 5 && d >=1 && d<=31)||(m==6 && d <=20 && d>=1)){
			season =true;
		}
		else 
			season = false;
	
	
	 if (season ==true)
		 System.out.println(" yes its a Spring season");
	 else
		 System.out.println("Not a Spring season");
	}
	 else 
			System.out.println("invalid date & month ");
			
	
}
}

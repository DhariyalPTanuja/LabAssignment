//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

package com.bridgelabs.problemsday1;

import java.util.Scanner;

public class Day1_7 {
	public static int year;
	public int leapyear;

	public static void main(String[] args) {
		boolean leap = false;
		try (Scanner inputObj = new Scanner(System.in)) {
			System.out.println("enter the year = ");
			year = inputObj.nextInt();
		}
		System.out.println("check the enter year is Leap Year or not:::");

		if (year >= 1582) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						leap = true;
					else
						leap = false;
				} else
					leap = true;
			} else {
				leap = false;

			}

		}
		if (year >= 1582) {
			if (leap) {
				System.out.println(year + " is leap year");
			} else
				System.out.println(year + " is not a leap year ");
		} else
			System.out.println("enter valid year greater than 1582");
	}

}

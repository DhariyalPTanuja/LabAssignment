//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package com.bridgelabs.problemday2;
import java.util.Scanner;

public class Day2_3 {
public static void main(String[] args) {
	 Scanner scanobj =new Scanner(System.in);
	  System.out.println("Enter the natural number = ");
	  int n = scanobj.nextInt();
	  int i =1;
	  int sum = 0;
	  while (i<=n) {
		  sum = sum + i ;
		  i++;
	  }System.out.println("sum of the " + n + " natural number = " +sum);
	
}
}

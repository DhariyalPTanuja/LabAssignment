//3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
package com.bridgelabs.problemday2;

import java.util.Scanner;



public class Day2_12 {
public static void main(String[] args) {
	System.out.println("Quadratic Equation = a*x*x + b*x + c");
	Scanner scanobj = new Scanner(System.in);
	System.out.println("enter the value of a = ");
	int a = scanobj.nextInt();
	System.out.println("enter the value of b = ");
	int b = scanobj.nextInt();
	System.out.println("enter the value of c = ");
	int c = scanobj.nextInt();
	System.out.println(a+"*x*x + " + b + "*x + " +c);
	System.out.println("find the roots");
	int delta = b*b - 4*a*c;
	int root1 = (int) ((-b + Math.sqrt(delta))/(2*a));
	int root2 = (int) ((-b - Math.sqrt(delta))/(2*a));
	System.out.println("Root1 of X = " + root1);
	System.out.println("Root2 of X = " + root2);
	
			}

}

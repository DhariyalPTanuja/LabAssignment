//Line Comparison Computation UC1
package com.bridgelabs.problemday3;

import java.util.Scanner;

public class LineComparisonUC1 {
public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation");
	System.out.println("To model a line ");
	System.out.println("enter the co-ordinates of point P and point Q");
	Scanner scanobj = new Scanner(System.in);
	System.out.println("enter the point P cordinate ");
	int x1 = scanobj.nextInt();
	int y1 = scanobj.nextInt();
	System.out.println("Point P cordinatec (x ,y) = ( " + x1 + "," + y1 + " )" );
	System.out.println("enter the point Q cordinate ");
	int x2 = scanobj.nextInt();
	int y2 = scanobj.nextInt();
	System.out.println("Point Q cordinatec (x ,y) = ( " + x2 + "," + y2 + " )" );
	int length = (int) Math.sqrt(((x2-x1)^2) + ((y2-y1)^2));
	System.out.println(" line " + length);
			
}
}

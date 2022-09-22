package com.bridgelabs.problemday3;

import java.util.Scanner;

public class LineComparisonUc11 {
	
	public LineComparisonUc11() {
		getLineCordinate();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		
		LineComparisonUc11 obj1 = new LineComparisonUc11();
		
	}
	public static void getLineCordinate() {
		System.out.println("To  a line ");
		Scanner scanobj = new Scanner(System.in);
		System.out.println("enter the start and end  cordinate of Line l1: ");
		int x1 = scanobj.nextInt();
		int y1 = scanobj.nextInt();
		int x2 = scanobj.nextInt();
		int y2 = scanobj.nextInt();
		System.out.println("line l1 start cordinates (x1 ,y1 ) = ( " + x1 + "," + y1 + " )" );
		System.out.println("line l1  end cordinate (x2 ,y2) = ( " + x2 + "," + y2 + " )" );
		
		  int lineLength = calculateLineLength(x1,y1,x2,y2);
		System.out.println(" length of line: " + lineLength);

	}
	public static int calculateLineLength(int x1,int y1, int x2, int y2) {
		
		 int length = (int) Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1),2)) );
		return length;
	}
}

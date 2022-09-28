package com.bridgelabs.functionalProgram;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		TwoDArray obj = new TwoDArray();
		obj.userInput();
	}

	public void userInput() {
		PrintWriter writer = new PrintWriter(System.out,true);    
		Scanner scanobj = new Scanner(System.in);
		writer.println("enter the  two Dimensional array input");
		writer.println(" enter the value of rows & column :");
		int m = scanobj.nextInt();
		int n = scanobj.nextInt();
		int[][] twoDArray = new int[m][n];
		writer.println("enter the element of matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				twoDArray[i][j] = scanobj.nextInt();
				writer.println();
			}
		}
		writer.println("Two Dimensional array...");
		for (int i = 0; i < m; i++) {
			writer.println();
			for (int j = 0; j < n; j++) {
				writer.print(twoDArray[i][j] + "\t");
			}
		}
		 writer.flush();  
	      writer.close();  
		 

		
	}
}

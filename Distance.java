package com.bridgelabs.functionalProgram;

public class Distance {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		System.out.println("Co-ordinate of point x = " + x + " , y = " + y);
		double distance = Math.sqrt(x * x + y * y);
		System.out.println(
				"the Euclidean distance from the point (" + x + "," + y + ") to the origin (0, 0) = " + distance);

	}
}

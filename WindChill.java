package com.bridgelabs.functionalProgram;

//Write a program WindChill.java that takes two double command-line arguments t
//and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
//National Weather Service defines the effective temperature (the wind chill) to be:
//
//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
//than 120 or less than 3 (you may assume that the values you get are in that range).
public class WindChill {

	public static void main(String[] args) {

		int t = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		System.out.println(" temperature = " + t + " Fahrenheit");
		System.out.println(" wind speed= " + v + " miles/hour");
		double wind = calculateWindChill(t, v);
		System.out.println("effective temperature " +wind);
		// w = 35.74 + 0.6215*t +(0.42758 * t -35.75) v^0.16
	}

	static double calculateWindChill(int t, int v) {
		double w = 0;
		if (t > 50 && v > 120 && v < 3) {
			System.out.println("i and v range is out of range ");
		} else {
			w = 35.74 + 0.6215 * t + (0.42758 * t - 35.75) * (Math.pow(v, 0.16));
		}

		return w;
	}

}

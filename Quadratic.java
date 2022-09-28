package com.bridgelabs.functionalProgram;

import java.util.Scanner;

public class Quadratic {
	
	int a,b,c;
	public Quadratic() {
		setInput();
	}
	public static void main(String[] args) {
		
		Quadratic obj = new Quadratic();
	}
	public void setInput() {
		System.out.println("Quadratic Equation = a*x*x + b*x + c");
		Scanner scanobj = new Scanner(System.in);
		System.out.println("enter the value of a = ");
		a = scanobj.nextInt();
		System.out.println("enter the value of b = ");
		b = scanobj.nextInt();
		System.out.println("enter the value of c = ");
		c = scanobj.nextInt();
		System.out.println(a + "*x*x + " + b + "*x + " + c);
		calculateQuadraticEquationRoot(a,b,c);
	}
	public void calculateQuadraticEquationRoot(int x, int y, int z) {
		a = x; b = y; c = z;
		
	System.out.println("find the roots");
	double delta = b * b - 4.0 * a * c;
	if (delta >0.0) {
		double root1 =  ((-b + Math.pow(delta,0.5)) / (2 * a));
		double  root2 =  ((-b - Math.pow(delta,0.5)) / (2 * a));
		System.out.println("Root1  = " + root1 + "and Root2 = " +root2);
	}
	else if (delta == 0.0) {
		double root1 =  -b  / (2.0 *a);
		System.out.println("Root1  = " + root1);
	}
	else
		System.out.println("Roots are not real");
	}

}


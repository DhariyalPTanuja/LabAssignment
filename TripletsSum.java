package com.bridgelabs.functionalProgram;

import java.util.Scanner;

public class TripletsSum {

public static void main(String args[])
{
	Scanner scanobj =new Scanner(System.in);

System.out.println("Enter the number of integer :");
int size = scanobj.nextInt();

int[] arr = new int[size];
System.out.println("Enter the integers :");

for (int num = 0; num < size; num++) {
arr[num] = scanobj.nextInt();
}
int distinctCount = 0;

for (int i = 0; i < size - 2; i++)
for (int j = i + 1; j < size - 1; j++)
for (int k = j + 1; k < size; k++)

if ((arr[i] + arr[j] + arr[k]) == 0) {

distinctCount++;
System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");

}

System.out.println("Total distinct triples : " + distinctCount);
}
}

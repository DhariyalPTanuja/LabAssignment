//1. Write a Program to Check Vowel or Consonant
package com.bridgelabs.problemday2;
//switch case
import java.util.Scanner;
public class Day2_8 {
	public static void main(String[] args) {
		Scanner scanobj = new Scanner(System.in);
		System.out.println("Enter the character to check Vowel or Consonant");
			char ch;
			ch = scanobj.next().charAt(0);
			//case 1
			System.out.println("Case 1");
			switch(ch) {
			case 'a':
				System.out.println(ch + " is a vowel ");
				break;
			case 'e':
				System.out.println(ch + " is a vowel ");
				break;
			case 'i':
				System.out.println(ch + " is a vowel ");
				break;
			case 'o':
				System.out.println(ch + " is a vowel ");
				break;
			case 'A':
				System.out.println(ch + " is a vowel ");
				break;
			case 'E':
				System.out.println(ch + " is a vowel ");
				break;
			case 'I':
				System.out.println(ch + " is a vowel ");
				break;
			case 'O':
				System.out.println(ch + " is a vowel ");
				break;
			case 'U':
				System.out.println(ch + " is a vowel ");
				break;
			default:
				System.out.println(ch + " is a Consonant");
			}
			
		//case 2
			System.out.println("Case 2");
			boolean checkVowel=false;
			switch (ch) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' : 
			checkVowel =true;
			
			}
			if(checkVowel == true) {
				System.out.println( ch + " is a Vowel");
			}
			else {
				if ((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')) {
					System.out.println(ch + " is a Consonant");
				}
				else
					System.out.println("Input is not an alphabet");
			}
			
				 
		}
			
		
	}


package Sel_JavaPractise;

import java.util.Scanner;

// Write a function to reverse a number in Java?
public class InvertNumber {
	public static long invertNumber(long number) {
		long invert = 0;
		while (number != 0) {
			invert = (invert*10)+(number%10);
			number = number/10;
			System.out.println("Number = "+number+" Invert = "+invert);
		}
		return invert;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println("Inverted Number is : "+invertNumber(num));
		sc.close();
	}

}

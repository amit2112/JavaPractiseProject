package Sel_JavaPractise;

import java.util.Scanner;

// Write a method to check prime no. in Java?
public class CheckPrimeNumber {
	static int checkPrime = 0;

	public static void checkPrime(int num) {
		if (num <= 1) {
			checkPrime = 0;
			System.out.println("In if part");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					checkPrime = 1;
					System.out.println("In else part");
					break;
				}
			}

			if (checkPrime == 1) {
				System.out.println("Number " + num + " is prime");
			} else {
				System.out.println("Number " + num + " is not prime");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkPrime(num);
		sc.close();
	}
}

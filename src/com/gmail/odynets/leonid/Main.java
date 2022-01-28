package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int max = 0;

		System.out.println("Enter first number: ");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number: ");
		secondNumber = sc.nextInt();
		System.out.println("Enter third number: ");
		thirdNumber = sc.nextInt();
		System.out.println("Enter fourth number: ");
		fourthNumber = sc.nextInt();

		max = firstNumber;
		if (secondNumber > max) {
			max = secondNumber;
		}
		if (thirdNumber > max) {
			max = thirdNumber;
		}
		if (fourthNumber > max) {
			max = fourthNumber;
		}

		System.out.println("Max = " + max);

	}

}

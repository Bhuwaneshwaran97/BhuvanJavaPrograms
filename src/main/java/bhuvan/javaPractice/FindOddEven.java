package bhuvan.javaPractice;

import java.util.Scanner;

public class FindOddEven {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find out odd/even or not: ");
		int nextInt = sc.nextInt();

		if (nextInt % 2 == 0) {
			System.out.println(nextInt + " is an even number");
		} else {
			System.out.println(nextInt + " is an odd number");
		}

	}

}

package bhuvan.javaPractice;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int[] number = { 4, 5, 3, 8, 6, 7 };
		Arrays.sort(number);

		for (int num : number) {
			System.out.print(num + ",");
		}
		System.out.println(" The Second Smallest Number is " + number[1]);

	}

}

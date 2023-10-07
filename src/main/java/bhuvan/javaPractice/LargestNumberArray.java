package bhuvan.javaPractice;

import java.util.Arrays;

public class LargestNumberArray {

	public static void main(String[] args) {

		int[] number = { 4, 5, 3, 8, 6, 7 };
		int largest = number[0];
		Arrays.sort(number);

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}

		System.out.println(largest);
	}

}

package bhuvan.javaPractice;

import java.util.Arrays;

public class SmallestNumberArray {

	public static void main(String[] args) {

		int[] number = { 4, 5, 3, 8, 6, 7 };
		int smallest = number[0];
		Arrays.sort(number);

		for (int i = 0; i <= number.length; i++) {
			if (number[0] < smallest) {
				smallest = number[i];
			}
		}
		
		System.out.println(smallest);

	}

}

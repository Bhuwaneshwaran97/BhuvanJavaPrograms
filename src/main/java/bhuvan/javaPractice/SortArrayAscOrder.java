package bhuvan.javaPractice;

import java.util.Arrays;

public class SortArrayAscOrder {

	public static void main(String[] args) {

		int[] number = { 4, 5, 3, 8, 6, 7 };
		Arrays.sort(number);

		for (int num : number) {
			System.out.println(num);
		}

	}

}

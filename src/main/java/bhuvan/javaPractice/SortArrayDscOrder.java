package bhuvan.javaPractice;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDscOrder {
	
	public static void main(String[] args) {
		
		Integer number[] = { 4, 5, 3, 8, 6, 7 };
		Arrays.sort(number, Collections.reverseOrder());
		System.out.println(Arrays.toString(number));
	}

}

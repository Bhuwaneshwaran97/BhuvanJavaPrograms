package bhuvan.javaPractice;

public class FindNumberOfZeros {

	public static void main(String[] args) {

		int[] number = { 4, 0, 5, 3, 0, 8, 0, 6, 7 };
		int count = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == 0) {
				count += 1;
			}
		}

		System.out.println(count);

	}

}

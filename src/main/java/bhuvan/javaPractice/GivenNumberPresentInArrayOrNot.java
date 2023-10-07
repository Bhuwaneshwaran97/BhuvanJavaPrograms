package bhuvan.javaPractice;

public class GivenNumberPresentInArrayOrNot {

	public static void main(String[] args) {

		int[] Arraynumber = { 4, 5, 3, 8, 6, 7 };
		int givenNumber = 5;
		boolean isFound = false;

		for (int num : Arraynumber) {
			if (num == givenNumber) {
				isFound = true;
				break;
			}
		}
		
		if (isFound) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}

}

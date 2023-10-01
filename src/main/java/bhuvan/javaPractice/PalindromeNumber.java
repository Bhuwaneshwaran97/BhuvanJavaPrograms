package bhuvan.javaPractice;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 1234321;
		int orginalNumber = number;
		int reversedNumber =0;
		
		while (number > 0) {
			int digit = number%10;
			reversedNumber = reversedNumber * 10 + digit;
			number = number/10;
		}
		
		if (orginalNumber == reversedNumber) {
			System.out.println("The Number " + orginalNumber + " is a palindrome");
		} else {
			System.out.println("The Number " + orginalNumber + " is not a palindrome");
		}
			
	}

}

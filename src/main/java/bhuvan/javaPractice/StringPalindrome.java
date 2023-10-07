package bhuvan.javaPractice;

public class StringPalindrome {

	public static void main(String[] args) {

		String text = "Bhuvan", reversedText = "";
		char ch;
		boolean flag = false;

		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			reversedText = ch + reversedText;
			if (reversedText ==  text) {
				flag = true;
			}
		}
		
		if (flag = true) {
			System.out.println("It's a palindrome");
		} else {
			System.out.println("It's not a palindrome");
		}
	}

}

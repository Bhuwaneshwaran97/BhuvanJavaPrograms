package bhuvan.javaPractice;

public class ReverseTheString {

	public static void main(String[] args) {

		String text = "Bhuvan", reversedString = "";
		char ch;

		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			reversedString = ch + reversedString;
		}

		System.out.println(reversedString);
	}

}

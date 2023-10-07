package bhuvan.javaPractice;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String input = "A man, a plan, a canal: Panama", reversedString = "";
		String charRemovedString = input.toLowerCase().replaceAll("[^a-zA-Z0-9:]", "");
		String inputReadyString = charRemovedString.replaceAll(":", "");

		char ch;

		for (int i = 0; i < inputReadyString.length(); i++) {
			ch = inputReadyString.charAt(i);
			reversedString = ch + reversedString;
		}

		System.out.println(reversedString);

	}

}

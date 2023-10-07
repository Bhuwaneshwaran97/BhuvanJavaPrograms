package bhuvan.javaPractice;

public class ChangeCaseOfString {

	public static void main(String[] args) {

		char[] inputArray = { 'c', 'a', 'b' };
		char ch;

		for (int i = 0; i < inputArray.length; i++) {
			ch = inputArray[i];

			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);

			} else {
				ch = Character.toUpperCase(ch);
			}

			System.out.println(ch);
		}

	}

}

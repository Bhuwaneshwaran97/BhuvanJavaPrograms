package bhuvan.javaPractice;

public class FindOccuranceOfEachCharInString {

	public static void main(String[] args) {

		String str = "Bhuvan";
		int i, count[] = new int[256];
		int length = str.length();

		for (i = 0; i < length; i++) {
			count[(int) str.charAt(i)]++;
		}

		for (i = 0; i < 256; i++) {
			if (count[i] != 0) {
				System.out.println((char) i + "--> " + count[i]);
			}
		}
	}

}

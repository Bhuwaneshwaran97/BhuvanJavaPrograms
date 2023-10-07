package bhuvan.javaPractice;

public class FindOccuranceOfEachVowelsInString {

	public static void main(String[] args) {

		String str = "Bhuvan";
		int count[] = new int[256];
		String vowles = "aeiou";
		int length2 = vowles.length();
		int length = str.length();

		for (int i = 0; i < length; i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			for (int j = 0; j < length2; j++) {
				if(ch == vowles.charAt(j)) {
					count[(int) ch]++;
				}
			}
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				System.out.println((char) i + "--> " + count[i]);
			}
		}
	}

}

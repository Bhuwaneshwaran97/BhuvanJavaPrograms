package bhuvan.javaPractice;

public class FindSubString {

	public static boolean isSubStringPresent(String firstString, String secondString) {

		return firstString.contains(secondString);
	}

	public static void main(String[] args) {

		String firstString = "Bhuvan and Kamal are friends";
		String secondString = "Kamal";
		boolean isPresent = isSubStringPresent(firstString, secondString);

		if (isPresent) {
			System.out.println(secondString + " is present");
		} else {
			System.out.println(secondString + " is not present");
		}

	}

}

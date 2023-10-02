package bhuvan.javaPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int[] arrayNumber = {1,2,3,4,5,6,7};
		int[] reversedArray = new int[arrayNumber.length];
		
		for (int i =arrayNumber.length -1, j =0; i>=0; i--,j++) {
			reversedArray[j] = arrayNumber[i]; 
			
		}
		
		for (int num : reversedArray) {
			System.out.println(num);
		}

	}

}

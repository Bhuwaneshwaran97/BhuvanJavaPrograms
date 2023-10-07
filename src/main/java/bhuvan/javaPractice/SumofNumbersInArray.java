package bhuvan.javaPractice;

public class SumofNumbersInArray {

	public static void main(String[] args) {
		
		int[] number = { 4, 5, 3, 8, 6, 7 };
		int sum =0;
		
		for (int num : number) {
			sum += num;
		}
		
		System.out.println("The Sum of the Array is : "+sum);
	}

}

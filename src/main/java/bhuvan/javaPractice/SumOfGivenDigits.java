package bhuvan.javaPractice;

public class SumOfGivenDigits {
	
	
	public int Sum(int a, int b) {
		
		int sum = a +b;
		return sum;
	}

	public static void main(String[] args) {
		
		SumOfGivenDigits obj = new SumOfGivenDigits();
		int sum = obj.Sum(120, 230);
		System.out.println(sum);
		

	}

}

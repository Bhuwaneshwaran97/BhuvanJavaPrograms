package bhuvan.javaPractice;

public class FibonaaciNSeries {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3;

		boolean fibo = true;

		System.out.println(n1 + " " + n2);

		while (fibo) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

	}

}

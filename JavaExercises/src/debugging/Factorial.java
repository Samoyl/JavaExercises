package debugging;

public class Factorial {

	public static void main(String[] args) {
		int n = 20;
//		Changing int to Long to hold the value of n
		long factorial = 1;

		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}

}

package flowControls.LoopIteration;

import java.util.Scanner;

public class Product1ToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int product = 1;
		int n = input.nextInt();
		long computing = 1;
		for (; product <= n; product++) {
			computing = computing * product;
		}
		input.close();
		System.out.println(computing);
	}

}

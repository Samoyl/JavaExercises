package keyboardInput;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int number;
		double dNumber;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		number = sc.nextInt();
		System.out.print("Enter a floating point number: ");
		dNumber = sc.nextDouble();
		System.out.print("Enter Your name: ");
		name = sc.next();
		sc.close();
		double sum = dNumber + Double.valueOf(number);
		System.out.println("Hi! " + name + ", the sum of " + number + " and " + dNumber + " is " + sum);

	}

}

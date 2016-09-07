/**
 * Try if-else statement.
 * */
package flowControls.ConditionalDecision;

import java.util.Scanner;

//	Save the file as CheckPassFial.java
public class CheckPassFial {
	// Program entry point
	public static void main(String[] args) {
		// specify the Scanner input
		Scanner sc = new Scanner(System.in);
		// set the value of mark here
		System.out.println("Enter your number here :");
		int mark = sc.nextInt();

		System.out.println("The mark is " + mark);
		if (mark >= 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		sc.close();
		System.out.println("DONE");
	}

}

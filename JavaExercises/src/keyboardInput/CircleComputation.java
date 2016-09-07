package keyboardInput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		double radius;
		double area;
		double Circumference;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		while (radius >= 0) {
			area = Math.PI * (radius * radius);
			Circumference = (2 * radius) * Math.PI;
			System.out.println("The area is: " + df.format(area));
			System.out.println("The circumference is: " + df.format(Circumference) + "\n");
			System.out.print("Enter the radius: ");
			radius = input.nextDouble();
		}

		input.close();

	}

}

/*
 * Compute the sum and average of running numbers from a lowerbound to an upperbound using loop.
 */
package flowControls.LoopIteration;

//Save as "SumAndAverage.java"
public class SumAndAverage {

	public static void main(String[] args) {
		// Store the accumulated sum, init to 0
		int sum = 0;
		int squareSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		int sevenSum = 0;
		// The lowerBound to sum
		int lowerBound = 1;
		// The upperBound to sum
		int upperBound = 100;
		// count the number within the range, init to 0
		int count = 0;
		int oddCount = 0;
		int evenCount = 0;
		int sevenCount = 0;

		// Use a for-loop to sum from lowerBound to upperBound
		// for (; lowerBound <= upperBound; lowerBound++) {
		// // same as "sum = sum + number"
		// sum += lowerBound;
		// squareSum += (lowerBound * lowerBound);
		// ++count;
		// if ((lowerBound % 2) == 0) {
		// evenSum += lowerBound;
		// ++evenCount;
		// } else if ((lowerBound % 2) != 0) {
		// oddSum += lowerBound;
		// ++oddCount;
		// }
		// if ((lowerBound % 7) == 0) {
		// sevenSum += lowerBound;
		// ++sevenCount;
		// }
		// }

		// Modify the program to use a "while-do" loop instead of "for" loop.
		while (lowerBound <= upperBound) {
			sum += lowerBound;
			squareSum += (lowerBound * lowerBound);
			if ((lowerBound % 2) == 0) {
				evenSum += lowerBound;
				++evenCount;
			} else if ((lowerBound % 2) != 0) {
				oddSum += lowerBound;
				++oddCount;
			}

			if ((lowerBound % 7) == 0) {
				sevenSum += lowerBound;
				++sevenCount;
			}

			lowerBound++;
			++count;
		}

		// // Modify the program to use a "do-while" loop.
		// do {
		// sum += lowerBound;
		// squareSum += (lowerBound * lowerBound);
		//
		// if ((lowerBound % 2) == 0) {
		// evenSum += lowerBound;
		// ++evenCount;
		// } else if ((lowerBound % 2) != 0) {
		// oddSum += lowerBound;
		// ++oddCount;
		// }
		//
		// if ((lowerBound % 7) == 0) {
		// sevenSum += lowerBound;
		// ++sevenCount;
		// }
		//
		// lowerBound++;
		// ++count;
		// } while (lowerBound <= upperBound);

		// Compute average in double. Beware that int/int produces int.
		countAverage(sum, count);
		countSquaresAverage(squareSum, count);
		countOddAverage(oddSum, oddCount);
		countEvenAverage(evenSum, evenCount);
		countSevenAverage(sevenSum, sevenCount);

	}

	public static void countAverage(int sum, int count) {
		// average in double
		double average;
		average = Double.valueOf(sum) / Double.valueOf(count);
		// Print the sum of 1 to 100.
		System.out.println("The Sum is " + sum);
		// print the average of the sum.
		System.out.println("The Average is " + average);
		System.out.println();
	}

	public static void countSquaresAverage(int squareSum, int count) {
		// average in double
		double average;
		average = Double.valueOf(squareSum) / Double.valueOf(count);
		// Print the sum of 1 to 100.
		System.out.println("The Sum of square numbers is " + squareSum);
		// print the average of the sum.
		System.out.println("The Average of square numbers is " + average);
		System.out.println();
	}

	public static void countOddAverage(int oddSum, int oddCount) {
		// average in double
		double oddAverage;
		oddAverage = Double.valueOf(oddSum) / Double.valueOf(oddCount);
		// Print the sum of 1 to 100.
		System.out.println("The Sum of Odd numbers is " + oddSum);
		// print the average of the sum.
		System.out.println("The Average of Odd number is " + oddAverage);
		System.out.println();
	}

	public static void countEvenAverage(int evenSum, int evenCount) {
		// average in double
		double evenAverage;
		evenAverage = Double.valueOf(evenSum) / Double.valueOf(evenCount);
		// Print the sum of 1 to 100.
		System.out.println("The Sum of Event numbers is " + evenSum);
		// print the average of the sum.
		System.out.println("The Average of Event numbers is " + evenAverage);
		System.out.println();
	}

	public static void countSevenAverage(int sevenSum, int sevenCount) {
		// average in double
		double sevenAverage;
		sevenAverage = Double.valueOf(sevenSum) / Double.valueOf(sevenCount);
		// Print the sum of 1 to 100.
		System.out.println("The Sum of numbers divided by seven is " + sevenSum);
		// print the average of the sum.
		System.out.println("The Average of numbers divided by seven is " + sevenAverage);
		System.out.println();
	}

}

package flowControls.LoopIteration;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 3;		
		int nMax = 20;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int sum = fnMinus1 + fnMinus2;
		double average;
		System.out.println("The first " + nMax + " Fibonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			System.out.print(fn + " ");
			fnMinus1 = fnMinus2;
			fnMinus2 = fn;
			sum = sum + fn;
			n++;
		}
		average = Double.valueOf(sum) / Double.valueOf(nMax);
		System.out.println("\n" + "The average is " + average);
	}
}

package flowControls.LoopIteration;

public class Tribonacci {

	public static void main(String[] args) {
		int n = 4;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int fnMinus3 = 2;
		int fn;
		int sum = fnMinus1 + fnMinus2 + fnMinus3;
		double average;
		System.out.println("The first 20 Tribonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
		for (; n <= 20; ++n) {
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			System.out.print(fn + " ");
			fnMinus1 = fnMinus2;
			fnMinus2 = fnMinus3;
			fnMinus3 = fn;
			sum += fn;
		}
		average = Double.valueOf(sum) / 20;
		System.out.println("\n" + "The average is " + average);
	}

}

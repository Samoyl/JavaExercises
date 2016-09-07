package flowControls.LoopIteration;

public class ComputePI {

	public static void main(String[] args) {
		double sum = 0.0;
		int maxDenominator = 10000000;
		for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
			int one = denominator % 4;
			if (one == 1) {
				sum += (1 / Double.valueOf(denominator));
			} else if (one == 3) {
				sum -= (1 / Double.valueOf(denominator));
			} else {
				System.out.println("The computer has goen Crazy?!");
			}
		}
		System.out.println(4 * sum);
	}

}

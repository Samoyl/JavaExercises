package flowControls.LoopIteration;

public class CozaLozaWoza {

	public static void main(String[] args) {
		int lowerBound = 1;
		int upperBound = 110;
		for (int number = lowerBound; number <= upperBound; ++number) {
			boolean goza = (number % 3 == 0);
			boolean loza = (number % 5 == 0);
			boolean woza = (number % 7 == 0);
			// print Goza if number is divisible by 3
			if (goza && !(loza || woza)) {
				System.out.print("Goza");
			}
			// print Loza if number is divisible by 5
			else if (loza && !(goza || woza)) {
				System.out.print("Loza");
			}
			// print Woza if number is divisible by 7
			else if (woza && !(goza || loza)) {
				System.out.print("Woza");
			}
			// print GozaLoza if number is divisible by 3 and 5
			else if (goza && loza) {
				System.out.print("GozaLoza");
			}
			// print GozaLoza if number is divisible by 3 and 7
			else if (goza && woza) {
				System.out.print("GozaWoza");
			}
			// print GozaLoza if number is divisible by 5 and 7
			else if (loza && woza) {
				System.out.print("LozaGoza");
			} else {
				System.out.print(number);
			}

			if (number % 11 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}

		}
	}

}

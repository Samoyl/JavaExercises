package flowControls.LoopIteration;

public class CozaLozaWoza2 {

	public static void main(String[] args) {
		for (int number = 1; number <= 110; ++number) {
			boolean goza = (number % 3 == 0);
			boolean loza = (number % 5 == 0);
			boolean woza = (number % 7 == 0);
			boolean printed = false;
			// print Goza if number is divisible by 3
			if (goza && !(loza || woza)) {
				System.out.print("Goza");
				printed= true;
			}
			// print Loza if number is divisible by 5
			if (loza && !(goza || woza)) {
				System.out.print("Loza");
				printed= true;
			}
			// print Woza if number is divisible by 7
			if (woza && !(goza || loza)) {
				System.out.print("Woza");
				printed= true;
			}
			// print GozaLoza if number is divisible by 3 and 5
			if (goza && loza) {
				System.out.print("GozaLoza");
				printed= true;
			}
			// print GozaLoza if number is divisible by 3 and 7
			if (goza && woza) {
				System.out.print("GozaWoza");
				printed= true;
			}
			// print GozaLoza if number is divisible by 5 and 7
			if (loza && woza) {
				System.out.print("LozaGoza");
				printed= true;
			}
			if (!printed) {
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

package flowControls.NestedLoop;

public class PrintPattern {

	public static void main(String[] args) {
		U2D();
		R2L();
		L2R();
		D2U();		
		SquareParttner();
		ZetParttner();
		ZetParttner2();
		ex();
		squareEx();
	}

	public static void U2D() {
		for (int i = 1; i <= 7; i++) {
			int n = 0;
			while (n < i) {
				System.out.print("#");
				++n;
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void D2U() {
		for (int i = 1; i <= 7; i++) {
			int n = 7;
			while (n >= i) {
				System.out.print("#");
				n--;
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void L2R() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1) {
					System.out.print("#");
				} else {
					System.out.print("#");
				}
			}

			System.out.println();
		}
		System.out.println();
	}

	public static void R2L() {
		for (int i = 1; i <= 7; i++) {
			for (int k = 1; k <= i; k++) {
				if (k == 1) {
					System.out.print("");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 7; j >= i; j--) {
				if (j == 7) {
					System.out.print("#");
				} else {
					System.out.print("#");
				}
			}

			System.out.println();
		}
		System.out.println();
	}

	public static void SquareParttner() {
		for (int i = 0; i < 7; i++) {
			if (i == 0 || i == 6) {
				for (int j = 0; j < 7; j++) {
					System.out.print("#");
				}
			} else {
				for (int j = 0; j < 7; j++) {
					if (j == 0 || j == 6) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void ZetParttner() {
		for (int i = 0; i < 7; i++) {
			if (i == 0 || i == 6) {
				for (int j = 0; j < 7; j++) {
					System.out.print("#");
				}
			} else {
				for (int j = 0; j <= i; j++) {
					if (j == i)
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void ZetParttner2() {
		for (int i = 1; i <= 7; i++) {
			if (i == 1 || i == 7) {
				for (int j = 1; j <= 7; j++) {
					System.out.print("#");
				}
			} else {
				for (int j = 7; j >= i; j--) {
					if (j == i)
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void ex() {
		for (int i = 0; i < 7; i++) {
			if (i == 0 || i == 6) {
				for (int j = 0; j < 7; j++) {
					System.out.print("#");
				}
			} else {
				for (int j = 0; j < 7; j++) {
					if (j == i || ((j+i) == 6))
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}

			System.out.println();
		}
		System.out.println();
	}
	
	public static void squareEx() {
		for (int i = 0; i < 7; i++) {
			if (i == 0 || i == 6) {
				for (int j = 0; j < 7; j++) {
					System.out.print("#");
				}
			} else {
				for (int j = 0; j < 7; j++) {
					if (j == i || ((j+i) == 6) || j == 0 || j == 6)
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}

			System.out.println();
		}
		System.out.println();
	}
}

package flowControls.NestedLoop;

public class TimeTable {

	
	public static void main(String[] args) {
		int i, j;
		System.out.println("* |  1  2  3  4  5  6  7  8  9");
		System.out.println("-------------------------------");
		
		for (i = 1; i <= 9; i++) {
			System.out.print(i + " |");
			for (j = 1; j <= 9; j++) {
				int sum = (j * i);
				
				if(sum > 0 && sum < 10){
					System.out.print("  ");
				}else {
					System.out.print(" ");
				}
				System.out.print(sum);
			}
			System.out.println();
		}
	}
}

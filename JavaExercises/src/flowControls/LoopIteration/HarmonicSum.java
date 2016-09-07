package flowControls.LoopIteration;

public class HarmonicSum {

	public static void main(String[] args) {
		int maxDenominator = 50000;  // Use a more meaningful name instead of n
	      double sumL2R = 0.0;    // sum from left-to-right
	      double sumR2L = 0.0;    // sum from right-to-left
	      // for-loop for summing from left-to-right
	      for (int denominator = 1; denominator <= maxDenominator; denominator++) {
	          sumL2R = sumL2R + (1/Double.valueOf(denominator));
	      }
	      System.out.println("The sum from left-to-right is: " + sumL2R);

	      // for-loop for summing from right-to-left
	      for (int denominator = maxDenominator; denominator > 0; --denominator) {
	          sumR2L += (1/Double.valueOf(denominator));
	          
	      }
	      System.out.println("The sum from right-to-left is: " + sumR2L);

	      // Find the difference and display
	      if(sumR2L > sumL2R){
	    	  System.out.println("Left to right is bigger by: " + (sumR2L - sumL2R));
	      } else if(sumL2R > sumR2L){
	    	  System.out.println("right to left is bigger by: " + (sumL2R -sumR2L));
	      } else {
	    	  System.out.println("Both of sides are equals");
	      }
	   }

}

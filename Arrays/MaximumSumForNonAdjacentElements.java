package Arrays;

public class MaximumSumForNonAdjacentElements {

	public static void main(String[] args) {
		int[] array = {5,5,10,40,50,35};
		
		FindMaxSum(array);

	}

	private static void FindMaxSum(int[] array) {
		int exc = 0;
		int inc = array[0];
		
		for(int i=1; i<array.length; i++){
			int temp = inc;
			inc = array[i] + exc;
			exc = Math.max(temp, exc);
			
		}
		
		System.out.println("Maximum sum is " + inc);
	}

}

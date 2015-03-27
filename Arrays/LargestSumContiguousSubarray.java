package Arrays;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int[] array = {-2,-3,4,-1,-2,1,5,-3};
		
		FindMaxSum(array);
	}
	
	public static void FindMaxSum(int[] array){
		int MaxSum = 0;
		int VariableSum = 0;
		
		for(int a : array){
			VariableSum = VariableSum + a;
			if (VariableSum < 0){
				VariableSum = 0;
			}
			if (MaxSum < VariableSum){
				MaxSum = VariableSum;
			}
		}
		
		System.out.println("Maximum sum is: " + MaxSum);
	}
}

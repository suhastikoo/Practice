package Arrays;

public class SumClosestToZero {

	public static void main(String[] args) {
		int[] array = {1,-1,-10,70,-80,85,-86};
		
		FindConsecutiveNumbers(array);

	}
	
	public static void FindConsecutiveNumbers(int[] array){
		int num1 = array[0];
		int temp1=num1;
		int num2 = array[1];
		int temp2=num2;
		int sum = num1+num2;
		
		for(int i=1; i<array.length-1; i++){
			num1 = array[i];
			num2 = array[i+1];
			//int temp = num1+num2;
			if(Math.abs(num1+num2-0)<Math.abs(sum-0)){
				temp1 = num1;
				temp2 = num2;
				sum = temp1+temp2;
				
			}
		}
		
		System.out.println("Two Numbers Found!!! " + temp1 + " " + temp2);
	}

}

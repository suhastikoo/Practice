package Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 6, 3, 7, 8};
		
		int n = 8;
		
		int sum = (n*(n+1))/2;
		System.out.println(sum);
		
		for(int a : array){
			sum = sum - a;
		}
		
		System.out.println("Missing number is: " + sum);

	}

}
